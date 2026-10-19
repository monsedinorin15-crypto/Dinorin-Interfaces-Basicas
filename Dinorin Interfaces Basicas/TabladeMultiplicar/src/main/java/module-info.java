module com.mycompany.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tablademultiplicar to javafx.fxml;
    exports com.mycompany.tablademultiplicar;
}
