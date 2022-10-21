import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelos.Usuario;
import dao.UsuarioDao;
import dao.conexao;

public class CadastroView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldid;
	private JTextField textFieldusuario;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView frame = new CadastroView();
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
	public CadastroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldid = new JTextField();
		textFieldid.setBounds(51, 63, 145, 20);
		contentPane.add(textFieldid);
		textFieldid.setColumns(10);
		
		textFieldusuario = new JTextField();
		textFieldusuario.setBounds(51, 123, 145, 20);
		contentPane.add(textFieldusuario);
		textFieldusuario.setColumns(10);
		
		JLabel txtid = new JLabel("Id");
		txtid.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtid.setBounds(51, 38, 46, 14);
		contentPane.add(txtid);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(51, 95, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(51, 154, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
				
				Usuario u = new Usuario();
				UsuarioDao dao=  new UsuarioDao();
				u.setId(textFieldid.getText());
				u.setUsuario(textFieldusuario.getText());
				u.setSenha(passwordField.getText());
				}
			}
		);
		btnNewButton.setBounds(51, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(51, 179, 145, 20);
		contentPane.add(passwordField);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(314, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
