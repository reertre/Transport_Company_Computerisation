/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport_company;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class About extends JFrame {
	private JPanel contentPane;
        Choice c1;
	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        try {
            About frame = new About ("");
            frame.setVisible(true);
        } catch (Exception e) {
        }
    });
}


	public About(String username)  {
		setBounds(580, 220, 550, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
               
//                Image i3 = i1.getImage().getScaledInstance(500, 350,Image.SCALE_DEFAULT);
//                ImageIcon i2 = new ImageIcon(i3);
//                JLabel la1 = new JLabel(i2);
//                la1.setBounds(450,40,350,350);
//                add(la1);
		
		JLabel lblName = new JLabel("BILL");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(200, 11, 350, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Sender Address :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Volume :");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("ID :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		JLabel l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Number :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                JLabel l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Receiver Address :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                JLabel l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Price :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                JLabel l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		Conn c = new Conn();
                try{

                    try (ResultSet rs = c.s.executeQuery("select * from bookPackage where username = '"+username+"'")) {
                        while(rs.next()){
                            l1.setText(rs.getString(1));
                            l2.setText(rs.getString(2));
                            l3.setText(rs.getString(3));
                            l4.setText(rs.getString(4));
                            l5.setText(rs.getString(5));
                            l6.setText(rs.getString(6));
                            l7.setText(rs.getString(7));
                            
                        }
                    }
                }catch(SQLException e){}

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener((ActionEvent e) -> {
                    setVisible(false);
                }); 
		btnExit.setBounds(160, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}

    
    
}