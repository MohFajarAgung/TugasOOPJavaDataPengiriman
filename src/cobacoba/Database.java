/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobacoba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author moham
 */
public class Database {

   public Connection con;
   public Statement stm;
   public ResultSet rs;
//   Koneksi Database
   public void koneksi(){
     try {
            String url ="jdbc:mysql://localhost/data_pengiriman";
            String user="root";
            String pw="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pw);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");

        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }

   }
   }
    

