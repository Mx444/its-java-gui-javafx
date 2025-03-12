package lezione_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLabelExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Premi il pulsante");
        Button button = new Button("Cambia testo");
        button.setOnAction(e -> label.setText("Testo aggiornato!"));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Esempio con Label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
