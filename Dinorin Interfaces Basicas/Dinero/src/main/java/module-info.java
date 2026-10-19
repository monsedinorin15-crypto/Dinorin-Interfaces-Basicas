module com.mycompany.dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.dinero to javafx.fxml;
    exports com.mycompany.dinero;
}
