package proyecto2_entrega2;

import java.awt.*;
import javax.swing.*;

public class Reservar implements Usuario {
	
	private JComboBox<String> optionsComboBox;

    @Override
    public void mostrarPanel(JFrame frame) {
        JFrame buscarVehiculoFrame = new JFrame("Buscar Vehiculo");
        buscarVehiculoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buscarVehiculoFrame.setSize(800, 600);
        buscarVehiculoFrame.setLocationRelativeTo(null);
        buscarVehiculoFrame.setVisible(true);

        JPanel buscarVehiculoPanel = new JPanel(new BorderLayout());
        buscarVehiculoFrame.add(buscarVehiculoPanel);

        JLabel bienvenidoLabel = new JLabel("Por favor describe el carro que estás buscando");
        bienvenidoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        buscarVehiculoPanel.add(bienvenidoLabel, BorderLayout.NORTH);

        JPanel textosPanel = new JPanel(new GridBagLayout());
        buscarVehiculoPanel.add(textosPanel, BorderLayout.WEST);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiquetas y campos de texto
        JLabel label1 = new JLabel("Placa");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label1, gbc);

        JTextField text1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text1, gbc);

        JLabel label2 = new JLabel("Modelo");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label2, gbc);

        JTextField text2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text2, gbc);

        JLabel label3 = new JLabel("Nombre");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label3, gbc);

        JTextField text3 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text3, gbc);
        
        JLabel label1I = new JLabel("Marca");
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label1I, gbc);

        JTextField text1I = new JTextField(10);
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text1I, gbc);

        JLabel label2I = new JLabel("Sede");
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label2I, gbc);

        JTextField text2I = new JTextField(10);
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text2I, gbc);

        JLabel label3I = new JLabel("Documento");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label3I, gbc);

        JTextField text3I = new JTextField(10);
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text3I, gbc);
        
        JLabel label4 = new JLabel("Metodo de pago");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label4, gbc);
        
        String[] opciones = {"Escoge", "Credito", "Debito", "Efectivo"};
        optionsComboBox = new JComboBox<>(opciones);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(optionsComboBox, gbc);
        
        JLabel label5 = new JLabel("Fecha a reservar");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label5, gbc);
        
        JTextField text5 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text5, gbc);
        
        // Botón
        JButton boton1 = new JButton("Buscar");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        textosPanel.add(boton1, gbc);
    }
}