module com.mycompany.interfaz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.interfaz to javafx.fxml;
    exports com.mycompany.interfaz;
}
