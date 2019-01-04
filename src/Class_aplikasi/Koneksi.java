/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_aplikasi;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Aganinggar
 */
public class Koneksi {
    public static Connection setKoneksi (){
    String konString = "jdbc:mysql://nama lokasi/nama database";
    Connection koneksi = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        koneksi = (Connection)
    DriverManager.getConnection (konString,"usernmysql","passmysql");
        System.out.println("koneksi berhasil");
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(nama database.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("koneksi gagal");
    } catch (SQLException ex) {
    Logger.getLogger(nama database.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("koneksi gagal");
    }
    return koneksi;
    }
    
    public static int execute (String SQL) {
    int status = 0;
    Connection koneksi = setKoneksi();
    try {
        statement st = koneksi.createStatement();
        status = st.executeUpdate(SQL);
    }catch (SQLException ex) {
    Logger.getLogger(nama database.class.getName()).log(Level.SEVERE, null, ex);
    }
    return status;
    }
    
    public static ResultSet executeQuery (String SQL) {
    ResultSet rs = null;
    Connection koneksi = setKoneksi();
    try {
        statement st = koneksi.createStatement();
        rs = st.executeQuery(SQL);
    }catch (SQLException ex) {
    Logger.getLogger(nama database.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    } 
}
