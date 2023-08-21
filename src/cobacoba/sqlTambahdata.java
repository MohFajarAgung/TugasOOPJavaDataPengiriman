/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobacoba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sqlTambahdata extends adddata {

    
    void tambahData(String nama,String kategori,String jarak,String estimasi,String alamat){
        String url = "jdbc:mysql://localhost:3306/data_pengiriman";
        String username = "root";
        String password = "";
        
        String sql = "INSERT INTO data (id, nama_barang,kategori_pengiriman, jarak, estimasi, alamat_tujuan ) VALUES (?, ?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            sintakSql tes = new sintakSql();

            // Mengatur nilai 
            
            statement.setInt(1, 0 );
            statement.setString(2, nama);
            statement.setString(3,kategori);
            statement.setString(4, jarak);
            statement.setString(5, estimasi);
            statement.setString(6, alamat);
            int rowsAffected = statement.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Data berhasil disisipkan ke tabel data.");
            } else {
                System.out.println("Gagal menyisipkan data ke tabel data.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

