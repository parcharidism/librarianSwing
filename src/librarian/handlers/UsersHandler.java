package librarian.handlers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import librarian.utils.DBconnect;
import librarian.utils.Hash;
import librarian.utils.User;
import java.sql.Connection;

/**
 * Οι DBhandlers μιλούν με τη βάση δεδομένων για όλες τις εντολές DDL και DML Το
 * ιδανικό θα ήταν να προετοίμαζαν και το αντικείμενο της Java πχ Array και να
 * το επέστρεφαω απευθείας στο GUI. Δυστυχώς δεν υπάρχει χρόνος για κάτι τέτοιο
 * λόγω φόρτου άλλων εργασιών, οικογένειας και δουλειάς
 *
 * @author Miltiadis Parcharidis
 */
public class UsersHandler {

    public static ResultSet loginUser(String username, String password) throws SQLException {

        CallableStatement cstmt = null;
        ResultSet rs = null;
        String passwd = Hash.getHashedString(password);
        Connection conn = DBconnect.getConnection();

        if (conn != null) {
            cstmt = conn.prepareCall("{call loginuser(?,?,?)}");
            cstmt.setString(1, username);
            cstmt.setString(2, passwd);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(3);
        } else {
            throw new SQLException();
        }
        return rs;
    }

    public static boolean insertUser(String nameTxt,
            String surnameTxt,
            int roleCombo,
            String usernameTxt,
            String passwordTxt,
            String mailTxt,
            String notesTxt) {

        CallableStatement cstmt = null;
        String passwd = Hash.getHashedString(passwordTxt);
        int rowsInserted = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call insertuser(?,?,?,?,?,?,?)}");
            cstmt.setString(1, nameTxt);
            cstmt.setString(2, surnameTxt);
            cstmt.setInt(3, roleCombo);
            cstmt.setString(4, usernameTxt);
            cstmt.setString(5, passwd);
            cstmt.setString(6, mailTxt);
            cstmt.setString(7, notesTxt);

            rowsInserted = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsInserted == 1;
    }

    public static boolean updateUser(int id,
            String nameTxt,
            String surnameTxt,
            int roleCombo,
            String mailTxt,
            int active,
            String notesTxt) {

        CallableStatement cstmt = null;
        int rowsUpdated = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call updateuser(?,?,?,?,?,?,?)}");
            cstmt.setInt(1, id);
            cstmt.setString(2, nameTxt);
            cstmt.setString(3, surnameTxt);
            cstmt.setInt(4, roleCombo);
            cstmt.setString(5, mailTxt);
            cstmt.setInt(6, active);
            cstmt.setString(7, notesTxt);

            rowsUpdated = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated == 1;
    }

    /**
     *
     * @param userID
     * @param searchCat
     * @param searchTerm
     * @return εάν οριστεί userID τότε επιστρέφεται ο συγκεκριμένος χρήστης, εάν
     * οριστεί το 0 ως userID με κατηγορία αναζήτησης to -1 τότε επιστρέφονται
     * όλοι οι χρήστες, εάν οριστεί το 0 ως userID και η κατηγορία οριστεί με
     * τιμή τότε επιστρέφονται οι χρήστες με τις παραμέτρους
     *
     */
    public static ResultSet selectUser(int userID, int searchCat, String searchTerm) {

        ResultSet rs = null;
        CallableStatement cstmt = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectuser(?,?,?,?)}");
            if (userID == 0) { // 0 and -1 selects all users
                cstmt.setInt(1, 0);
                if (searchCat > 0) {
                    cstmt.setInt(2, searchCat);
                    cstmt.setString(3, searchTerm);
                } else {
                    cstmt.setInt(2, -1);
                    cstmt.setString(3, null); // δεν έχει σημασία
                }
            } else {
                cstmt.setInt(1, userID);
                cstmt.setInt(2, -1); // δεν έχουν σημασία
                cstmt.setString(3, null);// δεν έχουν σημασία
            }

            cstmt.registerOutParameter(4, OracleTypes.CURSOR);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(4);

        } catch (SQLException ex) {
            Logger.getLogger(UsersHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public static boolean deleteUser(int id) {

        CallableStatement cstmt = null;
        int rowsUpdated = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call deleteuser(?)}");
            cstmt.setInt(1, id);
            rowsUpdated = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated == 1;
    }

    public static String dateToString(Date date) {
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

}
