package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReceivablesW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceivablesW frame = new ReceivablesW();
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
	public ReceivablesW() {
		setResizable(false);
		setTitle("Clientes por cobrar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane_Results = new JTextPane();
		textPane_Results.setSelectionColor(Color.CYAN);
		textPane_Results.setEditable(false);
		textPane_Results.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textPane_Results.setBounds(10, 74, 414, 176);
		contentPane.add(textPane_Results);
		
		JLabel lbl_listReceivables = new JLabel("Listado de Clientes por cobrar");
		lbl_listReceivables.setForeground(Color.BLACK);
		lbl_listReceivables.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl_listReceivables.setBounds(95, 36, 260, 20);
		contentPane.add(lbl_listReceivables);
		
		JButton btnBack1 = new JButton("Atras");
		btnBack1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuW menu = new MenuW();
				menu.setVisible(true);
				ReceivablesW.this.dispose();
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
