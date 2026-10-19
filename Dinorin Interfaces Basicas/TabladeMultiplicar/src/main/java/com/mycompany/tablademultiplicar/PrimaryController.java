package com.mycompany.tablademultiplicar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
     private TextField txtNumero;

    @FXML
    private TextArea txtResultado;

    @FXML
    private void handleCalcular() {
        try {
            int numero = Integer.parseInt(txtNumero.getText().trim());
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                sb.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
            }

            txtResultado.setText(sb.toString());

        } catch (NumberFormatException e) {
            txtResultado.setText("Por favor ingrese un número entero válido.");
        }
    }

    @FXML
    private void handleLimpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}
