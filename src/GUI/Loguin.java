package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Loguin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsuario;
    private JPasswordField jpassClave;
    private JButton btnIngresar;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Loguin frame = new Loguin();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(Loguin.EXIT_ON_CLOSE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Loguin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 815, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        //-------------------------LB USUARIO----------------------------------------
        JLabel lblNewLabel_1 = new JLabel("Usuario");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_1.setBounds(510, 169, 137, 41);
        contentPane.add(lblNewLabel_1);

        //-------------------------LB CONTRASEÑA----------------------------------------
        JLabel lblNewLabel_2 = new JLabel("Contraseña");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_2.setBounds(510, 288, 165, 50);
        contentPane.add(lblNewLabel_2);

        //------------------------INPUT USUARIO-----------------------------------------
        txtUsuario = new JTextField();
        txtUsuario.setBounds(510, 220, 221, 41);
        contentPane.add(txtUsuario);
        txtUsuario.setColumns(10);

        //------------------------INPUT PASSWORD-----------------------------------------
        jpassClave = new JPasswordField();
        jpassClave.setBounds(510, 348, 221, 41);
        contentPane.add(jpassClave);

        //---------------------------- BTN INGRESAR ------------------------
        btnIngresar = new JButton("Ingresar");
        btnIngresar.setForeground(new Color(0, 0, 0));
        btnIngresar.setBackground(new Color(255, 255, 255));
        btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] clave = jpassClave.getPassword();
                String claveFinal = new String(clave);

                //------------------------------USUARIO-----------------------------------
                if (txtUsuario.getText().equals("User") && claveFinal.equals("123")) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema USUARIO", "INGRESASTE",
                            JOptionPane.INFORMATION_MESSAGE);

                    InterfazUser user = new InterfazUser();
                    user.setVisible(true);
                    user.setLocationRelativeTo(null);
                    user.setDefaultCloseOperation(Loguin.EXIT_ON_CLOSE);
                    
                    //------------------------------ADMINISTRADOR-----------------------------------
                     }else if (txtUsuario.getText().equals("Admi") && claveFinal.equals("1234")) {
                    dispose();
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador", "INGRESASTE",
                            JOptionPane.INFORMATION_MESSAGE);

                    InterfazAdmi admin = new InterfazAdmi();
                    admin.setVisible(true);
                    admin.setLocationRelativeTo(null);
                    admin.setDefaultCloseOperation(Loguin.EXIT_ON_CLOSE);
                    
                      } else 
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña Incorrecto", "ERROR",
                            JOptionPane.ERROR_MESSAGE);

                    txtUsuario.setText("");
                    jpassClave.setText("");
                    txtUsuario.requestFocus();
                }
            
        });
        btnIngresar.setBounds(550, 429, 137, 41);
        contentPane.add(btnIngresar);

        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Administrador\\Pictures\\nn.png"));
        lblNewLabel_3.setBounds(0, 0, 441, 499);
        contentPane.add(lblNewLabel_3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrador\\Downloads\\usuario (1).png"));
        lblNewLabel.setBounds(109, 298, 70, 81);
        contentPane.add(lblNewLabel);
        
        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Administrador\\Pictures\\usuario.png"));
        lblNewLabel_4.setBounds(550, 0, 152, 189);
        contentPane.add(lblNewLabel_4);
    }
}
