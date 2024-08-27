package fattura;

public class Prodotto {

    private String descrizione;
    private double costo;

    public Prodotto(String descrizione, double costo) {
        this.descrizione = descrizione;
        this.costo = costo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "{"+ descrizione + costo + "}";
    } 
}
