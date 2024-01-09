package librarian.handlers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import librarian.utils.DBconnect;
import oracle.jdbc.OracleTypes;

/**
 * Οι DBhandlers μιλούν με τη βάση δεδομένων για όλες τις εντολές DDL και DML Το
 * ιδανικό θα ήταν να προετοίμαζαν και το αντικείμενο της Java πχ Array και να
 * το επέστρεφαω απευθείας στο GUI. Δυστυχώς δεν υπάρχει χρόνος για κάτι τέτοιο
 * λόγω φόρτου άλλων εργασιών, οικογένειας και δουλειάς
 *
 * @author Miltiadis Parcharidis 011873
 */
public class ReturnHandler {

    public static boolean returnBook(int userID, int bookID) {
        CallableStatement cstmt = null;
        int rowsUpdated = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call returnbook(?,?)}");
            cstmt.setInt(1, userID);
            cstmt.setInt(2, bookID);

            rowsUpdated = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated == 1;
    }

    public static boolean returnBookFromDeletedUser(int userID) {
        CallableStatement cstmt = null;
        int rowsUpdated = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call return_book_from_deleted_user(?)}");
            cstmt.setInt(1, userID);

            rowsUpdated = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated == 1;
    }

    public static int calculatePrice(String date, int bookID) {
        CallableStatement cstmt = null;
        ResultSet rs = null;
        int price = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call calculate_lending(?,?,?,?,?,?,?)}");
            cstmt.setString(1, date);
            cstmt.setInt(2, bookID);
            cstmt.registerOutParameter(3, OracleTypes.INTEGER);
            cstmt.registerOutParameter(4, OracleTypes.INTEGER);
            cstmt.registerOutParameter(5, OracleTypes.INTEGER);
            cstmt.registerOutParameter(6, OracleTypes.INTEGER);
            cstmt.registerOutParameter(7, OracleTypes.INTEGER);

            cstmt.execute();
            price = cstmt.getInt(3);

        } catch (SQLException ex) {
            Logger.getLogger(ReturnHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return price;
    }
}
