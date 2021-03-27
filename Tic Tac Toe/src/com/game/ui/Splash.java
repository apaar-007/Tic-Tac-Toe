package com.game.ui;



import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;

public class Splash extends JFrame {
	/**
	 * 
	 */
	private static JProgressBar progressBar; 
	private static JPanel frame;
	private static JLabel lblpercentage;
	
	
	public static JLabel getLblpercentage() {
		return lblpercentage;
	}
	public static void setLblpercentage(JLabel lblpercentage) {
		Splash.lblpercentage = lblpercentage;
	}
	public static JProgressBar getProgressBar() {
		return progressBar;
	}
	public static void setProgressBar(JProgressBar progressBar) {
		Splash.progressBar = progressBar;
	}
	
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		
		frame = new JPanel();
		frame.setBackground(Color.BLACK);
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame);
		frame.setLayout(null);
		
		JLabel lblctc = new JLabel("");
		Image ctc = new ImageIcon(this.getClass().getResource("/CTC.gif")).getImage();
		lblctc.setIcon(new ImageIcon(ctc));
		lblctc.setBounds(0, 0, 450, 244);
		frame.add(lblctc);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(Color.WHITE);
		progressBar.setBounds(0, 286, 450, 14);
		frame.add(progressBar);
		
		lblpercentage = new JLabel("");
		lblpercentage.setForeground(Color.WHITE);
		lblpercentage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblpercentage.setBounds(370, 257, 68, 22);
		frame.add(lblpercentage);
	}
	public void setProgressBar(int i) {
		progressBar.setValue(i);
	}
	public void setLblpercentage(String string) {
		lblpercentage.setText(string);
	}
}
