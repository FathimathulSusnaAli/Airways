module com.example.cia3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cia3 to javafx.fxml;
    exports com.example.cia3;
}