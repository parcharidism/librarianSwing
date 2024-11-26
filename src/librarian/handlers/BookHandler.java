package librarian.handlers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import librarian.utils.DBconnect;

/**
 * Οι DBhandlers μιλούν με τη βάση δεδομένων για όλες τις εντολές DDL και DML Το
 * ιδανικό θα ήταν να προετοίμαζαν και το αντικείμενο της Java πχ Array και να
 * το επέστρεφαω απευθείας στο GUI. Δυστυχώς δεν υπάρχει χρόνος για κάτι τέτοιο
 * λόγω φόρτου άλλων εργασιών, οικογένειας και δουλειάς
 *
 * @author Miltiadis Parcharidis 011873
 */
public class BookHandler {

    public static ResultSet selectBookCategories() {

        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectbookcat(?)}");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);
        } catch (SQLException ex) {
            Logger.getLogger(BookHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static boolean insertBook(String titleTxt, int bookCatCombo,
            int authors[], String publDateTxt, int publHouseCombo, int lendCatCombo,
            String isbnTxt, int stockTxt) {

        CallableStatement cstmt = null;
        int rowsInserted = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call insertbook(?,?,?,?,?,?,?,?,?,?,?)}");

            cstmt.registerOutParameter(1, Types.INTEGER);
            cstmt.setString(2, titleTxt);
            cstmt.setInt(3, bookCatCombo);
            int newAuthors[] = new int[3];

            if (authors.length <= 3) {
                switch (authors.length) {
                    case 1:
                        newAuthors[0] = authors[0];
                        newAuthors[1] = 0; // stored procedure will handle this
                        newAuthors[2] = 0;
                        break;
                    case 2:
                        newAuthors[0] = authors[0];
                        newAuthors[1] = authors[1];
                        newAuthors[2] = 0;
                        break;
                    case 3:
                        newAuthors = authors;
                        break;
                }
            } else {
                newAuthors = firstThreeAuthors(authors);
            }

            cstmt.setInt(4, newAuthors[0]);
            cstmt.setInt(5, newAuthors[1]);
            cstmt.setInt(6, newAuthors[2]);

            cstmt.setString(7, publDateTxt);
            cstmt.setInt(8, publHouseCombo);
            cstmt.setInt(9, lendCatCombo);
            cstmt.setString(10, isbnTxt);
            cstmt.setInt(11, stockTxt);

            rowsInserted = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorsHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsInserted == 1;
    }

    public static ResultSet selectBooks(int bookId) {

        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call SELECTBOOK(?,?)}");
            if (bookId == 0) {
                cstmt.setInt(1, 0);
            } else {
                cstmt.setInt(1, bookId);
            }
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(2);
        } catch (SQLException ex) {
            Logger.getLogger(BookHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static ResultSet selectBooksByUser(int userid) {

        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectbooks_by_user(?,?)}");
            cstmt.setInt(1, userid);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(2);
        } catch (SQLException ex) {
            Logger.getLogger(BookHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    private static int[] firstThreeAuthors(int authors[]) {
        int newAuthors[] = new int[3];

        for (int i = 0; i < 3; i++) {
            newAuthors[i] = authors[i];
        }
        return newAuthors;
    }

    public static ResultSet selectBooksDetail(int searchCat, String searchTerm) {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectbooksearch(?,?,?)}");
            cstmt.setInt(1, searchCat);
            cstmt.setString(2, searchTerm);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(3);
        } catch (SQLException ex) {
            Logger.getLogger(BookHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    /*
    @ Only shows books that have available stock to lend
    Used mainly in Quick Lend
     */
    public static ResultSet selectBooksWithStock(int searchCat, String searchTerm) {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectbookswithstock(?,?,?)}");
            cstmt.setInt(1, searchCat);
            cstmt.setString(2, searchTerm);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(3);
        } catch (SQLException ex) {
            Logger.getLogger(BookHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static boolean updateBook(int bookID, String titleTxt, int bookCatCombo,
            String publDateTxt, int publHouseCombo, int lendCatCombo,
            String isbnTxt, int stockTxt) {

        CallableStatement cstmt = null;
        int rowsUpdated = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call updatebook(?,?,?,?,?,?,?,?)}");

            cstmt.setInt(1, bookID);
            cstmt.setString(2, titleTxt);
            cstmt.setInt(3, bookCatCombo);
            cstmt.setString(4, publDateTxt);
            cstmt.setInt(5, publHouseCombo);
            cstmt.setInt(6, lendCatCombo);
            cstmt.setString(7, isbnTxt);
            cstmt.setInt(8, stockTxt);

            rowsUpdated = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorsHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated == 1;
    }

}
