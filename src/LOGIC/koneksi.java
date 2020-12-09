
package LOGIC;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class koneksi {
    public DefaultTableModel model;
    String flag;
    String [] judul;
    public DefaultTableModel getModel(){
        if(flag=="pasien"){
        String [] judul = {"Id Pasien","Nama", "Jenis Kelamin", "Tanggal Lahir", "Alamat", "No Telepon", "Golongan Darah"};
        model = new DefaultTableModel(judul,0);
        }
        if(flag=="obat"){
        String [] judul = {"Id Obat","Nama", "Jenis", "Tanggal Kadaluwarsa", "Aturan Pakai", "Penyakit", "Stok"};
        model = new DefaultTableModel(judul,0);
        }
        if(flag=="pemeriksaan"){
        Object judul[] = {"Id Pemeriksaan", "Id Pasien", "Hasil Pemeriksaan", "Resep"};
        model = new DefaultTableModel(judul,0);
        }
        return model;
    }
    public void tampil(String sql){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/poliklinikupn","root","");
        ResultSet rs = cn.createStatement().executeQuery(sql);
        while(rs.next()){
            if(flag=="pasien"){
            String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
            model.addRow(data);
            }
            if(flag=="obat"){
            String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
            model.addRow(data);
            }
            if(flag=="pemeriksaan"){
            String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
            model.addRow(data);
            }
        }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    catch(ClassNotFoundException ex){
        System.out.println(ex);
    }
}
    public void hapus(String sql){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/poliklinikupn","root","");
           Statement st = cn.createStatement();
           st.executeUpdate(sql);
           javax.swing.JOptionPane.showMessageDialog(null, "Data dihapus");
        }   catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal Proses Hapus Data ");
        }
    }
    public void inputData(String sql){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/poliklinikupn","root","");
        Statement st = cn.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan!", "Hasil", JOptionPane.INFORMATION_MESSAGE);
        st.close();
        cn.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Data Gagal disimpan!", "Hasil", JOptionPane.ERROR_MESSAGE);
    }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Driver Tidak ditemukan !", "Hasil", JOptionPane.ERROR_MESSAGE);
    }
}
    public void edit(String sql){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/poliklinikupn","root","");
           Statement st = cn.createStatement();     
           st.executeUpdate(sql);
           javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil di edit");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gagal Edit Data "+e);
        }
    }
    public void flaged(String flag){
        this.flag=flag;
    }
}
