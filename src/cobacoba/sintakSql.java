/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobacoba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author moham
 */
public class sintakSql extends Database{
    public static ArrayList<String> namaBarang = new ArrayList<>();
    public static ArrayList<String> kategoriPengiriman = new ArrayList<>();
    public static ArrayList<String> idBarang = new ArrayList<>();
    public static ArrayList<String> jarak = new ArrayList<>();
    public static ArrayList<String> estimasi = new ArrayList<>();
    public static ArrayList<String> alamatTujuan = new ArrayList<>();
    
//    public static ArrayList<String> kategoriJarak = new ArrayList<>();
    private String tampilkan ="SELECT * FROM data";
//    tampilkan data
    //menggunakan encapsualtion
    public void tampilkanData() throws SQLException{
        Database dbs = new Database();
             try {
              
              dbs.koneksi();
              dbs.rs = dbs.stm.executeQuery(this.tampilkan);
        while(dbs.rs.next()){
               
                namaBarang.add(dbs.rs.getString("nama_barang"));
                idBarang.add(dbs.rs.getString("id"));
                kategoriPengiriman.add(dbs.rs.getString("kategori_pengiriman"));
                jarak.add(dbs.rs.getString("jarak"));
                estimasi.add(dbs.rs.getString("estimasi"));
                alamatTujuan.add(dbs.rs.getString("alamat_tujuan"));
//                kategoriJarak.add(dbs.rs.getString("jarak"));
                System.out.println("Berhasil Mengambil data");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        }
    

    

