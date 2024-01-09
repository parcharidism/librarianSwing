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
public class PublHouseHandler {

    public static ResultSet selectPublHouses() {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        try {
            cstmt = DBconnect.getConnection().prepareCall("{call selectpubhouses(?)}");
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);
        } catch (SQLException ex) {
            Logger.getLogger(PublHouseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }
}
