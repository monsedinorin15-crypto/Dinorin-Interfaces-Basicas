package com.mycompany.controldegastos;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
 private TextField txtAlimentacion;

    @FXML
    private TextField txtRefrigerios;

    @FXML
    private TextField txtTransporte;

    @FXML
    private TextField txtTelefonia;

    @FXML
    private TextField txtOtros;

    @FXML
    private TextField txtTotalSemanal;

    @FXML
    private TextField txtGastoAlto;

    @FXML
    private void handleCalcular() {
        try {
            double alimentacion = parsearCampo(txtAlimentacion);
            double refrigerios = parsearCampo(txtRefrigerios);
            double transporte = parsearCampo(txtTransporte);
            double telefonia = parsearCampo(txtTelefonia);
            double otros = parsearCampo(txtOtros);

            double total = alimentacion + refrigerios + transporte + telefonia + otros;
            txtTotalSemanal.setText(String.valueOf(total));

            double max = alimentacion;
            String mayorConcepto = "Alimentación";

            if (refrigerios > max) {
                max = refrigerios;
                mayorConcepto = "Refrigerios";
            }
            if (transporte > max) {
                max = transporte;
                mayorConcepto = "Transporte";
            }
            if (telefonia > max) {
                max = telefonia;
                mayorConcepto = "Telefonía";
            }
            if (otros > max) {
                max = otros;
                mayorConcepto = "Otros";
            }

            txtGastoAlto.setText(mayorConcepto);

        } catch (NumberFormatException e) {
            txtTotalSemanal.setText("Error en datos");
            txtGastoAlto.setText("Verifique números");
        }
    }

    private double parsearCampo(TextField tf) {
        String texto = tf.getText().trim();
        if (texto.isEmpty()) {
            return 0.0;
        }
        return Double.parseDouble(texto);
    }

    @FXML
    private void handleLimpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotalSemanal.clear();
        txtGastoAlto.clear();
    }
}
    

