package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.AccountsPayable;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuW extends JFrame {
	
	private AccountsPayable book;

	private JPanel contentPane;
	private JTextField txtClientRegister;
	private JTextField txtSearch;
	private JButton btnSearch;
	private JTextField txtSearchByInterval;
	private JButton btnSearchbyInterval;
	private JTextField txtPayments;
	private JButton btnPayments;
	private JTextField txtReceivables;
	private JButton btnReceivables;
	private JTextField txtArrearClients;
	private JButton btnArrearClients;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuW frame = new MenuW();
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
	public MenuW() {		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu Principal");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtClientRegister = new JTextField();
		txtClientRegister.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
		txtClientRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtClientRegister.setEditable(false);
		txtClientRegister.setText("Registrar Cliente");
		txtClientRegister.setColumns(10);
		txtClientRegister.setBounds(10, 38, 174, 22);
		contentPane.add(txtClientRegister);		
		
		
		txtSearch = new JTextField();
		txtSearch.setText("Buscar Cliente");
		txtSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSearch.setEditable(false);
		txtSearch.setColumns(10);
		txtSearch.setBounds(10, 71, 174, 22);
		contentPane.add(txtSearch);		
		
		
		txtSearchByInterval = new JTextField();
		txtSearchByInterval.setText("Buscar por intervalo");
		txtSearchByInterval.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSearchByInterval.setEditable(false);
		txtSearchByInterval.setColumns(10);
		txtSearchByInterval.setBounds(10, 104, 174, 22);
		contentPane.add(txtSearchByInterval);
		
		btnSearchbyInterval = new JButton("Ir");
		btnSearchbyInterval.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchByInterval sInterval = new SearchByInterval();
				sInterval.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnSearchbyInterval.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSearchbyInterval.setBounds(184, 104, 89, 22);
		contentPane.add(btnSearchbyInterval);
		
		txtPayments = new JTextField();
		txtPayments.setText("Pagos recibidos");
		txtPayments.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPayments.setEditable(false);
		txtPayments.setColumns(10);
		txtPayments.setBounds(10, 137, 174, 22);
		contentPane.add(txtPayments);
		
		btnPayments = new JButton("Ir");
		btnPayments.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PaymentsW payments = new PaymentsW();
				payments.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnPayments.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPayments.setBounds(184, 137, 89, 22);
		contentPane.add(btnPayments);
		
		txtReceivables = new JTextField();
		txtReceivables.setText("Clientes a cobrar");
		txtReceivables.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtReceivables.setEditable(false);
		txtReceivables.setColumns(10);
		txtReceivables.setBounds(10, 170, 174, 22);
		contentPane.add(txtReceivables);
		
		btnReceivables = new JButton("Ir");
		btnReceivables.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReceivablesW r = new ReceivablesW();
				r.setBook(book);
				r.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnReceivables.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReceivables.setBounds(184, 170, 89, 22);
		contentPane.add(btnReceivables);
		
		txtArrearClients = new JTextField();
		txtArrearClients.setText("Clientes en mora");
		txtArrearClients.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtArrearClients.setEditable(false);
		txtArrearClients.setColumns(10);
		txtArrearClients.setBounds(10, 203, 174, 22);
		contentPane.add(txtArrearClients);
		
		btnArrearClients = new JButton("Ir");
		btnArrearClients.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrearClients arrearC = new ArrearClients();
				arrearC.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnArrearClients.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnArrearClients.setBounds(184, 203, 89, 22);
		contentPane.add(btnArrearClients);
		
		//------------------BOTON REGISTRAR CLIENTE--------------------------
		JButton btnRegister = new JButton("Ir");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterW register = new RegisterW();
				register.setBook(book);
				register.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegister.setBounds(184, 38, 89, 22);
		contentPane.add(btnRegister);
		
		//------------------BOTON BUSCAR CLIENTE--------------------------
		
		btnSearch = new JButton("Ir");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchW search = new SearchW();
				search.setBook(book);
				search.setVisible(true);
				MenuW.this.dispose();
			}
		});
		btnSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSearch.setBounds(184, 71, 89, 22);
		contentPane.add(btnSearch);
		
		//--------------------------------------
		
		
		
	}

	public void setBook(AccountsPayable b) {
		book = b;
	}

}

