package GUI;
import Usuario.AcederDatos;
import Usuario.Usuario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;


@SuppressWarnings("unused")
public class InterfazUser extends JFrame {
	

	DefaultTableModel dtm = new DefaultTableModel();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelA;
	private JTextField tex1, tex2;
	private JLabel label1, label2;
	//private int yOffset = 0; // Variable para posicionar dinámicamente los nuevos campos
	private JTextField texNombre;
	private JTextField textField_1;
	private JTextField textField_2;
	private AcederDatos datos;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	

//----------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUser pp = new InterfazUser();
					pp.setVisible(true);
					pp.setLocationRelativeTo(null);
					pp.setDefaultCloseOperation(Loguin.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//-------------- JFRAM---------------------
	public InterfazUser() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	
		 
		//--------------------------------- VENTANA PRINCIPAL DE EL FORMULARIO
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//------------ PANELAGREGAR
		JPanel panelAgregar = new JPanel();
		panelAgregar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelAgregar.setBackground(new Color(0, 128, 255));
		panelAgregar.setBounds(10, 0, 248, 733);
		contentPane.add(panelAgregar);
		panelAgregar.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrador\\Pictures\\usuario.png"));
		lblNewLabel_1.setBounds(51, 10, 136, 144);
		panelAgregar.add(lblNewLabel_1);
		
		//-----------------------------------------------------------------------
		JLabel lblUsuarioRegular_1 = new JLabel("Usuario");
		lblUsuarioRegular_1.setForeground(Color.WHITE);
		lblUsuarioRegular_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsuarioRegular_1.setBounds(61, 148, 138, 50);
		panelAgregar.add(lblUsuarioRegular_1);
		
		
		//-----------------------------------BOTON AGREGAR USUARIO------------------------------------
		JButton btnAgregar = new JButton("Agregar ");
		btnAgregar.setBounds(40, 656, 159, 67);
		panelAgregar.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	

		        // Get data from text fields
		        String nombre = texNombre.getText();
		        String correo = textField_1.getText();
		        String contraseña = textField_2.getText();

		        // Create a new user object
		        AcederDatos user = new AcederDatos(); // Assuming Usuario is not an abstract class
		        user.setNombre(nombre);
		        user.setCorreo(correo);
		        user.setContraseña(contraseña);

		        // Call the method to add the user to the database (replace with your actual implementation)
		        boolean userAdded = AcederDatos.agregarUsuario(user); // Assuming AcederDatos.agregarUsuario takes a Usuario object

		        if (userAdded) {
		            // Clear text fields
		            texNombre.setText("");
		            textField_1.setText("");
		            textField_2.setText("");

		            // Update the table with the new user
		            DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		            model.addRow(new Object[]{nombre, correo, contraseña});

		            JOptionPane.showMessageDialog(null, "Usuario agregado con éxito.");
		        } else {
		            JOptionPane.showMessageDialog(null, "Error al agregar usuario.");
		        }
		    }
		});
		btnAgregar.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\icono_guardar.png"));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblUsuarioRegular_1_4 = new JLabel("Agregar Usuario");
		lblUsuarioRegular_1_4.setForeground(Color.WHITE);
		lblUsuarioRegular_1_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsuarioRegular_1_4.setBounds(21, 235, 220, 50);
		panelAgregar.add(lblUsuarioRegular_1_4);
		
		JPanel panelAgg = new JPanel();
		panelAgg.setBackground(new Color(0, 128, 255));
		panelAgg.setBounds(10, 216, 228, 507);
		panelAgregar.add(panelAgg);
		TitledBorder dd = BorderFactory.createTitledBorder("Agrgar Usuarios");
		panelAgg.setBorder(dd);
		panelAgg.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 374, 172, 25);
		panelAgg.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUsuarioRegular_1_3 = new JLabel("Contraseña:");
		lblUsuarioRegular_1_3.setBounds(10, 314, 152, 50);
		panelAgg.add(lblUsuarioRegular_1_3);
		lblUsuarioRegular_1_3.setForeground(Color.WHITE);
		lblUsuarioRegular_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 273, 172, 25);
		panelAgg.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsuarioRegular_1_2 = new JLabel("Correo:");
		lblUsuarioRegular_1_2.setBounds(10, 213, 105, 50);
		panelAgg.add(lblUsuarioRegular_1_2);
		lblUsuarioRegular_1_2.setForeground(Color.WHITE);
		lblUsuarioRegular_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		texNombre = new JTextField();
		texNombre.setBounds(10, 172, 172, 25);
		panelAgg.add(texNombre);
		texNombre.setColumns(10);
		
		JLabel lblUsuarioRegular_1_1 = new JLabel("Nombre:");
		lblUsuarioRegular_1_1.setBounds(10, 105, 116, 50);
		panelAgg.add(lblUsuarioRegular_1_1);
		lblUsuarioRegular_1_1.setForeground(Color.WHITE);
		lblUsuarioRegular_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		//-----------------------------------------------------------------------
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(253, 0, 782, 92);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//-----------------------------------------------------------------------
		JLabel lblUsuarioRegular = new JLabel("Usuario Regular");
		lblUsuarioRegular.setBounds(204, 10, 314, 56);
		panel_1.add(lblUsuarioRegular);
		lblUsuarioRegular.setForeground(new Color(255, 255, 255));
		lblUsuarioRegular.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panelEditar = new JPanel();
		panelEditar.setBackground(new Color(240, 240, 240));
		panelEditar.setBorder(new EmptyBorder(9, 9, 9, 8));
		panelEditar.setBounds(268, 102, 767, 204);
		contentPane.add(panelEditar);
		panelEditar.setLayout(null);
		
		//-----------------------------------------------------------------------
		JButton btnEditarUsurio = new JButton("Editar ");
		btnEditarUsurio.setBounds(0, 142, 148, 62);
		panelEditar.add(btnEditarUsurio);
		btnEditarUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnEditarUsurio.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\icono_editar.png"));
		btnEditarUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setBounds(164, 90, 128, 28);
		panelEditar.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(345, 90, 137, 28);
		panelEditar.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(534, 94, 117, 24);
		panelEditar.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(186, 52, 77, 28);
		panelEditar.add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCorreo.setBounds(368, 52, 77, 28);
		panelEditar.add(lblCorreo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(534, 52, 117, 28);
		panelEditar.add(lblNewLabel_2_1);
		
		
		
		// Crear el modelo de la tabla
		DefaultTableModel modeloTabla = new DefaultTableModel(
		    new Object[][] {},
		    new String[] {"Nombre", "Correo", "Contraseña"}
		);

		
		
		
		//---------- PANELMOSTRAR
		JPanel panelMostrar = new JPanel();
		panelMostrar.setBounds(268, 329, 767, 204);
		contentPane.add(panelMostrar);
		panelMostrar.setLayout(null);
		Border vv = BorderFactory.createTitledBorder("Agrgar Usuarios");
		panelMostrar.setBorder(vv);
		
		
		
	 Vector<String> fila = new Vector<String>();
	 fila.addElement("Anderson Batista");
	 fila.addElement("andersonbatista@gamil.com");
	 fila.addElement("0044");
	 
	 Vector<String> fila2 = new Vector<String>();
	 fila2.addElement("Juan Pérez ");
	 fila2.addElement("juanperez@gmail.com");
	 fila2.addElement("0055");

	 
	 Vector<String> fila3 = new Vector<String>();
	 fila3.addElement("José López");
	 fila3.addElement("anafrenandez@gamil.com");
	 fila3.addElement("330044");


	 Vector<String> fila4 = new Vector<String>();
	 fila4.addElement("Ana Fernández");
	 fila4.addElement("anafrenandez@gamil.com");
	 fila4.addElement("0033");
	 
	 Vector<String> fila5 = new Vector<String>();
	 fila5.addElement("");
	 fila5.addElement("");
	 fila5.addElement("");

	 @SuppressWarnings("rawtypes")
	Vector<Vector> filatotal = new Vector<Vector>();
	 filatotal.addElement(fila);
	 filatotal.addElement(fila2);
	 filatotal.addElement(fila3);
	 filatotal.addElement(fila4);
	 filatotal.addElement(fila5);

	 String[] tutilo =new String [] {"Nombre", "Correo", "Contraseña"};
	 dtm.setColumnIdentifiers(tutilo);
	 
	 
	 Vector<String> colunm = new Vector<String>();
	 colunm.addElement("Nombre");
	 colunm.addElement("Correo");
	 colunm.addElement("Contraseña");
;
panelMostrar.setLayout(null);

	 
	 JTable table = new JTable(filatotal, colunm);
	 JScrollPane sp = new JScrollPane(table);
	 sp.setBounds(161, 15, 606, 183);
	 panelMostrar.add(sp);
	 table.setVisible(false);
	 
		
		
		
		//-----------------------------------------------------------------------
		JButton btnMontrarUsuario = new JButton("Montrar ");
		btnMontrarUsuario.setBounds(0, 125, 156, 73);
		btnMontrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//------------- AQUI HICE LA TABLA VSIBLE
				table.setVisible(true);
			
				
				
				
				
				
			}
		});
		panelMostrar.add(btnMontrarUsuario);
		btnMontrarUsuario.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\icono_informe.png"));
		btnMontrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel imgDeMostar = new JLabel("");
		imgDeMostar.setIcon(new ImageIcon("C:\\Users\\Administrador\\Pictures\\usuario (1).png"));
		imgDeMostar.setBounds(35, 29, 87, 86);
		panelMostrar.add(imgDeMostar);
		
		JPanel panelEliminar = new JPanel();
		panelEliminar.setBounds(268, 560, 767, 173);
		contentPane.add(panelEliminar);
		panelEliminar.setLayout(null);
		
		
		
		
		
		
		
		
		//-----------------------------------------------------------------------
		JButton btnNewButton_3 = new JButton("Eliminar ");
		btnNewButton_3.setBounds(0, 100, 156, 73);
		panelEliminar.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\icono_eliminar.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 10, 577, 153);
		panelEliminar.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Correo", "Contrase\u00F1a"
			}
		));
		scrollPane.setViewportView(table_2);
		
		
		
		//------------ PANEL A PARA AGG USUARIOS
		panelA = new JPanel();
		panelA.setBackground(new Color(0, 128, 255));
		panelA.setLayout(null);
		panelA.setBounds(287, 167, 337, 403);
		

		
	}	
}

	/**
	
	  private void agregarCampos() {
		  label1 = new JLabel("Usuario:");
		  label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		  label1.setBounds(10, yOffset, 100, 30);
	        panelA.add(label1);

	        tex1 = new JTextField();
	        tex1.setBounds(120, yOffset, 200, 30);
	        panelA.add(tex1);
	        
	        //-------------------------------------------------------------------
	  	  label2 = new JLabel("Correo:");
	   	  label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	  	  label2.setBounds(10, yOffset, 100, 30);
	        panelA.add(label2);

	        tex2 = new JTextField();
	        tex2.setBounds(120, yOffset, 200, 30);
	        panelA.add(tex2);
	        

	        yOffset += 40; // Incrementar la posición vertical para el próximo campo

	        contentPane.add(panelA);
	        panelA.revalidate();
	        panelA.repaint();

	
	 */
	
	
	        
	
	
