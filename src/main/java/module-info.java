module com.example.alif.mollahandsons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alif.mollahandsons to javafx.fxml;
    exports com.example.alif.mollahandsons;
    exports com.example.alif.mollahandsons.controller;
    opens com.example.alif.mollahandsons.controller to javafx.fxml;
}