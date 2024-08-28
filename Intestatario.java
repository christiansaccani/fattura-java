package fattura;

public class Intestatario {
    
    //attributi
    private String nome;

    public Intestatario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }



    String getUniqueValue(Intestatario i) {
        if (i instanceof Fisico) {
            return ((Fisico) i).getCodiceFiscale();
        } else if (i instanceof Azienda) {
            return ((Azienda) i).getPartitaIVA();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Intestatario: " + "nome: " + nome;
    }   
}
