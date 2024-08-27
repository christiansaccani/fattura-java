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

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Intestatario: " + "nome: " + nome;
    }   
}
