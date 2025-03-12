package lezione_10.esercizio_1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentiTableView extends Application {

    @Override
    public void start(Stage primaryStage) {
        TableView<Studente> table = new TableView<>();

        Label labelNome = new Label("Inserisci nome studente: ");
        TextField textFieldNome = new TextField();
        Label labelCognome = new Label("Inserisci cognome studente: ");
        TextField textFieldCognome = new TextField();
        Label labelVoto = new Label("Inserisci  voto studente: ");
        TextField textFieldVoto = new TextField();
        Button buttonNuovoStudente = new Button("Aggiungi studente");

        TableColumn<Studente, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

        TableColumn<Studente, String> colCognome = new TableColumn<>("Cognome");
        colCognome.setCellValueFactory(new PropertyValueFactory<>("cognome"));

        TableColumn<Studente, Integer> colVoto = new TableColumn<>("Voto");
        colVoto.setCellValueFactory(new PropertyValueFactory<>("voto"));

        table.getColumns().addAll(colNome, colCognome, colVoto);

        ObservableList<Studente> dati = FXCollections.observableArrayList();

        buttonNuovoStudente.setOnAction(e -> {
            Studente nuovoStudente = new Studente(textFieldNome.getText(), textFieldCognome.getText(),
                    Integer.parseInt(textFieldVoto.getText()));
            dati.add(nuovoStudente);
        });

        table.setItems(dati);
        VBox layout = new VBox(10);
        layout.getChildren().addAll(labelNome, textFieldNome, labelCognome, textFieldCognome, labelVoto,
                textFieldVoto, buttonNuovoStudente, table);
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setTitle("Studenti");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}