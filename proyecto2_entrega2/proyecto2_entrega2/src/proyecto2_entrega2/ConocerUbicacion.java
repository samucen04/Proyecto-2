package proyecto2_entrega2;

import java.awt.*;
import javax.swing.*;

public class ConocerUbicacion implements Usuario {

    @Override
    public void mostrarPanel(JFrame frame) {
        JFrame buscarVehiculoFrame = new JFrame("Conocer ubicacion");
        buscarVehiculoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buscarVehiculoFrame.setSize(800, 600);
        buscarVehiculoFrame.setLocationRelativeTo(null);
        buscarVehiculoFrame.setVisible(true);

        JPanel buscarVehiculoPanel = new JPanel(new BorderLayout());
        buscarVehiculoFrame.add(buscarVehiculoPanel);
        
        JLabel bienvenidoLabel = new JLabel("Informanos por que razon se dara de baja el vehiculo");
        buscarVehiculoPanel.add(bienvenidoLabel, BorderLayout.NORTH);
        bienvenidoLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel textosPanel = new JPanel(new GridBagLayout());
        buscarVehiculoPanel.add(textosPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiquetas y campos de texto
        JLabel label1 = new JLabel("Placa del vehiculo");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label1, gbc);

        JTextField text1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text1, gbc);

        JLabel label2 = new JLabel("Motivo");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label2, gbc);

        JTextField text2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text2, gbc);

        JLabel label3 = new JLabel("Persona que lo estaba buscando");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label3, gbc);

        JTextField text3 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text3, gbc);
        
        JLabel label4 = new JLabel("Ubicacion actual");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label4, gbc);

        JTextField text4 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text4, gbc);
        
        JLabel label5 = new JLabel("Propietario actual");
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
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        textosPanel.add(boton1, gbc);
    }
}