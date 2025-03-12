package lezione_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTextFieldExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Inserisci qualcosa:");
        TextField textField = new TextField();
        Button button = new Button("Mostra testo");
        button.setOnAction(e -> label.setText("Hai scritto: " + textField.getText()));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(textField, button, label);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Esempio con TextField");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}