module com.mycompany.cifrasydivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cifrasydivisores to javafx.fxml;
    exports com.mycompany.cifrasydivisores;
}
