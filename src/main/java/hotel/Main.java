package hotel;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        System.out.println("===== HOTEL IL GIRASOLE =====");
        System.out.println("1. Aggiungi una camera");
        System.out.println("2. Mostra camere disponibili");
        System.out.println("3. Effettua una nuova prenotazione");
        System.out.println("4. Mostra tutte le prenotazioni");
        System.out.println("5. Mostra incasso giornaliero");
        System.out.println("6. Cerca prenotazioni per codice fiscale");
        System.out.println("7. Esci");
        System.out.print("Seleziona un'opzione: ");

        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();

        while (scelta != 7) {
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il numero della camera: ");
                    int numero = scanner.nextInt();
                    System.out.print("Inserisci il tipo di camera: ");
                    String tipo = scanner.next();
                    System.out.print("Inserisci il prezzo per notte: ");
                    double prezzo = scanner.nextDouble();
                    Camera camera = new Camera(numero, tipo, prezzo);
                    hotel.aggiungiCamera(camera);
                    System.out.println("Camera aggiunta con successo!" + camera.toString());
                    break;
                case 2:
                    System.out.println("Camere disponibili:");
                    for (Camera c : hotel.getCamereDisponibili()) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.print("Inserisci il nome del cliente: ");
                    String nome = scanner.next();
                    System.out.print("Inserisci il cognome del cliente: ");
                    String cognome = scanner.next();
                    System.out.print("Inserisci il codice fiscale del cliente: ");
                    String codiceFiscale = scanner.next();
                    System.out.print("Inserisci il numero della camera: ");
                    int numeroCamera = scanner.nextInt();
                    System.out.print("Inserisci il numero di notti: ");
                    int numeroNotti = scanner.nextInt();
                    Camera cameraPrenotata = null;
                    for (Camera c : hotel.getCamereDisponibili()) {
                        if (c.getNumero() == numeroCamera) {
                            cameraPrenotata = c;
                            break;
                        }
                    }
                    if (cameraPrenotata != null) {
                        Cliente cliente = new Cliente(nome, cognome, codiceFiscale);
                        Prenotazione prenotazione = new Prenotazione(cliente, cameraPrenotata, numeroNotti);
                        hotel.nuovaPrenotazione(prenotazione);
                        System.out.println("Prenotazione effettuata con successo!" + prenotazione.toString());
                    } else {
                        System.out.println("Camera non disponibile.");
                    }
                    break;
                case 4:
                    hotel.mostaPrenotazioni();
                    break;
                case 5:
                    System.out.println("Incasso giornaliero: " + hotel.incassoTotale());
                    break;
                case 6:
                    System.out.print("Inserisci il codice fiscale del cliente: ");
                    String codiceFiscaleCercato = scanner.next();
                    List<Prenotazione> prenotazioniTrovate = hotel.cercaPrenotazionePerCliente(codiceFiscaleCercato);
                    if (prenotazioniTrovate.isEmpty()) {
                        System.out
                                .println("Nessuna prenotazione trovata per il codice fiscale: " + codiceFiscaleCercato);
                    } else {
                        System.out.println("Prenotazioni trovate:");
                        for (Prenotazione p : prenotazioniTrovate) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Uscita dal programma...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
            System.out.print("Seleziona un'altra opzione: ");
            scelta = scanner.nextInt();
        }
    }

}
