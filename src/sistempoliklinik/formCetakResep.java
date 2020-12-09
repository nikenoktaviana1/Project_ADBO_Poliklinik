
package sistempoliklinik;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class formCetakResep {
     public static void main(String[] args) {
        resep x = new resep();
        x.setVisible(true);
    }
}

    
class resep extends JFrame {

final JTextField Fcarib = new JTextField ();
JLabel car = new JLabel ("CARI RESEP ");
JButton search = new JButton(); 
JButton home = new JButton();
JButton reset = new JButton("Reset");
JButton cetak = new JButton();
JTextArea tampil = new JTextArea();
 DefaultTableModel model;
     JTable tabel;
     JScrollPane scrollpane;
     
public resep (){
    Object kolom[] = {"No Pemeriksaan", "Nama Pasien", "Resep"};
    model = new DefaultTableModel(kolom,0);
    tabel = new JTable (model);
    scrollpane = new JScrollPane (tabel);
        
        this.getContentPane().setBackground(Color.pink);
        setTitle ("resep");  
        setDefaultCloseOperation(3);  
        setSize(900,600);  
        setAlwaysOnTop(true);
        setResizable(false);
        setLayout(null);  
        add(Fcarib);
        add(search);
        add(scrollpane);
        add(home); 
        add(car);
        add(reset);
        add(cetak);
        add(tampil);
        car.setBounds(20,20, 160, 30); car.setFont(new Font("Serif", Font.BOLD, 23));
        reset.setBounds(465,70, 115, 20);
        Fcarib.setBounds(200,20, 250, 30);
        search.setBounds(465, 20, 50, 40); search.setIcon(new ImageIcon(getClass().getResource("/image/cari.png")));
        search.setBackground(Color.white);
        home.setBounds(530, 20, 50, 40); home.setIcon(new ImageIcon(getClass().getResource("/image/home.png")));
        home.setBackground(Color.white);
        scrollpane.setBounds(20,100,550,500);
        cetak.setBounds(695,450,100,100); cetak.setIcon(new ImageIcon(getClass().getResource("/image/print1.jpg")));
        tampil.setBounds(620, 60, 220, 350);
       


}
}
