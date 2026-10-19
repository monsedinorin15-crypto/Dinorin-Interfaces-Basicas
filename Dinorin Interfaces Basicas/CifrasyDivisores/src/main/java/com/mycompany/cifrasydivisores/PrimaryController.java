package com.mycompany.cifrasydivisores;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtCantidadCifras;

    @FXML
    private TextField txtSumaImpares;

    @FXML
    private TextField txtSumaPares;

    @FXML
    private TextField txtSumaTotal;

    @FXML
    private TextField txtCifraMayor;

    @FXML
    private TextField txtCifraMenor;

    @FXML
    private TextArea txtDivisores;

    @FXML
    private void handleAnalizar() {
        try {
            String textoNumero = txtNumero.getText().trim();
            long numero = Long.parseLong(textoNumero);
            long numAbsoluto = Math.abs(numero);
            String textoAbs = String.valueOf(numAbsoluto);

            int cantidadCifras = textoAbs.length();
            int sumaImpares = 0;
            int sumaPares = 0;
            int sumaTotal = 0;
            int cifraMayor = 0;
            int cifraMenor = 9;

            for (int i = 0; i < textoAbs.length(); i++) {
                int digito = Character.getNumericValue(textoAbs.charAt(i));
                
                sumaTotal += digito;
                
                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }

                if (digito > cifraMayor) {
                    cifraMayor = digito;
                }
                
                if (digito < cifraMenor) {
                    cifraMenor = digito;
                }
            }

            txtCantidadCifras.setText(String.valueOf(cantidadCifras));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtCifraMayor.setText(String.valueOf(cifraMayor));
            txtCifraMenor.setText(String.valueOf(cifraMenor));

            StringBuilder sbDivisores = new StringBuilder();
            for (long i = 1; i <= numAbsoluto; i++) {
                if (numAbsoluto % i == 0) {
                    sbDivisores.append(i).append("\n");
                }
            }
            txtDivisores.setText(sbDivisores.toString());

        } catch (NumberFormatException e) {
            handleLimpiar();
            txtDivisores.setText("Número no válido");
        }
    }

    @FXML
    private void handleLimpiar() {
        txtNumero.clear();
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        txtDivisores.clear();
    }
}
    

