import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrecosView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrecosView frame = new PrecosView();
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
	public PrecosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COBERTURA TOTAL ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 34, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COBERTURA A TERCEIROS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 163, 158, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("COBERTURA A PASSAGEIROS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 107, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPreos = new JTextField();
		txtPreos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPreos.setHorizontalAlignment(SwingConstants.CENTER);
		txtPreos.setText("Preços");
		txtPreos.setBounds(0, 0, 434, 23);
		contentPane.add(txtPreos);
		txtPreos.setColumns(10);
		
		JTextPane txtpnR = new JTextPane();
		txtpnR.setText("R$ 300,00");
		txtpnR.setBounds(10, 59, 91, 20);
		contentPane.add(txtpnR);
		
		JTextPane txtpnR_2 = new JTextPane();
		txtpnR_2.setText("R$ 100,00");
		txtpnR_2.setBounds(10, 198, 91, 20);
		contentPane.add(txtpnR_2);
		
		JTextPane txtpnR_1 = new JTextPane();
		txtpnR_1.setText("R$150,00");
		txtpnR_1.setBounds(10, 132, 91, 20);
		contentPane.add(txtpnR_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(315, 195, 89, 23);
		contentPane.add(btnNewButton);
	}

}
