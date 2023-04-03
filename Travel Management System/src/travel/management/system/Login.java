package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame {
    public Login() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);
        
        getContentPane() .setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0, 400, 400);
        
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LOGIN_TRUCK.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(100,120,400,400);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450,300);
        add (p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN SERIF,", Font.PLAIN,20));
        p2.add(lblusername);
        
        JTextField  lfusername = new JTextField();
        lfusername.setBounds (60,60,300,30);
        lfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lfusername);
        
         JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN SERIF,", Font.PLAIN,20));
        p2.add(lblpassword);
        
         JTextField  lfpassword = new JTextField();
        lfpassword.setBounds (60,150,300,30);
        lfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(lfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds (60,200,130,30);
        login.setBackground( new Color(131,193,233));
        login.setForeground(Color.WHITE);
        p2.add(login);
        
         JButton Signup = new JButton("Signup");
        Signup.setBounds (230,200,130,30);
        Signup.setBackground( new Color(131,193,233));
        Signup.setForeground(Color.WHITE);
        p2.add(Signup);
        
        JButton Forgotpass = new JButton("Forgot Password");
        Forgotpass.setBounds (130,250,160,30);
        Forgotpass.setBackground( new Color(131,193,233));
        Forgotpass.setForeground(Color.WHITE);
        p2.add(Forgotpass);
        
        JLabel text = new JLabel("Trouble Login In?");
        text.setBounds(300,255,150,20);
        text.setFont(new Font("Tahoma", Font.PLAIN, 15));
	text.setForeground(new Color(255, 0, 0));
        p2.add(text);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
