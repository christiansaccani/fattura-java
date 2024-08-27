package fattura;

public class Fisico extends Intestatario {
    private String codiceFiscale;

    public Fisico(String nome, String codiceFiscale) {
        super(nome);
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return super.toString() + " | Codice Fiscale: " + codiceFiscale;
    }
}
