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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjudaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAjuda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjudaView frame = new AjudaView();
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
	public AjudaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAjuda = new JTextField();
		txtAjuda.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtAjuda.setHorizontalAlignment(SwingConstants.CENTER);
		txtAjuda.setText("Ajuda");
		txtAjuda.setBounds(0, 0, 434, 23);
		contentPane.add(txtAjuda);
		txtAjuda.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Solicitar Ajuda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(43, 56, 99, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Solicitar");
		btnNewButton.setBounds(42, 81, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Benefícios ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(302, 56, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Solicitar");
		btnNewButton_1.setBounds(302, 81, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Reembolso ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(174, 56, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Solicitar");
		btnNewButton_2.setBounds(174, 81, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(302, 210, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
