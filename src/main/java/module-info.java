module com.example.java17fxmodular {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java17fxmodular to javafx.fxml;
    opens com.example.calculator to javafx.graphics, javafx.fxml;
    exports com.example.java17fxmodular;
}
