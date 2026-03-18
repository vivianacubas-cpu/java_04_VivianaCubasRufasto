package controller;

import model.CalcLogic;
import view.CalcUI;
import javax.swing.*;

public class CalcController {

    private CalcLogic model;
    private CalcUI view;

    public CalcController(CalcLogic model, CalcUI view) {
        this.model = model;
        this.view = view;

        view.botonSumar.addActionListener(e -> calcular("sumar"));
        view.botonRestar.addActionListener(e -> calcular("restar"));
        view.botonMultiplicar.addActionListener(e -> calcular("multiplicar"));
        view.botonDividir.addActionListener(e -> calcular("dividir"));
    }

    private void calcular(String operacion) {
        try {
            double n1 = Double.parseDouble(view.numero1.getText());
            double n2 = Double.parseDouble(view.numero2.getText());
            double res = 0;

            switch (operacion) {
                case "sumar": res = model.sumar(n1, n2); break;
                case "restar": res = model.restar(n1, n2); break;
                case "multiplicar": res = model.multiplicar(n1, n2); break;
                case "dividir": res = model.dividir(n1, n2); break;
            }

            view.pantalla.setText(String.valueOf(res));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}