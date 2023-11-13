package proyecto2_entrega2;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cliente implements Usuario {
	@Override
	public void mostrarPanel(JFrame frame) {
		JFrame clienteFrame = new JFrame("Panel del Cliente");
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

        // Etiqueta "¿Cómo podemos ayudarte?"
        JLabel ayudaLabel = new JLabel("¿Cómo podemos ayudarte?");
        ayudaLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        clientePanel.add(ayudaLabel, gbc);

        // Botón izquierdo
        JButton botonIzquierdoArriba = new JButton("Buscar un vehiculo");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        botonIzquierdoArriba.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonIzquierdoArriba, gbc);

        // Botón derecho
        JButton botonDerechoArriba = new JButton("Brindar informacion de un vehiculo especifico");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        botonDerechoArriba.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonDerechoArriba, gbc);
        
        JButton botonIzquierdoAbajo = new JButton("Reservar vehiculo");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        botonIzquierdoAbajo.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonIzquierdoAbajo, gbc);

        // Botón derecho
        JButton botonDerechoAbajo = new JButton("Sedes disponibles");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        botonDerechoAbajo.setPreferredSize(new Dimension(350, 60));
        clientePanel.add(botonDerechoAbajo, gbc);
        
        
        botonIzquierdoArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Usuario usuario = new BuscarVehiculo();
                usuario.mostrarPanel(clienteFrame);
            }
        });
        
        botonIzquierdoAbajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Usuario usuario = new Reservar();
                usuario.mostrarPanel(clienteFrame);
            }
        });
		
	}
}
