package proyecto2_entrega2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarVehiculo implements Usuario {

	@Override
	public void mostrarPanel(JFrame frame) {
		JFrame buscarVehiculoFrame = new JFrame("Buscar Vehiculo");
		buscarVehiculoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buscarVehiculoFrame.setSize(800, 600);
		buscarVehiculoFrame.setLocationRelativeTo(null);
		buscarVehiculoFrame.setVisible(true);
		
		JPanel buscarVehiculoPanel = new JPanel(new BorderLayout());
        buscarVehiculoFrame.add(buscarVehiculoPanel);

        JLabel bienvenidoLabel = new JLabel("Por favor describe el carro que estas buscando");
        buscarVehiculoPanel.add(bienvenidoLabel, BorderLayout.NORTH);
        bienvenidoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        JPanel textos1 = new JPanel(new GridLayout(8, 1));
        JLabel espacio1 = new JLabel("");
        JLabel espacio2 = new JLabel("");
        JLabel label1 = new JLabel("Marca");
        JLabel label2 = new JLabel("Modelo");
        JLabel label3 = new JLabel("Color");
        JLabel label4 = new JLabel("Tipo transmision(opcional");
        JLabel espacio3 = new JLabel("");
        JLabel espacio4 = new JLabel("");
        textos1.add(espacio1);
        textos1.add(espacio2);
        textos1.add(label1);
        textos1.add(label2);
        textos1.add(label3);
        textos1.add(label4);
        textos1.add(espacio3);
        textos1.add(espacio4);
        buscarVehiculoPanel.add(textos1, BorderLayout.WEST);
        
        JPanel textos2 = new JPanel(new GridLayout(8, 1));
        JLabel espacio5 = new JLabel("");
        JLabel espacio6 = new JLabel("");
        JTextField text1 = new JTextField("");
        text1.setColumns(4);
        JTextField text2 = new JTextField("");
        text2.setColumns(4);
        JTextField text3 = new JTextField("");
        text3.setColumns(4);
        JTextField text4 = new JTextField("");
        text4.setColumns(4);
        JLabel espacio7 = new JLabel("");
        JLabel espacio8 = new JLabel("");
        textos2.add(espacio5);
        textos2.add(espacio6);
        textos2.add(text1);
        textos2.add(text2);
        textos2.add(text3);
        textos2.add(text4);
        textos2.add(espacio7);
        textos2.add(espacio8);
        buscarVehiculoPanel.add(textos2, BorderLayout.CENTER);
        
        JPanel botonBuscar = new JPanel(new GridLayout(18, 1));
        JLabel espacio9 = new JLabel("");
        JLabel espacio10 = new JLabel("");
        JLabel espacio11 = new JLabel("");
        JLabel espacio12 = new JLabel("");
        JLabel espacio13 = new JLabel("");
        JLabel espacio14 = new JLabel("");
        JLabel espacio15 = new JLabel("");
        JLabel espacio16 = new JLabel("");
        JLabel espacio17 = new JLabel("");
        JLabel espacio18 = new JLabel("");
        JLabel espacio19 = new JLabel("");
        JLabel espacio20 = new JLabel("");
        JLabel espacio21 = new JLabel("");
        JLabel espacio22 = new JLabel("");
        JButton boton1 = new JButton("Buscar");
        boton1.setPreferredSize(new Dimension(140, 60));
        espacio9 = new JLabel("");
        botonBuscar.add(espacio9);
        botonBuscar.add(espacio10);
        botonBuscar.add(espacio11);
        botonBuscar.add(espacio12);
        botonBuscar.add(espacio13);
        botonBuscar.add(espacio14);
        botonBuscar.add(espacio15);
        botonBuscar.add(espacio16);
        botonBuscar.add(espacio17);
        botonBuscar.add(espacio18);
        botonBuscar.add(espacio19);
        botonBuscar.add(espacio20);
        botonBuscar.add(espacio21);
        botonBuscar.add(espacio22);
        botonBuscar.add(boton1);
        buscarVehiculoPanel.add(botonBuscar, BorderLayout.EAST);
        
        
		
	}

}
