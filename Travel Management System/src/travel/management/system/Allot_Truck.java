/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport_company;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Allot_Truck extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
        String username;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

    Allot_Truck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

	public final void setUploading() {
            setVisible(false);
            th.start();
	}

        @Override
	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    }
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
            }
	}

	public Allot_Truck(String username) {
            this.username = username;
            th = new Thread((Runnable) this);

            setBounds(600, 300, 600, 400);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(51,204, 255));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("truck");
            lbllibraryManagement.setForeground(new Color(100, 209, 204));
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
            lbllibraryManagement.setBounds(75, 46, 700, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground(new Color(160, 82, 45));
            lblNewLabel_2.setBounds(200, 165, 150, 20);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(10, 10, 580, 380);
            contentPane.add(panel);
              
            setUndecorated(true);
            setUploading();
	}
}