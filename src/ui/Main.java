package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import model.AccountsPayable;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField_User;
	private JTextField textField_Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Iniciar Sesión");
		setSize(450, 250);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lnlUser = new JLabel("User:");
		lnlUser.setForeground(Color.BLACK);
		lnlUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lnlUser.setBounds(100, 57, 46, 14);
		contentPane.add(lnlUser);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setForeground(Color.BLACK);
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPass.setBounds(100, 104, 70, 14);
		contentPane.add(lblPass);
		
		textField_User = new JTextField();		
		textField_User.setBounds(182, 54, 135, 22);
		contentPane.add(textField_User);
		textField_User.setColumns(10);
		
		textField_Pass = new JTextField();
		textField_Pass.setBounds(182, 101, 135, 22);
		contentPane.add(textField_Pass);
		textField_Pass.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccountsPayable book = new AccountsPayable();
				MenuW menu = new MenuW();
				menu.setBook(book);
				
				menu.setVisible(true);
				Main.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(182, 150, 70, 25);
		contentPane.add(btnNewButton);
		
	
	}	

}
