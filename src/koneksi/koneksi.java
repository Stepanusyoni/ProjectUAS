/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
     private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            new Driver();

            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_inputdata", "root", "");
        }
        return koneksi;
}
}
