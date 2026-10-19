package com.mycompany.interfaz;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtFechaNacimiento;
    
    @FXML 
    private Label lblResultado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
    }
    
    @FXML 
    private void handleCalcular(){
        String textoFecha = txtFechaNacimiento.getText();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/aaaa");
        LocalDate fechaNacimiento = LocalDate.parse(textoFecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        
        lblResultado.setText("Tiene " + anos + "años con " + meses + "meses ");
    }
    
    @FXML
    private void handleLimpiar(){
        txtFechaNacimiento.clear();
        lblResultado.setText("Tiene 0 años con 0 meses");
    }
    }


