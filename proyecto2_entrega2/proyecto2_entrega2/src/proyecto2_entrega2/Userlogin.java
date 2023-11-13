package proyecto2_entrega2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Userlogin extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
	private JTextField contraField;
	private JComboBox<String> optionsComboBox;

    public Userlogin() {
        // Configuración de la ventana
        setTitle("Aplicacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Crear el panel de inicio de sesión
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);

        // Añadir imagen de usuario (reemplaza "ruta_de_la_imagen" con la ruta real)
        ImageIcon userIcon = new ImageIcon("./data/imagen.png");
        JLabel userLabel = new JLabel(userIcon);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        loginPanel.add(userLabel, gbc);

        // Etiqueta y campo de texto para el nombre de usuario
        JLabel usernameLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        loginPanel.add(usernameLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 3;
        loginPanel.add(usernameField, gbc);
        
        JLabel contraLabel = new JLabel("Contrasena:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        loginPanel.add(contraLabel, gbc);

        contraField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 4;
        loginPanel.add(contraField, gbc);
        
        JLabel cargoLabel = new JLabel("Cargo:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridheight = 1;
        loginPanel.add(cargoLabel, gbc);
        
        String[] opciones = {"Escoge", "Cliente", "Empleado", "Administrador"};
        optionsComboBox = new JComboBox<>(opciones);
        gbc.gridx = 1;
        gbc.gridy = 5;
        loginPanel.add(optionsComboBox, gbc);

        // Botón de inicio de sesión
        JButton loginButton = new JButton("Iniciar sesion");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String selectedOption = (String) optionsComboBox.getSelectedItem();

                // Lógica para verificar el tipo de usuario y mostrar el panel correspondiente
                Usuario usuario = null;
                if ("Cliente".equals(selectedOption)) {
                    usuario = new Cliente();
                } else if ("Empleado".equals(selectedOption)) {
                    usuario = new Empleado();
                } else if ("Administrador".equals(selectedOption)) {
                    usuario = new Administrador();
                }

                // Muestra el panel del usuario correspondiente
                if (usuario != null) {
                    usuario.mostrarPanel(null);
                    dispose(); // Cierra la ventana actual
                }
            }
        });
        gbc.gridx = 6;
        gbc.gridy = 6;
        loginPanel.add(loginButton, gbc);

        // Agregar el panel de inicio de sesión a la ventana
        add(loginPanel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Userlogin());
    }
}
