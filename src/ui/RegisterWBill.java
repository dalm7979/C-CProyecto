package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import model.Credit;
import model.Debtor;

public class RegisterWBill extends JFrame {
	
	Debtor d=null;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debtor e = null;
					RegisterWBill frame = new RegisterWBill(e);
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
	public RegisterWBill(Debtor e) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane_Bill = new JTextPane();
		textPane_Bill.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textPane_Bill.setEditable(false);
		textPane_Bill.setText("Factura");
		textPane_Bill.setBounds(10, 11, 233, 239);
		contentPane.add(textPane_Bill);
		
		JButton btnPrint = new JButton("Imprimir");
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setBounds(296, 81, 89, 23);
		contentPane.add(btnPrint);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setBounds(296, 127, 89, 23);
		contentPane.add(btnSave);
		
		setDebtor(e);
		
		ArrayList<Credit> credits = d.showCredits();

		textPane_Bill.setText("Nombre: " + d.getName() + " " + d.getLastName() + "\n" +
							"Valor Deuda: " + credits.get(credits.size()-1).getValue() + "\n"+
							"ID Factura: " + credits.get(credits.size()-1).getId() + "\n");		
	}
	
	public void setDebtor(Debtor e) {
		d = e;
	}	

	
}
