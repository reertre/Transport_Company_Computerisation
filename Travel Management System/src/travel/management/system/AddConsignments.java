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
public class AddConsignments extends JFrame {
	private JPanel contentPane;
        JTextField t1,t2;
        Choice c1,c2,c3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddConsignments frame = new AddConsignments("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddConsignments(String username) {
		setBounds(420, 420, 1100, 450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,50,700,300);
                add(la1);
		
		JLabel lblName = new JLabel("Add Consignments ");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel la2 = new JLabel("Username :");
		la2.setBounds(35, 70, 200, 14);
		contentPane.add(la2);
                
                JLabel l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                JLabel lblId = new JLabel("Select Destination :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                c1 = new Choice();
                c1.add("Head Branch");
                c1.add("Branch 1");
                c1.add("Branch 2");
                c1.setBounds(271, 110, 150, 30);
                add(c1);
                
                JLabel la3 = new JLabel("Total Weight");
		la3.setBounds(35, 150, 200, 14);
		contentPane.add(la3);
                
                t1 = new JTextField();
                t1.setText("0");
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
		JLabel lbl1 = new JLabel("ID :");
		lbl1.setBounds(35, 190, 200, 14);
		contentPane.add(lbl1);
                
                JLabel l2 = new JLabel();
		l2.setBounds(271, 190, 200, 14);
		contentPane.add(l2);
		
		JLabel lbl2 = new JLabel("Number :");
		lbl2.setBounds(35, 230, 200, 14);
		contentPane.add(lbl2);
                
                JLabel l3 = new JLabel();
		l3.setBounds(271, 230, 200, 14);
		contentPane.add(l3);
           	
		JLabel lbl3 = new JLabel("Sender Address :");
		lbl3.setBounds(35, 270, 200, 14);
		contentPane.add(lbl3);
                
                c2 = new Choice();
                c2.add("Head Branch");
                c2.add("Branch 1");
                c2.add("Branch 2");
		c2.setBounds(271, 270, 150, 30);
		contentPane.add(c2);

		
		JLabel lblDeposite = new JLabel("Total Price :");
		lblDeposite.setBounds(35, 310, 200, 14);
		contentPane.add(lblDeposite);
		
		JLabel l5 = new JLabel();
		l5.setBounds(271, 310, 200, 14);
                l5.setForeground(Color.RED);
		contentPane.add(l5);
                
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("id_type"));
                        l3.setText(rs.getString("number"));
                      
                        
                    }

                    rs.close();
                }catch(SQLException e){}
                
                JButton b1 = new JButton("Check Price");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            String p = c1.getSelectedItem();
                            int cost = 0;
                            if(p.equals("Head Branch")) {
                                cost += 12000;
                            }if(p.equals("Branch 1")){
                                cost += 25000;
                            }else if(p.equals("Branch 2")){
                                cost += 32000;
                            }
                            
                            cost *= Integer.parseInt(t1.getText());
                            l5.setText("Rs "+cost);
                            
                        }
		});
		b1.setBounds(50, 350, 120, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookPackage values('"+username+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+l2.getText()+"', '"+l3.getText()+"','"+c2.getSelectedItem()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Consignment Added Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
		btnNewButton.setBounds(200, 350, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(350, 350, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}