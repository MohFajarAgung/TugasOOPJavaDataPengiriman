/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cobacoba;

/**
 *
 * @author moham
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sqlBarangYangSampai extends barangsudahsampai {
    public static ArrayList<String> id = new ArrayList<>(); 
    public static ArrayList<String> namaBarang = new ArrayList<>(); 
    public static ArrayList<String> idInt = new ArrayList<>(); 
    
    public static void yangSampai(int kondisi) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/data_pengiriman";
        String username = "root";
        String password = "";
        
        String sourceTable = "data";
        String targetTable = "terkirim";
                
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            
            String sql = "INSERT INTO " + targetTable + " SELECT id,nama_barang FROM " + sourceTable + " WHERE id ="+ kondisi ;
            String hapus = "DELETE FROM " + sourceTable + " WHERE id ="  + kondisi ;
            int rowsAffected = statement.executeUpdate(sql);
            statement.executeUpdate(hapus);
           System.out.println("berhasil menampah barang terkirim " + rowsAffected);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void tampilkanData() throws SQLException{
        Database dbs = new Database();
                   dbs.koneksi();
              dbs.rs = dbs.stm.executeQuery("SELECT * FROM terkirim");
            id.clear();
            namaBarang.clear();
            while(dbs.rs.next()){
                id.add(dbs.rs.getString("id"));
                namaBarang.add(dbs.rs.getString("nama_barang"));
                System.out.println("berhasil ");
            }
    }
}
