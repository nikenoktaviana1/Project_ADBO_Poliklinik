
package sistempoliklinik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class formDataPasien {
     public static void main(String[] args) {
        
        pasien x = new pasien();
    x.setVisible(true);
    }
}

class pasien extends JFrame{
    
JLabel atas = new JLabel("Riwayat Data Pasien");
JLabel id = new JLabel("Id Pasien");
final JTextField fid = new JTextField(10);
JLabel nama = new JLabel("Nama Pasien");
final JTextField fnama = new JTextField(10);
JLabel jk = new JLabel("Jenis Kelamin");
String[] fjk = {"-Pilih-", "Laki-laki", "Perempuan"};
JComboBox cmbjk= new JComboBox(fjk);
JLabel tlahir = new JLabel("Tanggal Lahir");
final JTextField ftlahir = new JTextField(10);
JLabel alamat = new JLabel("Alamat");
final JTextArea falamat = new JTextArea();
JLabel noHp = new JLabel("No Telepon");
final JTextField fnoHp = new JTextField(10);
JLabel goldar = new JLabel("Golongan Darah");
String[] fgd = {"-Pilih-", "O", "A", "B", "AB"};
JComboBox cmbgoldar= new JComboBox(fgd);
final JTextField cari = new JTextField(10);
JButton save = new JButton("Save");
JButton edit = new JButton("Edit");
JButton delete = new JButton("Delete");
JButton reset = new JButton("Reset");
JButton home = new JButton();
JButton cetak = new JButton();
JButton fcari = new JButton();
DefaultTableModel model;
     JTable tabel;
     JScrollPane scrollpane;
  
public pasien(){
    
    tabel = new JTable (model);
    
    scrollpane = new JScrollPane (tabel);
this.getContentPane().setBackground(Color.blue);
setTitle ("Olah Data Pasien");
setDefaultCloseOperation(3);
setSize(900,600);
this.getContentPane().setBackground(Color.pink);
    
setLayout(null);
add(atas);
add(id);
add(fid);
add(nama);
add(fnama);
add(jk);
add(cmbjk);
add(tlahir);
add(ftlahir);
add(alamat);
add(falamat);
add(noHp);
add(fnoHp);
add(goldar);
add(cmbgoldar);
add(save);
add(edit);
add(delete);
add(reset);
add(home);
add(cetak);
add(scrollpane);
add(cari);
add(fcari);
atas.setBounds(20,10,300,50); atas.setFont(new Font("Serif", Font.BOLD, 25));
//tanggal.setFont(new Font("Serif", Font.ITALIC, 14));
id.setBounds(20,70,100,20); 
fid.setBounds(150,70,130,30);
nama.setBounds(20,110,100,30); 
fnama.setBounds(150,110,250,30);
jk.setBounds(20,150,100,30); 
cmbjk.setBounds(150,150,120,30); cmbjk.setBackground(Color.white);
tlahir.setBounds(20,190,100,30); 
ftlahir.setBounds(150,190,250,30);
alamat.setBounds(20,230,100,30);
falamat.setBounds(150,230,250,50);
noHp.setBounds(20,295,100,30);
fnoHp.setBounds(150,295,250,30);
goldar.setBounds(20,335,100,30);
cmbgoldar.setBounds(150,335,120,30); cmbgoldar.setBackground(Color.white);
save.setBounds(500,80,80,30); save.setBackground(Color.white);
edit.setBounds(500,130,80,30); edit.setBackground(Color.white);
delete.setBounds(500,180,80,30); delete.setBackground(Color.white);
reset.setBounds(500,230,80,30); reset.setBackground(Color.white); home.setBackground(Color.white);
home.setBounds(514,280,50,50); home.setIcon(new ImageIcon(getClass().getResource("/image/home.png")));
cetak.setBounds(700,150,100,100); cetak.setIcon(new ImageIcon(getClass().getResource("/image/print1.jpg")));
scrollpane.setBounds(80,390,700,140);   
cari.setBounds(630,350,150,30);   fcari.setBackground(Color.white);
fcari.setBounds(800,345,40,40); fcari.setIcon(new ImageIcon(getClass().getResource("/image/cari.png")));
setVisible(true);
setAlwaysOnTop(true);
setResizable(false);     
}}