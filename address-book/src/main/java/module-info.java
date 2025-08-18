module org.example.addressbook {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jshell;


    opens org.example.addressbook to javafx.fxml;
    exports org.example.addressbook;
}