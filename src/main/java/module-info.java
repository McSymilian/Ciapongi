module org.oxford.ciapongi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.oxford.ciapongi to javafx.fxml;
    exports org.oxford.ciapongi;
}