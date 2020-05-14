package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.AccountsPayable;
import model.CreditType;
import model.Debtor;
import model.DocumentType;
import model.Term;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class RegisterW extends JFrame {
	
	private AccountsPayable book;

	private JPanel contentPane;
	private JTextField textField_Name;
	private JLabel lblAdress;
	private JTextField textField_Adress;
	private JLabel lblCredit;
	private JLabel lblInitialDate;
	private JTextField textField_InitialDate;
	private JLabel lblID;
	private JTextField textField_ID;
	private JLabel lblPhone;
	private JTextField textField_Phone;
	private JLabel lblDebt;
	private JTextField textField_Debt;
	private JLabel lblFinalDate;
	private JTextField textField_FinalDate;
	private JButton btnOk;
	private JButton btnCancel;
	private JTextField textField_Age;
	private JTextField textField_LastName;
	private JTextField textField_NameCompany;
	private JLabel lblNameCompany;
	private JTextField textField_Salary;
	private JRadioButton rdbtn_2Periods;
	private JRadioButton rdbtn_1Period;
	private JRadioButton rdbtn_3Periods;
	private JRadioButton rdbtn_MoreThan3Periods;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterW frame = new RegisterW();
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
	public RegisterW() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Registrar Cliente");
		setBounds(100, 100, 900, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Name = new JTextField();
		textField_Name.setColumns(10);
		textField_Name.setBounds(10, 56, 174, 22);
		contentPane.add(textField_Name);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(10, 40, 129, 14);
		contentPane.add(lblName);
		
		lblAdress = new JLabel("Direcci\u00F3n");
		lblAdress.setForeground(Color.BLACK);
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdress.setBounds(10, 138, 129, 14);
		contentPane.add(lblAdress);
		
		textField_Adress = new JTextField();
		textField_Adress.setColumns(10);
		textField_Adress.setBounds(10, 154, 174, 22);
		contentPane.add(textField_Adress);
		
		lblCredit = new JLabel("Tipo de Credito");
		lblCredit.setForeground(Color.BLACK);
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCredit.setBounds(473, 138, 129, 14);
		contentPane.add(lblCredit);
		
		lblInitialDate = new JLabel("Fecha inicio");
		lblInitialDate.setForeground(Color.BLACK);
		lblInitialDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInitialDate.setBounds(473, 89, 129, 14);
		contentPane.add(lblInitialDate);
		
		textField_InitialDate = new JTextField();
		textField_InitialDate.setColumns(10);
		textField_InitialDate.setBounds(473, 105, 174, 22);
		contentPane.add(textField_InitialDate);
		
		lblID = new JLabel("Documento de identificacion");
		lblID.setForeground(Color.BLACK);
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblID.setBounds(10, 192, 156, 14);
		contentPane.add(lblID);
		
		textField_ID = new JTextField();
		textField_ID.setColumns(10);
		textField_ID.setBounds(10, 208, 414, 22);
		contentPane.add(textField_ID);
		
		lblPhone = new JLabel("Tel\u00E9fono");
		lblPhone.setForeground(Color.BLACK);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPhone.setBounds(250, 138, 129, 14);
		contentPane.add(lblPhone);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(250, 154, 174, 22);
		contentPane.add(textField_Phone);
		
		lblDebt = new JLabel("Valor de deuda");
		lblDebt.setForeground(Color.BLACK);
		lblDebt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDebt.setBounds(670, 40, 129, 14);
		contentPane.add(lblDebt);
		
		textField_Debt = new JTextField();
		textField_Debt.setColumns(10);
		textField_Debt.setBounds(670, 56, 174, 22);
		contentPane.add(textField_Debt);
		
		lblFinalDate = new JLabel("Fecha fin");
		lblFinalDate.setForeground(Color.BLACK);
		lblFinalDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFinalDate.setBounds(670, 89, 129, 14);
		contentPane.add(lblFinalDate);
		
		textField_FinalDate = new JTextField();
		textField_FinalDate.setColumns(10);
		textField_FinalDate.setBounds(670, 105, 174, 22);
		contentPane.add(textField_FinalDate);			
		
		JRadioButton rdbtn_PersonaNatural = new JRadioButton("Persona Natural");
		rdbtn_PersonaNatural.setBounds(10, 7, 129, 23);
		contentPane.add(rdbtn_PersonaNatural);
		
		JRadioButton rdbtn_PersonaJuridica = new JRadioButton("Persona Juridica");
		rdbtn_PersonaJuridica.setBounds(139, 7, 141, 23);
		contentPane.add(rdbtn_PersonaJuridica);
		
		textField_Age = new JTextField();
		textField_Age.setColumns(10);
		textField_Age.setBounds(250, 105, 174, 22);
		contentPane.add(textField_Age);
		
		JLabel lblAge = new JLabel("Edad");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAge.setBounds(250, 89, 129, 14);
		contentPane.add(lblAge);
		
		textField_LastName = new JTextField();
		textField_LastName.setColumns(10);
		textField_LastName.setBounds(10, 105, 174, 22);
		contentPane.add(textField_LastName);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(Color.BLACK);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(10, 89, 129, 14);
		contentPane.add(lblApellido);
		
		JRadioButton rdbtn_DriverLicense = new JRadioButton("Licencia de Conduccion");
		rdbtn_DriverLicense.setBounds(104, 238, 165, 23);
		contentPane.add(rdbtn_DriverLicense);
		
		JRadioButton rdbtn_ID = new JRadioButton("Cedula");
		rdbtn_ID.setBounds(10, 237, 77, 23);
		contentPane.add(rdbtn_ID);
		
		JRadioButton rdbtn_Passport = new JRadioButton("Pasaporte");
		rdbtn_Passport.setBounds(295, 238, 95, 23);
		contentPane.add(rdbtn_Passport);
		
		textField_NameCompany = new JTextField();
		textField_NameCompany.setColumns(10);
		textField_NameCompany.setBounds(250, 56, 174, 22);
		contentPane.add(textField_NameCompany);
		
		lblNameCompany = new JLabel("Nombre Compa\u00F1ia");
		lblNameCompany.setForeground(Color.BLACK);
		lblNameCompany.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNameCompany.setBounds(250, 40, 129, 14);
		contentPane.add(lblNameCompany);
		
		JLabel lblTerm = new JLabel("Duraci\u00F3n");
		lblTerm.setForeground(Color.BLACK);
		lblTerm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTerm.setBounds(473, 192, 129, 14);
		contentPane.add(lblTerm);
		
		textField_Salary = new JTextField();
		textField_Salary.setColumns(10);
		textField_Salary.setBounds(473, 56, 174, 22);
		contentPane.add(textField_Salary);
		
		JLabel lblSalary = new JLabel("Salario");
		lblSalary.setForeground(Color.BLACK);
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalary.setBounds(473, 40, 129, 14);
		contentPane.add(lblSalary);
		
		JRadioButton rdbtn_Credit = new JRadioButton("Credito");
		rdbtn_Credit.setBounds(704, 154, 95, 23);
		contentPane.add(rdbtn_Credit);
		
		JRadioButton rdbtn_PromissoryNotes = new JRadioButton("Letra de Cambio");
		rdbtn_PromissoryNotes.setBounds(567, 155, 165, 23);
		contentPane.add(rdbtn_PromissoryNotes);
		
		JRadioButton rdbtn_Exchange = new JRadioButton("Exchance");
		rdbtn_Exchange.setBounds(473, 154, 92, 23);
		contentPane.add(rdbtn_Exchange);
		
		JRadioButton rdbtn_2Periods = new JRadioButton("2 Periodos");
		rdbtn_2Periods.setBounds(473, 238, 100, 23);
		contentPane.add(rdbtn_2Periods);
		
		JRadioButton rdbtn_1Period = new JRadioButton("1 Periodo");
		rdbtn_1Period.setBounds(473, 208, 89, 23);
		contentPane.add(rdbtn_1Period);
		
		JRadioButton rdbtn_3Periods = new JRadioButton("3 Periodos");
		rdbtn_3Periods.setBounds(587, 208, 100, 23);
		contentPane.add(rdbtn_3Periods);
		
		JRadioButton rdbtn_MoreThan3Periods = new JRadioButton("Mayor a 3 Periodos");
		rdbtn_MoreThan3Periods.setBounds(587, 238, 145, 23);
		contentPane.add(rdbtn_MoreThan3Periods);
		
		btnOk = new JButton("Aceptar");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//*OBTIENE LOS VALORES DE LOS CAMPOS DE TEXTO
				String adress = textField_Adress.getText();
				String debt = textField_Debt.getText();
				double debtV= Double.parseDouble(debt);
				String finalDate = textField_FinalDate.getText();
				String id = textField_ID.getText();
				int nID = Integer.parseInt(id);
				String initialDate = textField_InitialDate.getText();
				String name = textField_Name.getText();
				String phone = textField_Phone.getText();
				String age = textField_Age.getText();
				int a = Integer.parseInt(age);
				String lastName = textField_LastName.getText();
				String nCompany = textField_NameCompany.getText();
				String salary = textField_Salary.getText();
				double salaryV= Double.parseDouble(salary);
				
				//*OBTIENE EL TIPO DE DOCUMENTO
				DocumentType dcType = null;
				
				if(rdbtn_ID.isSelected()) {
					dcType = DocumentType.ID;
					System.out.println("cedula");
				}else if(rdbtn_DriverLicense.isSelected()) {
					dcType = DocumentType.DRIVER_LICENSE;
				}else if(rdbtn_Passport.isSelected()) {
					dcType = DocumentType.PASSPORT;
				}
				
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
				
				
				//*AGREGA UN DEUDOR A EL LIBRO DE DEUDORES
				book.addDebtor(a, dcType, name, lastName, nCompany, nID, adress, phone, salaryV, debtV, cdType, t);
				
				
				//*OBTIENE EL DUEDOR RECIEN CREADO
				Debtor d= book.searchByID(nID);
				
				RegisterWBill bill = new RegisterWBill(d);
				
				//*METODO PARA QUE LA VENTANA DE FACTURA RECIBA EL DEUDOR
				bill.setDebtor(d);
				bill.setVisible(true);
				
				
				
				RegisterW.this.dispose();
				MenuW menu = new MenuW();
				
				//*METODO PARA ENVIAR EL LIBRO DE DEUDORES ACTUALIZADO AL MENU PRINCIPAL
				menu.setBook(book);
				menu.setVisible(true);
			}
		});
		btnOk.setBounds(122, 287, 89, 23);
		contentPane.add(btnOk);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//MenuW menu = new MenuW();
				//menu.setVisible(true);
				//RegisterW.this.dispose();
			}
		});
		btnCancel.setBounds(247, 287, 89, 23);
		contentPane.add(btnCancel);
	}
	
	public void setBook(AccountsPayable b) {
		book = b;
	}
}
