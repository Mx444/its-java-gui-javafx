package hotel;

public class Camera {
    private int numero;
    private String tipo;
    private double prezzoPerNotte;
    private boolean occupata;
    private Cliente cliente;

    public Camera(int numero, String tipo, double prezzoPerNotte) {
        this.numero = numero;
        this.tipo = tipo;
        this.prezzoPerNotte = prezzoPerNotte;
        this.occupata = false;
        this.cliente = null;
    }

    // #region utils
    public void prenota(Cliente cliente) {
        if (!occupata) {
            this.cliente = cliente;
            this.occupata = true;
        } else {
            System.out.println("La camera è già occupata.");
        }
    }

    public void libera() {
        if (occupata) {
            this.cliente = null;
            this.occupata = false;
        } else {
            System.out.println("La camera è già libera.");
        }
    }

    // #endregion

    // #region getters and setters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrezzoPerNotte() {
        return prezzoPerNotte;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrezzoPerNotte(double prezzoPerNotte) {
        this.prezzoPerNotte = prezzoPerNotte;
    }

    // #endregion

    @Override
    public String toString() {
        return "Camera{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", prezzoPerNotte=" + prezzoPerNotte +
                ", occupata=" + occupata +
                ", cliente=" + (cliente != null ? cliente.getNome() : "Nessuno") +
                '}';
    }
}
