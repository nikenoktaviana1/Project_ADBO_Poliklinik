
package sistempoliklinik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class lihatObat {
     public static void main(String[] args) {
        lihat x = new lihat();
        x.setVisible(true);
    }
}

    
class lihat extends JFrame {

final JTextField Fcarib = new JTextField ();
JLabel car = new JLabel ("CARI RESEP ");
JButton search = new JButton(); 
JButton home = new JButton();
JButton back = new JButton("Back");

 DefaultTableModel model;
     JTable tabel;
     JScrollPane scrollpane;
     
public lihat (){
    Object kolom[] = {"Id Obat", "Nama Obat", "Stok"};
    model = new DefaultTableModel(kolom,0);
    tabel = new JTable (model);
    scrollpane = new JScrollPane (tabel);
        
        this.getContentPane().setBackground(Color.pink);
        setTitle ("lihat obat");  
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
        add(back);
  
        car.setBounds(20,20, 160, 30); car.setFont(new Font("Serif", Font.BOLD, 23));
        back.setBounds(465,70, 115, 20);
        Fcarib.setBounds(200,20, 250, 30);
        search.setBounds(465, 20, 50, 40); search.setIcon(new ImageIcon(getClass().getResource("/image/cari.png")));
        search.setBackground(Color.white);
        home.setBounds(530, 20, 50, 40); home.setIcon(new ImageIcon(getClass().getResource("/image/home.png")));
        home.setBackground(Color.white);
        scrollpane.setBounds(20,100,550,500);
      
    back.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent evt) {
        hasil ab = new hasil ();
        ab.setVisible(true);
        dispose();
    }});


}
}
