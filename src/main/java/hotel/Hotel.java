package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private ArrayList<Camera> camere;
    private ArrayList<Prenotazione> prenotazioni;

    public Hotel() {
        this.camere = new ArrayList<>();
        this.prenotazioni = new ArrayList<>();
    }

    // #region utils
    public void aggiungiCamera(Camera camera) {
        camere.add(camera);
    }

    public void nuovaPrenotazione(Prenotazione prenotazione) {
        prenotazioni.add(prenotazione);
        prenotazione.getCamera().prenota(prenotazione.getCliente());
    }

    public void mostaPrenotazioni() {
        for (Prenotazione prenotazione : prenotazioni) {
            System.out.println(prenotazione);
        }
    }

    public double incassoTotale() {
        double incasso = 0;
        for (Prenotazione prenotazione : prenotazioni) {
            incasso += prenotazione.calcolaCostoTotale();
        }
        return incasso;
    }

    public List<Prenotazione> cercaPrenotazionePerCliente(String codiceFiscale) {
        List<Prenotazione> prenotazioniTrovate = new ArrayList<>();
        for (Prenotazione prenotazione : prenotazioni) {
            if (prenotazione.getCliente().getCodiceFiscale().equals(codiceFiscale)) {
                prenotazioniTrovate.add(prenotazione);
            }
        }
        return prenotazioniTrovate;
    }

    // #endregion

    // #region getters and setters
    public List<Camera> getCamereDisponibili() {
        List<Camera> camereDisponibili = new ArrayList<>();
        for (Camera camera : camere) {
            if (!camera.isOccupata()) {
                camereDisponibili.add(camera);
            }
        }
        return camereDisponibili;

    }
    // #endregion
}
