package proyecto2_entrega2;

import java.awt.*;
import javax.swing.*;

public class RegistrarCompra implements Usuario {

    @Override
    public void mostrarPanel(JFrame frame) {
        JFrame buscarVehiculoFrame = new JFrame("Actualizar estado vehiculo");
        buscarVehiculoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buscarVehiculoFrame.setSize(800, 600);
        buscarVehiculoFrame.setLocationRelativeTo(null);
        buscarVehiculoFrame.setVisible(true);

        JPanel buscarVehiculoPanel = new JPanel(new BorderLayout());
        buscarVehiculoFrame.add(buscarVehiculoPanel);
        
        JLabel bienvenidoLabel = new JLabel("!Se ha realizado una compra! A continuacion, la informacion del comprador");
        buscarVehiculoPanel.add(bienvenidoLabel, BorderLayout.NORTH);
        bienvenidoLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel textosPanel = new JPanel(new GridBagLayout());
        buscarVehiculoPanel.add(textosPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiquetas y campos de texto
        JLabel label1 = new JLabel("Nombre");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label1, gbc);

        JTextField text1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text1, gbc);

        JLabel label2 = new JLabel("Metodo de pago");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label2, gbc);

        JTextField text2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text2, gbc);

        JLabel label3 = new JLabel("Documento");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label3, gbc);

        JTextField text3 = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text3, gbc);
        
        JLabel label4 = new JLabel("Fecha a reservar");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        textosPanel.add(label4, gbc);

        JTextField text4 = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        textosPanel.add(text4, gbc);
        
        
        // Botón
        JButton boton1 = new JButton("Registrar compra e informar al comprador");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        textosPanel.add(boton1, gbc);
    }
}