package proyecto2_entrega2;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Administrador implements Usuario {
	@Override
	public void mostrarPanel(JFrame frame) {
		JFrame clienteFrame = new JFrame("Panel del Administrador");
        clienteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clienteFrame.setSize(800, 600);
        clienteFrame.setLocationRelativeTo(null);
        clienteFrame.setVisible(true);

        JPanel clientePanel = new JPanel(new GridBagLayout());
        clienteFrame.add(clientePanel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Etiqueta "Bienvenido"
        JLabel bienvenidoLabel = new JLabel("Bienvenido");
        bienvenidoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        clientePanel.add(bienvenidoLabel, gbc);


        // Botón izquierdo
        JButton botonIzquierdoArriba = new JButton("Conocer ubicacion");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        botonIzquierdoArriba.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonIzquierdoArriba, gbc);

        // Botón derecho
        JButton botonDerechoArriba = new JButton("Registrar compra");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        botonDerechoArriba.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonDerechoArriba, gbc);
        
        JButton botonCentro = new JButton("Dar de baja");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        botonCentro.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonCentro, gbc);
        
        
        botonIzquierdoArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Usuario usuario = new ConocerUbicacion();
                usuario.mostrarPanel(clienteFrame);
            }
        });
        
        botonDerechoArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Usuario usuario = new ActualizarEstado();
                usuario.mostrarPanel(clienteFrame);
            }
        });
        
        botonCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Usuario usuario = new DarDeBaja();
                usuario.mostrarPanel(clienteFrame);
            }
        });
		
	}
}
