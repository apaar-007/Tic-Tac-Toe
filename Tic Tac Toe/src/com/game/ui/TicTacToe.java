package com.game.ui;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
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
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TicTacToe {

	private JFrame frame;
	private JTextField txtplayerOne;
	private JTextField txtplayerTwo;
	ModelTicTacToe model = new ModelTicTacToe();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				try {
					Splash splash = new Splash();
					TicTacToe window = new TicTacToe();
					splash.setVisible(true);
					
					for (int i = 0; i <= 100; i++) {
						Thread.sleep(i);
						splash.setProgressBar(i);
						splash.setLblpercentage(Integer.toString(i)+"%");
						if (i == 100) {
							splash.dispose();
							window.frame.setVisible(true);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		if (model.getBtn0() == ("X") && model.getBtn1() == ("X") && model.getBtn2() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 1", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn0() == ("O") && model.getBtn1() == ("O") && model.getBtn2() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn3() == ("X") && model.getBtn4() == ("X") && model.getBtn5() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 2", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn3() == ("O") && model.getBtn4() == ("O") && model.getBtn5() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn6() == ("X") && model.getBtn7() == ("X") && model.getBtn8() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 3", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn6() == ("O") && model.getBtn7() == ("O") && model.getBtn8() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn0() == ("X") && model.getBtn3() == ("X") && model.getBtn6() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 4", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn0() == ("O") && model.getBtn3() == ("O") && model.getBtn6() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn1() == ("X") && model.getBtn4() == ("X") && model.getBtn7() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 5", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn1() == ("O") && model.getBtn4() == ("O") && model.getBtn7() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn2() == ("X") && model.getBtn5() == ("X") && model.getBtn8() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 6", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn2() == ("O") && model.getBtn5() == ("O") && model.getBtn8() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn0() == ("X") && model.getBtn4() == ("X") && model.getBtn8() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 7", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn0() == ("O") && model.getBtn4() == ("O") && model.getBtn8() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
		if (model.getBtn2() == ("X") && model.getBtn4() == ("X") && model.getBtn6() == ("X")) {
			JOptionPane.showMessageDialog(f, "Player X Won. 8", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountX(model.getCountX() + 1);
			score();
		}
		if (model.getBtn2() == ("O") && model.getBtn4() == ("O") && model.getBtn6() == ("O")) {
			JOptionPane.showMessageDialog(f, "Player O Won.", "Tic Tac Toe", JOptionPane.WARNING_MESSAGE);
			model.setCountO(model.getCountO() + 1);
			score();
		}
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1028, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
				model.setBtn1(btn_1.getText());
				winner();
			}

		});

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

		JButton btn_6 = new JButton("");
		btn_6.setForeground(Color.BLACK);
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

		JButton btnReset = new JButton("");
		btnReset.setBackground(SystemColor.control);
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
		Image btReset = new ImageIcon(this.getClass().getResource("/reset.png")).getImage();
		btnReset.setIcon(new ImageIcon(btReset));

		JButton btnExit = new JButton("");
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JFrame exitFrame = new JFrame("");

				if (JOptionPane.showConfirmDialog(exitFrame, "Confirm if you want to Exit", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		Image btExit = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnExit.setIcon(new ImageIcon(btExit));

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));

		JLabel lblone = new JLabel("");
		Image pl1 = new ImageIcon(this.getClass().getResource("/player1.png")).getImage();
		lblone.setIcon(new ImageIcon(pl1));

		JLabel lbltwo = new JLabel("");
		Image pl2 = new ImageIcon(this.getClass().getResource("/player2.png")).getImage();
		lbltwo.setIcon(new ImageIcon(pl2));

		txtplayerOne = new JTextField();
		txtplayerOne.setColumns(10);

		txtplayerTwo = new JTextField();
		txtplayerTwo.setColumns(10);

		JLabel logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.gif")).getImage();
		logo.setIcon(new ImageIcon(img));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(114)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_0, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_3, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_6, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_1, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_4, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_7, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_2, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_5, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
						.addComponent(btn_8, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
					.addGap(104)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(36)))
					.addGap(161))
				.addComponent(logo, GroupLayout.PREFERRED_SIZE, 1022, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(logo, GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn_0, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(13)
							.addComponent(btn_3, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(btn_6, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn_1, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(13)
							.addComponent(btn_4, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(btn_7, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btn_2, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addGap(14)
							.addComponent(btn_5, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addGap(13)
							.addComponent(btn_8, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
								.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))))
					.addGap(112))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(9)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblone, GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE).addGap(26)
								.addComponent(txtplayerOne))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lbltwo, GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE).addGap(26)
								.addComponent(txtplayerTwo, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
				.addGap(59)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(58)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(3).addComponent(lblone,
										GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE))
								.addComponent(txtplayerOne))
						.addGap(37)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(3).addComponent(lbltwo,
										GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE))
								.addComponent(txtplayerTwo))
						.addGap(70)));
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
