/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport_company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    
    public Home(String username) {
        super("Travel and Tourism Management System");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLUE);
	menuBar.add(m1);
		
        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
	m1.add(mi3);
        
        JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");
	m1.add(mi4);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateDriver(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
		
	JMenu m2 = new JMenu("CONSIGNMENTS");
        m2.setForeground(Color.RED);
	menuBar.add(m2);
       
        JMenuItem mi7 = new JMenuItem("ADD CONSIGNMENTS");
	m2.add(mi7);
        
        JMenuItem mi5 = new JMenuItem("VIEW CONSIGNMENTS");
	m2.add(mi5);
        
     
        

        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddConsignments(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewConsignment(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
        JMenu m3 = new JMenu("OFFICE");
        m3.setForeground(Color.BLUE);
	menuBar.add(m3);
        
        JMenuItem mi8 = new JMenuItem("ADD BRANCH");
	m3.add(mi8);
        
        JMenuItem mi9 = new JMenuItem("VIEW BRANCHES");
	m3.add(mi9);
        
       
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new AddBranch(username).setVisible(true);
            }
	});
        
        
        
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBranch (username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
       
//        
//       JMenu m4 = new JMenu("TRUCK ");
//        m4.setForeground(Color.RED);
//	menuBar.add(m4);
//        
//        JMenuItem mi11 = new JMenuItem("TRUCK USAGE");
//	m4.add(mi11);
//        
//        mi11.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                new View_Truck_Usage().setVisible(true);
//            }
//        });
        
//         JMenuItem mi69 = new JMenuItem("TRUCK STATUS");
//	m4.add(mi69);
//        
//        mi69.addActionListener((ActionEvent ae) -> {
//            new Truck_Status().setVisible(true);
//        });
//        
//        JMenuItem mi51 = new JMenuItem("ALLOT TRUCK");
//        
//	m4.add(mi51);
//        
//        mi51.addActionListener((ActionEvent ae) -> {
//            new Allot_Truck().setVisible(true);
//        });
        
        
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLUE);
	menuBar.add(m5);
        
        JMenuItem mi12 = new JMenuItem("PAY USING PAYTM");
	m5.add(mi12);
        
        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.RED);
	menuBar.add(m6);
        
        JMenuItem mi13 = new JMenuItem("NOTEPAD");
	m6.add(mi13);
        
        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	m6.add(mi14);
        
        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
      mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new About (username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m7 = new JMenu("BILL");
        m7.setForeground(Color.BLUE);
	menuBar.add(m7);
        
        JMenuItem mi15 = new JMenuItem("ISSUE BILL");
	m7.add(mi15);
        
        mi15.addActionListener((ActionEvent ae) -> {
            new About(username).setVisible(true);
        });
        
    
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}