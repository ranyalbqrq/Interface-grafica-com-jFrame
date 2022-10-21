import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField txtSegurosRecifeLtda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ranye\\Downloads\\fundo-azul-escuro-1024x701.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(48, 61, 222, 20);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuário ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(48, 36, 111, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(48, 104, 46, 14);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(48, 129, 222, 20);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 MenuView teladeMenu = new MenuView();
				 teladeMenu.setVisible(true);
			}
		});
		btnNewButton.setBounds(149, 170, 121, 23);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroView teladeCadastro= new CadastroView();
				teladeCadastro.setVisible(true);
				}
		});
		btnNewButton_1.setBounds(149, 215, 121, 23);
		contentPane.setLayout(null);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(passwordField);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		
		txtSegurosRecifeLtda = new JTextField();
		txtSegurosRecifeLtda.setHorizontalAlignment(SwingConstants.CENTER);
		txtSegurosRecifeLtda.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSegurosRecifeLtda.setText("Seguros Recife Ltda");
		txtSegurosRecifeLtda.setBounds(0, 0, 434, 20);
		contentPane.add(txtSegurosRecifeLtda);
		txtSegurosRecifeLtda.setColumns(10);
	}
}
