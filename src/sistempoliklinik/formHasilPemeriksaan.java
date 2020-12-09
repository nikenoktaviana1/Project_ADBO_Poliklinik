package sistempoliklinik;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class formHasilPemeriksaan {
    public static void main(String[] args) {
          
        hasil x = new hasil();
        x.setVisible(true);
    }
}

class hasil extends JFrame{
    
JLabel atas = new JLabel("Hasil Pemeriksaan");
JLabel idpemer = new JLabel("Id Pemeriksaan");
final JTextField fidpemer = new JTextField(10);
JLabel idpasien = new JLabel("Id Pasien");
final JTextField fidpasien = new JTextField(10);
JLabel hasilt = new JLabel("Hasil Pemeriksaan");
final JTextField fhasilt = new JTextField();
JLabel resep = new JLabel("Resep");
final JTextArea fresep = new JTextArea();
JButton save = new JButton("Save");
JButton edit = new JButton("Edit");
JButton delete = new JButton("Delete");
JButton reset = new JButton("Reset");
JButton home = new JButton();
JButton fcari = new JButton();
JButton car_ob = new JButton("*");
final JTextField cari = new JTextField(10);
DefaultTableModel model;
     JTable tabel;
     JScrollPane scrollpane;
  
public hasil(){
    Object kolom[] = {"No Pemeriksaan", "Id Pasien", "Hasil Pemeriksaan", "Resep (kode obat)"};
    model = new DefaultTableModel(kolom,0);
    tabel = new JTable (model);
    scrollpane = new JScrollPane (tabel);
this.getContentPane().setBackground(Color.blue);
setTitle ("Olah Data Obat");
setDefaultCloseOperation(3);
setSize(900,600);
this.getContentPane().setBackground(Color.pink);
    
setLayout(null);
add(atas);
add(idpemer);
add(fidpemer);
add(idpasien);
add(fidpasien);
add(hasilt);
add(fhasilt);
add(resep);
add(fresep);
add(save);
add(edit);
add(delete);
add(reset);
add(home);
add(scrollpane);
add(cari);
add(fcari);
add(car_ob);
atas.setBounds(20,10,300,50); atas.setFont(new Font("Serif", Font.BOLD, 25));
idpemer.setBounds(20,70,100,30); 
fidpemer.setBounds(150,70,230,30);
idpasien.setBounds(20,110,100,30); 
fidpasien.setBounds(150,110,230,30);
hasilt.setBounds(20,150,150,30);
fhasilt.setBounds(150,150,230,100);
resep.setBounds(20,270,100,30); 
fresep.setBounds(150,270,230,100); 
save.setBounds(500,80,80,30); save.setBackground(Color.white);
edit.setBounds(500,130,80,30); edit.setBackground(Color.white);
delete.setBounds(500,180,80,30); delete.setBackground(Color.white);
reset.setBounds(500,230,80,30); reset.setBackground(Color.white); home.setBackground(Color.white);
home.setBounds(514,280,50,50); home.setIcon(new ImageIcon(getClass().getResource("/image/home.png")));
scrollpane.setBounds(80,390,700,140);   
cari.setBounds(630,350,150,30);   fcari.setBackground(Color.white);
fcari.setBounds(800,345,40,40); fcari.setIcon(new ImageIcon(getClass().getResource("/image/cari.png")));
car_ob.setBounds(400,300,30,30);   car_ob.setBackground(Color.black);
setVisible(true);
setAlwaysOnTop(true);
setResizable(false);     
car_ob.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent evt) {
        lihat ab = new lihat ();
        ab.setVisible(true);
        dispose();
    }});

}
}