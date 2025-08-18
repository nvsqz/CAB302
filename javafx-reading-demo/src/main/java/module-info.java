module org.example.javafxreadingdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxreadingdemo to javafx.fxml;
    exports org.example.javafxreadingdemo;
}