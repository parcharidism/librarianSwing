package librarian.handlers;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import librarian.utils.DBconnect;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Miltiadis Parcharidis 011873
 */
public class AuthorsHandler {

    public static boolean insertAuthor(String nameTxt, String surnameTxt, String countryTxt, String bioTxt) {
        CallableStatement cstmt = null;
        int rowsInserted = -1;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call insertauthor(?,?,?,?)}");
            cstmt.setString(1, nameTxt);
            cstmt.setString(2, surnameTxt);
            cstmt.setString(3, countryTxt);
            cstmt.setString(4, bioTxt);

            rowsInserted = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorsHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsInserted == 1;
    }

    public static ResultSet selectAuthors(int authorID, int searchCat, String searchTerm) {
        ResultSet rs = null;
        CallableStatement cstmt = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectauthors(?,?,?,?)}");
            if (authorID == 0) { // 0 and -1 selects all authors
                cstmt.setInt(1, 0);
                if (searchCat > 0) {
                    cstmt.setInt(2, searchCat);
                    cstmt.setString(3, searchTerm);
                } else {
                    cstmt.setInt(2, -1);
                    cstmt.setString(3, null); // δεν έχει σημασία
                }
            } else {
                cstmt.setInt(1, authorID);
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
}
