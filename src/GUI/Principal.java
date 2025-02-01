package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class Principal extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal pp = new Principal();
					pp.setVisible(true);
					pp.setLocationRelativeTo(null);
					pp.setDefaultCloseOperation(Loguin.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(10, 0, 248, 592);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrador\\Pictures\\usuario.png"));
		lblNewLabel_1.setBounds(57, 10, 142, 138);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(73, 178, 103, 56);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCorreo.setBounds(73, 257, 103, 56);
		panel.add(lblCorreo);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblContrasea.setBounds(73, 352, 147, 56);
		panel.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(559, 401, 171, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(291, 178, 171, 35);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(484, 486, 171, 35);
		contentPane.add(passwordField);
		
		JLabel lblUsuarioRegular = new JLabel("Usuario Regular");
		lblUsuarioRegular.setForeground(new Color(0, 0, 0));
		lblUsuarioRegular.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsuarioRegular.setBounds(268, 95, 314, 56);
		contentPane.add(lblUsuarioRegular);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 128, 128));
		panel_1.setBounds(253, 0, 735, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}

