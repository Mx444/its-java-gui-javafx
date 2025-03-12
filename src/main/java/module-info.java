module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.example to javafx.fxml;

    exports com.example;
    exports lezione_10;
    exports lezione_10.esercizio_1;
}
