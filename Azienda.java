package fattura;

public class Azienda extends Intestatario {
    private String partitaIVA;

    public Azienda(String nome, String partitaIVA) {
        super(nome);
        this.partitaIVA = partitaIVA;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    @Override
    public String toString() {
        return super.toString() + " | Partita IVA: " + partitaIVA;
    }
}
