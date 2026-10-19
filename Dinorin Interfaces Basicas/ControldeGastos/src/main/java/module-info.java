module com.mycompany.controldegastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.controldegastos to javafx.fxml;
    exports com.mycompany.controldegastos;
}
