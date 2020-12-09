
package sistempoliklinik;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class formObat {
     public static void main(String[] args) {
        
    
        
        obat x = new obat();
    x.setVisible(true);
    }
}

class obat extends JFrame{
JButton menu1 = new JButton("Menu 1"); 
JButton menu2 = new JButton("Menu 2");
JLabel atas = new JLabel("Daftar Obat");
JLabel idobat = new JLabel("Id Obat");
final JTextField fidobat = new JTextField(10);
JLabel namaobat = new JLabel("Nama Obat");
final JTextField fnamaobat = new JTextField(10);
JLabel penyakit = new JLabel("Penyakit");
final JTextField fpenyakit = new JTextField(10);
JLabel jobat = new JLabel("Jenis Obat");
String[] fjo = {"-Pilih-", "Anak-anak", "Remaja", "Dewasa"};
JComboBox cmbjo= new JComboBox(fjo);
JLabel tex = new JLabel("Tanggal Kadaluwarsa");
final JTextField ftex = new JTextField(10);
JLabel aturan = new JLabel("Aturan Pakai");
final JTextArea faturan = new JTextArea();
JButton save = new JButton("Save");
JButton edit = new JButton("Edit");
JButton delete = new JButton("Delete");
JButton reset = new JButton("Reset");
JButton home = new JButton();
JButton fcari = new JButton();
final JTextField cari = new JTextField(10);
JLabel stok = new JLabel("Stok");
final JTextField fstok = new JTextField(10);
DefaultTableModel model;
     JTable tabel;
     JScrollPane scrollpane;
  
public obat(){
    
    tabel = new JTable (model);
    
    scrollpane = new JScrollPane (tabel);
this.getContentPane().setBackground(Color.blue);
setTitle ("Olah Data Obat");
setDefaultCloseOperation(3);
setSize(900,600);
this.getContentPane().setBackground(Color.pink);
    
setLayout(null);
add(menu1);
add(menu2);
add(atas);
add(idobat);
add(fidobat);
add(namaobat);
add(fnamaobat);
add(penyakit);
add(fpenyakit);
add(jobat);
add(cmbjo);
add(tex);
add(ftex);
add(aturan);
add(faturan);
add(save);
add(edit);
add(delete);
add(reset);
add(home);
add(scrollpane);
add(cari);
add(fcari);
add(stok);
add(fstok);
menu1.setBounds(0,0,450,30); menu1.setBackground(Color.pink);
menu2.setBounds(450,0,450,30); menu2.setBackground(Color.white);
atas.setBounds(20,40,300,50); atas.setFont(new Font("Serif", Font.BOLD, 25));
idobat.setBounds(20,100,100,20); 
fidobat.setBounds(150,100,130,30);
namaobat.setBounds(20,140,100,30); 
fnamaobat.setBounds(150,140,250,30);
penyakit.setBounds(20,325,100,30);
fpenyakit.setBounds(150,325,250,30);
jobat.setBounds(20,180,100,30); 
cmbjo.setBounds(150,180,120,30); cmbjo.setBackground(Color.white);
tex.setBounds(20,220,130,30); 
ftex.setBounds(150,220,250,30);
aturan.setBounds(20,260,100,30);
faturan.setBounds(150,260,250,50);
stok.setBounds(20,360,100,30);
fstok.setBounds(150,370,130,30);
save.setBounds(500,110,80,30); save.setBackground(Color.white);
edit.setBounds(500,160,80,30); edit.setBackground(Color.white);
delete.setBounds(500,210,80,30); delete.setBackground(Color.white);
reset.setBounds(500,260,80,30); reset.setBackground(Color.white); home.setBackground(Color.white);
home.setBounds(514,310,50,50); home.setIcon(new ImageIcon(getClass().getResource("/image/home.png")));
scrollpane.setBounds(80,420,700,140);   
cari.setBounds(630,380,150,30);   fcari.setBackground(Color.white);
fcari.setBounds(800,375,40,40); fcari.setIcon(new ImageIcon(getClass().getResource("/image/cari.png")));
setVisible(true);
setAlwaysOnTop(true);
setResizable(false);    

 menu2.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent evt) {
        resep ab = new resep ();
        dispose();
        ab.setVisible(true);
        
    }});
}}
