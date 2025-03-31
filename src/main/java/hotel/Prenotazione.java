package hotel;

public class Prenotazione {
    private Cliente cliente;
    private Camera camera;
    private int numeroNotti;

    public Prenotazione(Cliente cliente, Camera camera, int numeroNotti) {
        this.cliente = cliente;
        this.camera = camera;
        this.numeroNotti = numeroNotti;
    }

    // #region utils
    public double calcolaCostoTotale() {
        return camera.getPrezzoPerNotte() * numeroNotti;
    }
    // #endregion

    // #region getters and setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public int getNumeroNotti() {
        return numeroNotti;
    }

    public void setNumeroNotti(int numeroNotti) {
        this.numeroNotti = numeroNotti;
    }

    // #endregion

    @Override
    public String toString() {
        return "Prenotazione{" +
                "cliente=" + cliente +
                ", camera=" + camera +
                ", numeroNotti=" + numeroNotti +
                '}';
    }
}
