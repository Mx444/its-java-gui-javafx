package lezione_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Cliccami");
        button.setOnAction(e -> System.out.println("Pulsante premuto!"));
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Esempio JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
