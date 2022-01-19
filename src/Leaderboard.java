
/*
 * Author: Chun-Kit Chung
 * Description: instructions frame for instructions on snake game
 * Date: 05/27/2018
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Leaderboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leaderboard window = new Leaderboard();
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
	public Leaderboard() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// creates frame
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(50, 30, 805, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// create text area for the leaderboard
		JTextArea title = new JTextArea();
		title.setEditable(false);
		title.setRows(4);
		title.setFont(new Font("Early GameBoy", Font.PLAIN, 35));
		title.setBackground(Color.BLACK);
		title.setForeground(Color.WHITE);
		title.setText("All Time Leaderboard");
		title.setBounds(34, 37, 670, 35);
		frame.getContentPane().add(title);

		// create text area for the leaderboard
		JTextArea leaderboard = new JTextArea();
		leaderboard.setEditable(false);
		leaderboard.setRows(4);
		leaderboard.setFont(new Font("Early GameBoy", Font.PLAIN, 20));
		leaderboard.setBackground(Color.BLACK);
		leaderboard.setForeground(Color.WHITE);
		leaderboard.setText("Rank    Name\tScore\t\tTime");
		leaderboard.setBounds(34, 97, 755, 248);
		frame.getContentPane().add(leaderboard);

		frame.getContentPane().setFocusable(true);
		frame.getContentPane().addKeyListener(new KeyAdapter() {

			@SuppressWarnings("static-access")
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {// if you press the left arrow key, it returns you back to the
															// menu
					Menu menu = null;
					try {
						menu = new Menu();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					menu.main(null);
					frame.setVisible(false);
				}
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
