package lezione_10;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTableViewExample extends Application {
    public static class Persona {
        private String nome;
        private int eta;

        public Persona(String nome, int eta) {
            this.nome = nome;
            this.eta = eta;
        }

        public String getNome() {
            return nome;
        }

        public int getEta() {
            return eta;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Persona> table = new TableView<>();
        TableColumn<Persona, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        TableColumn<Persona, Integer> colEta = new TableColumn<>("Età");
        colEta.setCellValueFactory(new PropertyValueFactory<>("eta"));
        table.getColumns().addAll(colNome, colEta);
        ObservableList<Persona> dati = FXCollections.observableArrayList(
                new Persona("Mario", 30),
                new Persona("Luca", 25),
                new Persona("Anna", 35));
        table.setItems(dati);
        VBox layout = new VBox(10);
        layout.getChildren().add(table);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Esempio TableView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
