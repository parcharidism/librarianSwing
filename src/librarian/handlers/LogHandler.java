package librarian.handlers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class LogHandler {

    public static ResultSet selectLog() {

        ResultSet rs = null;
        CallableStatement cstmt = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectlog(?)}");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);

        } catch (SQLException ex) {
            Logger.getLogger(LogHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static void insertActivityLog(String logEntry) {
        CallableStatement cstmt = null;
        try {
            cstmt = DBconnect.getConnection().prepareCall("{call insertlog(?)}");
            cstmt.setString(1, logEntry);
            cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
