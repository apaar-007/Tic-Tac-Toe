package com.game.ui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

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
	
	
	
//	public static void main(String[] args) {
//		Splash splash = new Splash();
//		splash.setVisible(true);
//		for (int i = 0; i <= 100; i++) {
//			try {
//				Thread.sleep(i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			splash.progressBar.setValue(i);
//		}
//	}
	
	
	
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		
		frame = new JPanel();
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame);
		frame.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Code to Contribute to be displayed here");
		lblNewLabel.setBounds(97, 46, 255, 104);
		frame.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(159, 244, 146, 14);
		frame.add(progressBar);
		
		lblpercentage = new JLabel("");
		lblpercentage.setBounds(159, 227, 46, 14);
		frame.add(lblpercentage);
	}
	public void setProgressBar(int i) {
		progressBar.setValue(i);
	}
	public void setLblpercentage(String string) {
		lblpercentage.setText(string);
	}
}
