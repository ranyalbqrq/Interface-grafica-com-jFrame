import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContatoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtContato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContatoView frame = new ContatoView();
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
	public ContatoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtContato = new JTextField();
		txtContato.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtContato.setHorizontalAlignment(SwingConstants.CENTER);
		txtContato.setText("Contato");
		txtContato.setBounds(0, 0, 434, 20);
		contentPane.add(txtContato);
		txtContato.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("WhatsApp ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(20, 62, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instagram ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 129, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 187, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("(81) 98307-9414");
		textPane.setBounds(20, 87, 135, 20);
		contentPane.add(textPane);
		
		JTextPane txtpnSegurosrecife = new JTextPane();
		txtpnSegurosrecife.setText("@segurosrecife");
		txtpnSegurosrecife.setBounds(20, 152, 135, 20);
		contentPane.add(txtpnSegurosrecife);
		
		JTextPane txtpnSegurorecifegmailcom = new JTextPane();
		txtpnSegurorecifegmailcom.setText("segurorecife13@gmail.com");
		txtpnSegurorecifegmailcom.setBounds(20, 212, 135, 20);
		contentPane.add(txtpnSegurorecifegmailcom);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(302, 212, 89, 23);
		contentPane.add(btnNewButton);
	}

}
