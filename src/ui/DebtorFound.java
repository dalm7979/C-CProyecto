package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import model.AccountsPayable;
import model.Credit;
import model.Debtor;

import java.awt.Color;

public class DebtorFound extends JFrame {
	private static AccountsPayable book;
	private JPanel contentPane;
	private JTextField txtClienteInformation;
	private JTextField txtAddPayment;
	private JTextField txtAddNewCredit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int id =0;
					int billID = 0;
					DebtorFound frame = new DebtorFound(book, id, billID);
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
	public DebtorFound(AccountsPayable b, int id, int billID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		Debtor debtor1 = searchInformation(b, id, billID);
		ArrayList<Credit> credits = debtor1.showCredits();	

		
		
		
		JLabel lblDebtorName = new JLabel(debtor1.getName() + " " + debtor1.getLastName());
		lblDebtorName.setFont(new Font("Arial", Font.BOLD, 18));
		
		txtClienteInformation = new JTextField();
		txtClienteInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtClienteInformation.setEditable(false);
		txtClienteInformation.setText("Informacion Cliente");
		txtClienteInformation.setColumns(10);
		
		JButton btnClientInformation = new JButton("Ir");
		
		JButton btnAddPayment = new JButton("Ir");
		
		txtAddPayment = new JTextField();
		txtAddPayment.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAddPayment.setText("Agregar Abono");
		txtAddPayment.setEditable(false);
		txtAddPayment.setColumns(10);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		DefaultListModel listModel = new DefaultListModel();
		
		JButton btnAdd = new JButton("Agregar Abono");
		
		JButton btnAddNewCredit = new JButton("Ir");
		
		txtAddNewCredit = new JTextField();
		txtAddNewCredit.setText("Registrar nuevo credito");
		txtAddNewCredit.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAddNewCredit.setEditable(false);
		txtAddNewCredit.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblDebtorName, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtClienteInformation, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnClientInformation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(txtAddPayment, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnAddPayment, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtAddNewCredit, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddNewCredit, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(154)
							.addComponent(btnAdd)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblDebtorName)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtClienteInformation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClientInformation))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAddPayment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddPayment))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAddNewCredit, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddNewCredit))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(btnAdd))
		);
		contentPane.setLayout(gl_contentPane);
		
		//----------------------Boton abono-----------------
		btnAddPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0; i<credits.size(); i++) {
					String index = "Credito: ";
					Credit c = credits.get(0);
					int value = (int) c.getValue();
					int billNumber = c.getId();
					index = index + " | Valor del Credito: " + value + " | N° Factura: " +billNumber;
					
				    listModel.add(i, index);
				}
				
				list.setModel(listModel);
				
			}
		});
		
		//-----------------BOTON NUEVO CREDITO---------------------
		btnAddNewCredit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
	
	//--------------METODOS----------------------
	
	public void setBook(AccountsPayable b) {
		book = b;
	}
	
	public Debtor searchInformation(AccountsPayable b, int id, int billID) {
		setBook(b);
		Debtor d=null;
		
		if(id == 0) {
			d = book.searchByBillID(billID);
			
		}else {
			d = book.searchByID(id);
		}
		
		return d;
		
	}
	
}
