module com.example.examenjava2prueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examenjava2prueba to javafx.fxml;
    exports com.example.examenjava2prueba;
}