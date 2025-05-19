package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class panelLogin {
    private JPanel panelLogin;
    
    public panelLogin() {
        // Panel View 
        panelLogin = new JPanel();
        panelLogin.setSize(500, 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.PINK);
        panelLogin.setLayout(new GridBagLayout());


        //Administador de diseno 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,80,10,80);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        //Titulo
        JLabel titulo = new JLabel("Login");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setPreferredSize(new Dimension(500,50));
        gbc.gridx = 0; 
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.setBackground(Color.WHITE);
        panelLogin.add(titulo, gbc);

        //Entrada correo 
        JTextField entradacorreo = new JTextField();
        entradacorreo.setSize(new Dimension(500,50));
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradacorreo, gbc);
        
        //Entrada contrasena
        JPasswordField entradacontrasena = new JPasswordField();
        entradacontrasena.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradacontrasena, gbc);
        
        //boton 
        JButton botonIngresar = new JButton("Ingresar");
        botonIngresar.setPreferredSize(new Dimension(50,50));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        panelLogin.add(botonIngresar, gbc);
    }

    public JPanel getView() {  // Cambiado de getPanel() a getView() para coincidir con el main
        return panelLogin;
    }
}