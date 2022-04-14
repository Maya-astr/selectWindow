module com.example.selectwindow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.selectwindow to javafx.fxml;
    exports com.example.selectwindow;
}