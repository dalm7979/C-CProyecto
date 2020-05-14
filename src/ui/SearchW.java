package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.AccountsPayable;
import model.Debtor;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchW extends JFrame {
	private AccountsPayable book;
	private JPanel contentPane;
	private JTextField textField_ID;
	private JTextField textField_Billid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchW frame = new SearchW();
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
	public SearchW() {
		setResizable(false);
		setTitle("Buscar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(134, 65, 174, 22);
		contentPane.add(textField_ID);
		
		JLabel lblID = new JLabel("Cedula o NIT");
		lblID.setForeground(Color.BLACK);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblID.setBounds(134, 49, 129, 14);
		contentPane.add(lblID);
		
		textField_Billid = new JTextField();
		textField_Billid.setColumns(10);
		textField_Billid.setBounds(134, 133, 174, 22);
		contentPane.add(textField_Billid);
		
		JLabel lblBillid = new JLabel("Numero de Factura");
		lblBillid.setForeground(Color.BLACK);
		lblBillid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBillid.setBounds(134, 117, 129, 14);
		contentPane.add(lblBillid);
		
		JButton btnOk = new JButton("Aceptar");
		btnOk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnOk.setBounds(181, 196, 88, 23);
		contentPane.add(btnOk);
		
		JButton btnBack1 = new JButton("Atras");
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuW menu = new MenuW();
				menu.setVisible(true);
				SearchW.this.dispose();
			}
		});
		btnBack1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack1.setOpaque(false);
		btnBack1.setBackground(Color.LIGHT_GRAY);
		btnBack1.setBorder(null);
		btnBack1.setBounds(10, 11, 60, 18);
		contentPane.add(btnBack1);
		
		JButton btnBack2 = new JButton("Atras");

		btnBack2.setVisible(false);
		btnBack2.setEnabled(false);
		btnBack2.setOpaque(false);
		btnBack2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack2.setBorder(null);
		btnBack2.setBackground(Color.LIGHT_GRAY);
		btnBack2.setBounds(10, 11, 60, 18);
		contentPane.add(btnBack2);
		
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id=0;
				int billID=0;
				id = Integer.parseInt(textField_ID.getText());
				System.out.println(id);
				billID = Integer.parseInt(textField_Billid.getText());
				System.out.println(billID);
				DebtorFound df = new DebtorFound(book, id,billID);
				System.out.println("cliente añadido correctamentes");
				df.setVisible(true);
				System.out.println("ventana abierta");
				SearchW.this.dispose();
				
			}
		});
		
		btnBack2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblID.setVisible(true);
				lblBillid.setVisible(true);
				textField_ID.setVisible(true);
				textField_Billid.setVisible(true);
				btnOk.setVisible(true);
				btnBack1.setVisible(true);
				btnBack1.setEnabled(true);

			}
		});
		
	}
	
	public void setBook(AccountsPayable b) {
		book = b;
	}
}
