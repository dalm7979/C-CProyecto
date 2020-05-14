package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchByInterval extends JFrame {

	private JPanel contentPane;
	private JTextField txt_1period;
	private JTextField txt_2period;
	private JTextField txt_3period;
	private JTextField txt_Nperiod;
	private JButton btnBack1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchByInterval frame = new SearchByInterval();
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
	public SearchByInterval() {
		setTitle("Buscar por intervalo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_1period = new JTextField();
		txt_1period.setText("0-30 dias");
		txt_1period.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_1period.setEditable(false);
		txt_1period.setColumns(10);
		txt_1period.setBounds(10, 50, 174, 22);
		contentPane.add(txt_1period);
		
		JButton btn_1period = new JButton("Ir");
		btn_1period.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchByIntervalResults results = new SearchByIntervalResults();
				results.setVisible(true);
				SearchByInterval.this.dispose();
			}
		});
		btn_1period.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1period.setBounds(184, 50, 89, 22);
		contentPane.add(btn_1period);
		
		txt_2period = new JTextField();
		txt_2period.setText("31-60 dias");
		txt_2period.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_2period.setEditable(false);
		txt_2period.setColumns(10);
		txt_2period.setBounds(10, 83, 174, 22);
		contentPane.add(txt_2period);
		
		JButton btn_2period = new JButton("Ir");
		btn_2period.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchByIntervalResults results = new SearchByIntervalResults();
				results.setVisible(true);
				SearchByInterval.this.dispose();
			}
		});
		btn_2period.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2period.setBounds(184, 83, 89, 22);
		contentPane.add(btn_2period);
		
		txt_3period = new JTextField();
		txt_3period.setText("61-90 dias");
		txt_3period.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_3period.setEditable(false);
		txt_3period.setColumns(10);
		txt_3period.setBounds(10, 116, 174, 22);
		contentPane.add(txt_3period);
		
		JButton btn_3period = new JButton("Ir");
		btn_3period.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchByIntervalResults results = new SearchByIntervalResults();
				results.setVisible(true);
				SearchByInterval.this.dispose();
			}
		});
		btn_3period.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3period.setBounds(184, 116, 89, 22);
		contentPane.add(btn_3period);
		
		JButton btn_Nperiod = new JButton("Ir");
		btn_Nperiod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchByIntervalResults results = new SearchByIntervalResults();
				results.setVisible(true);
				SearchByInterval.this.dispose();
			}
		});
		btn_Nperiod.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Nperiod.setBounds(184, 149, 89, 22);
		contentPane.add(btn_Nperiod);
		
		txt_Nperiod = new JTextField();
		txt_Nperiod.setText("Mayor a 91 dias");
		txt_Nperiod.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_Nperiod.setEditable(false);
		txt_Nperiod.setColumns(10);
		txt_Nperiod.setBounds(10, 149, 174, 22);
		contentPane.add(txt_Nperiod);
		
		btnBack1 = new JButton("Atras");

		btnBack1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuW menu = new MenuW();
				menu.setVisible(true);
				SearchByInterval.this.dispose();
			}
		});
		btnBack1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack1.setOpaque(false);
		btnBack1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack1.setBorder(null);
		btnBack1.setBackground(Color.LIGHT_GRAY);
		btnBack1.setBounds(10, 11, 60, 18);
		contentPane.add(btnBack1);
	}

}
