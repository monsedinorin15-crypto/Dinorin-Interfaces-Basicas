package com.mycompany.dinero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;
    
    @FXML
    private TextArea txtDenominaciones;
    
    @FXML
    private TextArea txtCantidad;
    
    @FXML
    private void handleDesglosar(){
        try {
           //Lee la cantidad entera ingresada
           int cantidad = Integer.parseInt(txtDinero.getText());
           
           int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};
           String[] nombres = {
               "Billetes de $500",
               "Billetes de $200",
               "Billetes de $100",
               "Billetes de $50",
               "Billetes de $20",
               "Monedas de $10",
               "Monedas de $5",
               "Monedas de $2",
               "Monedas de $1",
           };
           
           StringBuilder sbDenom = new StringBuilder();
           StringBuilder sbCant = new StringBuilder();
           
           for (int i = 0; valores.length >= i; i++) {
               int cantidadBilletes = cantidad / valores[i];
               cantidad = cantidad % valores[i];
               
               sbDenom.append(nombres[i]).append("\n");
               sbCant.append(cantidadBilletes).append("\n");
           }
           
           
           txtDenominaciones.setText(sbDenom.toString());
           txtCantidad.setText(sbCant.toString());
        
        }catch (NumberFormatException e){
            txtDenominaciones.setText("Porfavor ingresa un numero valido");
            txtCantidades.clear();
         }           
        }
    
     @FXML
    private void handleLimpiar(){
        txtDinero.clear();
        txtDenominaciones.clear();
        txtCantidades.clear();
    }
}
