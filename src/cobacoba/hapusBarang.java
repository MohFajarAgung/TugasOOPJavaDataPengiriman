/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobacoba;

/**
 *
 * @author moham
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class hapusBarang extends canceldata{
    public void hapus(String kondisi){
        String url = "jdbc:mysql://localhost:3306/data_pengiriman";
        String username = "root";
        String password = "";
        
        String tableName = "data";
        
        String condition = kondisi; // Kondisi yang ingin Anda terapkan
        
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            
            String sql = "DELETE FROM " + tableName + " WHERE nama_barang =  '"+kondisi+"' " ;
            
            int rowsAffected = statement.executeUpdate(sql);
            
            System.out.println("Jumlah baris terhapus: " + rowsAffected);
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
    }
}


