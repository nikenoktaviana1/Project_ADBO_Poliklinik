package sistempoliklinik;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*; 


public class home {
    public static void main(String[] args) {  
    log g = new log();  
    g.setVisible(true);  
    }  
}

class log extends JFrame {  
public String sql = ""; 
JButton ljudul2 = new JButton();
JLabel ljudul3 = new JLabel("Poliklinik UPN 'Veteran' Yogyakarta      ");
JLabel login = new JLabel("Login");
JLabel user = new JLabel("Username");
JLabel pas = new JLabel("Password");
JTextField username = new JTextField();
final JPasswordField pass = new JPasswordField(10);  
JButton logo = new JButton();
JButton signin = new JButton("Sign in");

static String a, b, c;

public log() {  
     
    ActionListener abc=new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              a=ljudul3.getText();
              b=a.substring(0,1);
              c=a.substring(1,a.length());
              ljudul3.setText(c+b);
              
                      
           }
       };new javax.swing.Timer(300, abc).start();
setTitle ("Home");  
setDefaultCloseOperation(3);  
setSize(900,600);  
this.getContentPane().setBackground(Color.WHITE);
setLayout(null);

add(ljudul3);
add(ljudul2); 
add(login);
add(user);
add(pas);
add(username);
add(pass);
add(logo);
add(signin);

ljudul2.setBounds(0,0,900,200); ljudul2.setBackground(Color.PINK);
ljudul3.setBounds(100,10,700,150);  ljudul3.setFont(new Font("Serif", Font.BOLD, 35));
login.setBounds(650, 230, 50, 50); login.setFont(new Font("Serif", Font.BOLD, 18));
user.setBounds(500, 280, 180, 50); user.setFont(new Font("Serif", Font.BOLD, 18));
pas.setBounds(500, 360, 180, 50); pas.setFont(new Font("Serif", Font.BOLD, 18));
username.setBounds(600, 280, 180, 50);
pass.setBounds(600, 360, 180, 50); 
logo.setBounds(80, 250, 250, 250);  logo.setIcon(new ImageIcon(getClass().getResource("/image/logo1.jpg")));
logo.setBackground(Color.white);
signin.setBounds(640, 430, 100, 30); signin.setBackground(Color.PINK);

setVisible(true);  
setAlwaysOnTop(false); 

signin.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent evt) {
        loginn(evt);
    }});
}
public void loginn(ActionEvent evt){
    if(username.getText().equals("dokter")&&pass.getText().equals("dok123")){
        pasien m =new pasien ();
        m.setVisible(true);
        this.dispose();   
    }
    if(username.getText().equals("receptionist")&&pass.getText().equals("rec123")){
        pasien m =new pasien ();
        m.setVisible(true);
        this.dispose();   
    }
    if(username.getText().equals("apoteker")&&pass.getText().equals("apk123")){
        pasien m =new pasien ();
        m.setVisible(true);
        this.dispose();   
    }
    else{
        JOptionPane.showMessageDialog(null, "Salah, silahkan coba lagi yaa", "Warning", JOptionPane.WARNING_MESSAGE);
    }
} 
}


/*public void loginn(ActionEvent evt){
    
   cari();
} 

private void cari(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/poliklinikupn","root","");

       sql = "select * from login where username  like '%" + username.getText() + "%' and password like '%"+pass.getText()+"%'";
       ResultSet rs = cn.createStatement().executeQuery(sql);
        pasien a = new pasien ();
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Salah, silahkan coba lagi yaa");
    }
    catch(ClassNotFoundException e){
        javax.swing.JOptionPane.showMessageDialog(null, "Salah, silahkan coba lagi yaa");
        
    }
}
}*/