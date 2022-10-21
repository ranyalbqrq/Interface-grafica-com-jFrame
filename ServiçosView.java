import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServiçosView extends JFrame {

	private JPanel contentPane;
	private JTextField txtServios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServiçosView frame = new ServiçosView();
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
	public ServiçosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnIndenizaoIntegralE = new JTextPane();
		txtpnIndenizaoIntegralE.setText("Indenização integral e parcial, em casos de colisão, incêndio, roubo, furto e alagamento.");
		txtpnIndenizaoIntegralE.setBounds(10, 66, 126, 99);
		contentPane.add(txtpnIndenizaoIntegralE);
		
		JTextPane txtpnIndenizaoParaDanos = new JTextPane();
		txtpnIndenizaoParaDanos.setText("Indenização para danos materiais e danos corporais, em casos de acidentes com terceiros.");
		txtpnIndenizaoParaDanos.setBounds(147, 176, 126, 62);
		contentPane.add(txtpnIndenizaoParaDanos);
		
		JLabel lblNewLabel = new JLabel("COBERTURA TOTAL ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 41, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COBERTURA A TERCEIROS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(146, 158, 141, 14);
		contentPane.add(lblNewLabel_1);
		
		txtServios = new JTextField();
		txtServios.setHorizontalAlignment(SwingConstants.CENTER);
		txtServios.setToolTipText("");
		txtServios.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtServios.setText("Serviços");
		txtServios.setBounds(0, 0, 434, 20);
		contentPane.add(txtServios);
		txtServios.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("COBERTURA A PASSAGEIROS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(260, 41, 164, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnIndenizaoParaDanos_1 = new JTextPane();
		txtpnIndenizaoParaDanos_1.setText("Indenização para danos corporais causados aos passageiros do veículo, em caso de acidente.");
		txtpnIndenizaoParaDanos_1.setBounds(279, 66, 126, 99);
		contentPane.add(txtpnIndenizaoParaDanos_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
