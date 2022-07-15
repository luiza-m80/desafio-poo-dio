module com.example.javapoodio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javapoodio to javafx.fxml;
    exports com.example.javapoodio;
}