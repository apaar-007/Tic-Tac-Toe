package com.game.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.game.beans.ModelTicTacToe;

import java.awt.Color;
import javax.swing.JTextField;

public class TicTacToe {

	private JFrame frame;
	private JTextField txtplayerOne;
	private JTextField txtplayerTwo;
	ModelTicTacToe model = new ModelTicTacToe();

	/**
	 * Launch the application.
	 * Hey This is Vaibhav
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void score() {
		txtplayerOne.setText(String.valueOf(model.getCountX()));
		txtplayerTwo.setText(String.valueOf(model.getCountO()));
	}

	private void player() {
		if (model.getStartString().equalsIgnoreCase("X")) {
			model.setStartString("O");
		} else {
			model.setStartString("X");
		}
	}

	private void winner() {
		JFrame f = new JFrame();
		if (model.getBtn0()==("X") && model.getBtn1()==("X") && model.getBtn2()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn0()==("O") && model.getBtn1()==("O") && model.getBtn2()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn3()==("X") && model.getBtn4()==("X") && model.getBtn5()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn3()==("O") && model.getBtn4()==("O") && model.getBtn5()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn6()==("X") && model.getBtn7()==("X") && model.getBtn8()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn6()==("O") && model.getBtn7()==("O") && model.getBtn8()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn0()==("X") && model.getBtn3()==("X") && model.getBtn6()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn0()==("O") && model.getBtn3()==("O") && model.getBtn6()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn0()==("X") && model.getBtn4()==("X") && model.getBtn8()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn0()==("O") && model.getBtn4()==("O") && model.getBtn8()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn2()==("X") && model.getBtn5()==("X") && model.getBtn8()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn2()==("O") && model.getBtn5()==("O") && model.getBtn8()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn1()==("X") && model.getBtn4()==("X") && model.getBtn8()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn1()==("O") && model.getBtn4()==("O") && model.getBtn8()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
		if (model.getBtn2()==("X") && model.getBtn4()==("X") && model.getBtn6()==("X")) {
			JOptionPane.showMessageDialog(f,"Player X Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountX(model.getCountX()+1);
				score();
		}
		if (model.getBtn2()==("O") && model.getBtn4()==("O") && model.getBtn6()==("O")) {
			JOptionPane.showMessageDialog(f,"Player O Won.","Tic Tac Toe",JOptionPane.WARNING_MESSAGE);   
				model.setCountO(model.getCountO()+1);
				score();
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 754, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn_0 = new JButton("");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_0.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_0.setBackground(new Color(255, 182, 193));
				} else {
					btn_0.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn0(btn_0.getText());
				winner();
			}
		});
		btn_0.setBounds(12, 124, 80, 66);
		frame.getContentPane().add(btn_0);

		JButton btn_1 = new JButton("");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_1.setBackground(new Color(255, 182, 193));
				} else {
					btn_1.setBackground(new Color(135, 206, 250));
				}
				player();
				System.out.println(btn_1.getText());
				model.setBtn1(btn_1.getText());
				winner();
			}

		});
		btn_1.setBounds(104, 13, 80, 66);
		frame.getContentPane().add(btn_1);

		JButton btn_2 = new JButton("");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_2.setBackground(new Color(255, 182, 193));
				} else {
					btn_2.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn2(btn_2.getText());
				winner();
			}

		});
		btn_2.setBounds(196, 124, 80, 66);
		frame.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn_3.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_3.setBackground(new Color(255, 182, 193));
				} else {
					btn_3.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn3(btn_3.getText());
				winner();
			}

		});
		btn_3.setBounds(12, 203, 80, 66);
		frame.getContentPane().add(btn_3);

		JButton btn_4 = new JButton("");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_4.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_4.setBackground(new Color(255, 182, 193));
				} else {
					btn_4.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn4(btn_4.getText());
				winner();
			}
		});
		btn_4.setBounds(104, 203, 80, 66);
		frame.getContentPane().add(btn_4);

		JButton btn_5 = new JButton("");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_5.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_5.setBackground(new Color(255, 182, 193));
				} else {
					btn_5.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn5(btn_5.getText());
				winner();
			}
		});
		btn_5.setBounds(196, 203, 80, 66);
		frame.getContentPane().add(btn_5);

		JButton btn_6 = new JButton("");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_6.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_6.setBackground(new Color(255, 182, 193));
				} else {
					btn_6.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn6(btn_6.getText());
				winner();
			}
		});
		btn_6.setBounds(12, 282, 80, 66);
		frame.getContentPane().add(btn_6);

		JButton btn_7 = new JButton("");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_7.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_7.setBackground(new Color(255, 182, 193));
				} else {
					btn_7.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn7(btn_7.getText());
				winner();
			}
		});
		btn_7.setBounds(104, 282, 80, 66);
		frame.getContentPane().add(btn_7);

		JButton btn_8 = new JButton("");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_8.setText(model.getStartString());

				if (model.getStartString().equalsIgnoreCase("X")) {
					btn_8.setBackground(new Color(255, 182, 193));
				} else {
					btn_8.setBackground(new Color(135, 206, 250));
				}
				player();
				model.setBtn8(btn_8.getText());
				winner();
			}
		});
		btn_8.setBounds(196, 282, 80, 66);
		frame.getContentPane().add(btn_8);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.setBtn0(null);
				model.setBtn1(null);
				model.setBtn2(null);
				model.setBtn3(null);
				model.setBtn4(null);
				model.setBtn5(null);
				model.setBtn7(null);
				model.setBtn8(null);
				
				btn_0.setText(null);
				btn_1.setText(null);
				btn_2.setText(null);
				
				btn_3.setText(null);
				btn_4.setText(null);
				btn_5.setText(null);
				
				btn_6.setText(null);
				btn_7.setText(null);
				btn_8.setText(null);
				
				btn_0.setBackground(Color.LIGHT_GRAY);
				btn_1.setBackground(Color.LIGHT_GRAY);
				btn_2.setBackground(Color.LIGHT_GRAY);
				
				btn_3.setBackground(Color.LIGHT_GRAY);
				btn_4.setBackground(Color.LIGHT_GRAY);
				btn_5.setBackground(Color.LIGHT_GRAY);
				
				btn_6.setBackground(Color.LIGHT_GRAY);
				btn_7.setBackground(Color.LIGHT_GRAY);
				btn_8.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnReset.setBounds(344, 380, 97, 25);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JFrame exitFrame = new JFrame("Exit");

				if (JOptionPane.showConfirmDialog(exitFrame, "Confirm if you want to Exit", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(544, 380, 97, 25);
		frame.getContentPane().add(btnExit);

		JPanel panel = new JPanel();
		panel.setForeground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		panel.setBounds(344, 102, 304, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblone = new JLabel("Player One");
		lblone.setBounds(12, 64, 73, 16);
		panel.add(lblone);

		JLabel lbltwo = new JLabel("Player Two");
		lbltwo.setBounds(12, 123, 73, 16);
		panel.add(lbltwo);

		txtplayerOne = new JTextField();
		txtplayerOne.setBounds(126, 61, 116, 22);
		panel.add(txtplayerOne);
		txtplayerOne.setColumns(10);

		txtplayerTwo = new JTextField();
		txtplayerTwo.setColumns(10);
		txtplayerTwo.setBounds(126, 120, 116, 22);
		panel.add(txtplayerTwo);
	}
}
