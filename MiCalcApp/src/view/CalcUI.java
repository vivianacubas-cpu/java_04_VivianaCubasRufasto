package view;

import javax.swing.*;
import java.awt.*;

public class CalcUI extends JFrame {

    public JTextField numero1 = new JTextField();
    public JTextField numero2 = new JTextField();
    public JTextField pantalla = new JTextField();
    public JButton botonSumar = new JButton("+");
    public JButton botonRestar = new JButton("-");
    public JButton botonMultiplicar = new JButton("*");
    public JButton botonDividir = new JButton("/");

    public CalcUI() {
        setTitle("Mi Calculadora");
        setSize(400, 300); // ventana más grande
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fondo rosado
        getContentPane().setBackground(new Color(255, 182, 193));

        // Campo número 1
        numero1.setBounds(20, 20, 140, 40); // más ancho y alto
        numero1.setFont(new Font("Arial", Font.BOLD, 20));
        add(numero1);

        // Campo número 2
        numero2.setBounds(180, 20, 140, 40);
        numero2.setFont(new Font("Arial", Font.BOLD, 20));
        add(numero2);

        // Pantalla resultado
        pantalla.setBounds(20, 70, 300, 50); // más grande
        pantalla.setFont(new Font("Arial", Font.BOLD, 30));
        pantalla.setBackground(new Color(255, 240, 245));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        add(pantalla);

        // Botones grandes
        int botonWidth = 70;
        int botonHeight = 50;
        int espacio = 20;

        botonSumar.setBounds(20, 140, botonWidth, botonHeight);
        botonSumar.setFont(new Font("Arial", Font.BOLD, 24));
        botonSumar.setBackground(new Color(255, 105, 180));
        botonSumar.setForeground(Color.WHITE);
        add(botonSumar);

        botonRestar.setBounds(110, 140, botonWidth, botonHeight);
        botonRestar.setFont(new Font("Arial", Font.BOLD, 24));
        botonRestar.setBackground(new Color(255, 105, 180));
        botonRestar.setForeground(Color.WHITE);
        add(botonRestar);

        botonMultiplicar.setBounds(200, 140, botonWidth, botonHeight);
        botonMultiplicar.setFont(new Font("Arial", Font.BOLD, 24));
        botonMultiplicar.setBackground(new Color(255, 105, 180));
        botonMultiplicar.setForeground(Color.WHITE);
        add(botonMultiplicar);

        botonDividir.setBounds(290, 140, botonWidth, botonHeight);
        botonDividir.setFont(new Font("Arial", Font.BOLD, 24));
        botonDividir.setBackground(new Color(255, 105, 180));
        botonDividir.setForeground(Color.WHITE);
        add(botonDividir);

        setVisible(true);
    }
}