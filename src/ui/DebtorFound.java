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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import model.CreditType;
import model.Debtor;
import model.Term;

import java.awt.Color;
import javax.swing.JRadioButton;

public class DebtorFound extends JFrame {
	private static AccountsPayable book;
	private JPanel contentPane;
	private JTextField textNewCreditValue;
	private JTextField textField;
	ArrayList<Credit> credits;

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
		setBounds(100, 100, 629, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		Debtor debtor1 = searchInformation(b, id, billID);
		credits = debtor1.showCredits();	

		
		
		
		JLabel lblDebtorName = new JLabel(debtor1.getName() + " " + debtor1.getLastName());
		lblDebtorName.setFont(new Font("Arial Narrow", Font.ITALIC, 18));
		
		JButton btnAddPayment = new JButton("mostrar creditos actuales");
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		DefaultListModel listModel = new DefaultListModel();
		
		JButton btnAdd = new JButton("Agregar Abono");
		
		
		
		JLabel lbl_IDNumber = new JLabel("N\u00B0 Identifiacion: " + debtor1.getNumberID());
		
		JLabel lbl_Adress = new JLabel("Direccion: " + debtor1.getAdress());
		
		JLabel lbl_Phone = new JLabel("Telefono: " + debtor1.getPhone());
		
		JLabel lbl_Age = new JLabel("Edad: " + debtor1.getAge());
		
		JLabel lbl_Company = new JLabel("Compa\u00F1ia: " + debtor1.getNameCompany());
		
		JLabel lbl_Salary = new JLabel("Salario: " + debtor1.getSalary());
		
		JLabel lblNewCredit = new JLabel("Registrar Nuevo Credito");
		lblNewCredit.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textNewCreditValue = new JTextField();
		textNewCreditValue.setColumns(10);
		
		JLabel lblDebt = new JLabel("Valor de deuda");
		lblDebt.setForeground(Color.BLACK);
		lblDebt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblCredit = new JLabel("Tipo de Credito");
		lblCredit.setForeground(Color.BLACK);
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtn_Exchange = new JRadioButton("Exchance");
		
		JRadioButton rdbtn_PromissoryNotes = new JRadioButton("Letra de Cambio");
		
		JRadioButton rdbtn_Credit = new JRadioButton("Credito");
		
		JLabel lblTerm = new JLabel("Duraci\u00F3n");
		lblTerm.setForeground(Color.BLACK);
		lblTerm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtn_1Period = new JRadioButton("1 Periodo");
		
		JRadioButton rdbtn_2Periods = new JRadioButton("2 Periodos");
		
		JRadioButton rdbtn_MoreThan3Periods = new JRadioButton("Mayor a 3 Periodos");
		
		JRadioButton rdbtn_3Periods = new JRadioButton("3 Periodos");
		
		JButton btnNewCredit = new JButton("Registrar Credito");
		
		JLabel lblAbonarAUn = new JLabel("Abonar a un Credito");
		lblAbonarAUn.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDebt_1 = new JLabel("Valor de deuda");
		lblDebt_1.setForeground(Color.BLACK);
		lblDebt_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("Seleccion el credito al cual hacer el abono");
		
		JButton btnBack1 = new JButton("Atras");
		btnBack1.setOpaque(false);
		btnBack1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack1.setBorder(null);
		btnBack1.setBackground(Color.LIGHT_GRAY);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(241)
					.addComponent(btnAdd)
					.addContainerGap(257, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnAddPayment, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDebt_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(66)
									.addComponent(lblNewLabel)))
							.addPreferredGap(ComponentPlacement.RELATED, 190, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAbonarAUn, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewCredit, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 4, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTerm, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 339, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtn_1Period, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtn_2Periods, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtn_3Periods, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtn_MoreThan3Periods, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDebt, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(textNewCreditValue, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCredit, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtn_Exchange, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(137)
											.addComponent(rdbtn_Credit, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
										.addComponent(rdbtn_PromissoryNotes, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewCredit)
							.addPreferredGap(ComponentPlacement.RELATED, 341, GroupLayout.PREFERRED_SIZE)))
					.addGap(40))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_Age, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_IDNumber, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lbl_Adress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lbl_Company, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lbl_Salary, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lbl_Phone, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBack1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(533, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDebtorName, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnBack1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDebtorName)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbl_IDNumber)
								.addComponent(lbl_Phone))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbl_Age)
								.addComponent(lbl_Salary)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lbl_Adress)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_Company)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewCredit)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDebt)
							.addGap(2)
							.addComponent(textNewCreditValue, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCredit)
							.addGap(2)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtn_Exchange)
								.addComponent(rdbtn_Credit)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(1)
									.addComponent(rdbtn_PromissoryNotes)))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblTerm)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtn_1Period)
						.addComponent(rdbtn_2Periods)
						.addComponent(rdbtn_3Periods)
						.addComponent(rdbtn_MoreThan3Periods))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewCredit)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAbonarAUn, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDebt_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddPayment, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAdd))
		);
		contentPane.setLayout(gl_contentPane);
		
		//----------------------Boton abono-----------------
		btnAddPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listModel.removeAllElements();
				for(int i=0; i<credits.size(); i++) {
					String index = "Credito: ";
					Credit c = credits.get(i);
					int value = (int) c.getValue();
					int billNumber = c.getId();
					index = index + " | Valor del Credito: " + value + " | N° Factura: " +billNumber;
					
				    listModel.add(i, index);
				}
				
				list.setModel(listModel);
				
			}
		});
		
		btnNewCredit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double debtV= Double.parseDouble(textNewCreditValue.getText());
				
				//*OBTIENE EL TIPO DE CREDITO
				CreditType cdType = null;
				
				if(rdbtn_Exchange.isSelected()) {
					cdType = CreditType.EXCHANGE;
				}else if(rdbtn_PromissoryNotes.isSelected()) {
					cdType = CreditType.PROMISSORY_NOTES;
				}else if(rdbtn_Credit.isSelected()) {
					cdType = CreditType.CREDIT;
				}
				
				//*OBTIENE LA DURACION DEL CREDITO
				Term t = null;
				
				if(rdbtn_1Period.isSelected()) {
					t = Term.PERIODS_1;
				}else if(rdbtn_2Periods.isSelected()) {
					t = Term.PERIODS_2;
				}else if(rdbtn_3Periods.isSelected()) {
					t = Term.PERIODS_3;
				}else if(rdbtn_MoreThan3Periods.isSelected()) {
					t = Term.GREATER_THAN_3_PERIODS;
				}
				
				debtor1.newCredit(t, cdType, debtV);
				book.setRef(debtor1.getRef());
				
				for(int i=0; i<credits.size(); i++) {
					String index = "Credito: ";
					Credit c = credits.get(i);
					int value = (int) c.getValue();
					int billNumber = c.getId();
					System.out.println(index + " | Valor del Credito: " + value + " | N° Factura: " +billNumber);					

				}
				
			}
		});
		
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuW menu = new MenuW();
				menu.setVisible(true);
				DebtorFound.this.dispose();
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
