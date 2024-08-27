package fattura;

public class Intestatario {
    
    //attributi
    private String nome;
    private String cognome;
    private String azienda;
    private String identita;

    public Intestatario(String nome, String cognome, String azienda, String identita) {
        this.nome = nome;
        this.cognome = cognome;
        this.azienda = azienda;
        this.identita = identita;
    }
    
    public boolean isAzienda() {
        return "S".equals(this.azienda);
    }
    
   public String isPiva() {
    if (isAzienda()) {
        if (identita.length() != 11) {
            return "Errore";
        }
    } else {
        if (identita.length() != 16) {
            return "Errore";
        }
    }
    return identita;
}

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public String getAzienda() {
        return azienda;
    }
    
    public String getIdentita() {
        return identita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }
    
    public void setIdentita(String identita) {
        this.identita = identita;
    }
}
