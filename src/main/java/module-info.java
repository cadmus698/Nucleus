module com.cadmus698.nucleus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.cadmus698.nucleus to javafx.fxml;
    exports com.cadmus698.nucleus;
}