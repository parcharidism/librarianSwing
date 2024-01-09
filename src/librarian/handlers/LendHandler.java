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
public class LendHandler {

    public static ResultSet selectLendCategories() {
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectlendcat(?)}");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);
        } catch (SQLException ex) {
            Logger.getLogger(LendHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static boolean insertBookLending(int userID, int bookID) {
        CallableStatement cstmt = null;
        int rowsInserted = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call insert_book_lending(?,?)}");
            cstmt.setInt(1, userID);
            cstmt.setInt(2, bookID);

            rowsInserted = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LendHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsInserted == 1;
    }
}
