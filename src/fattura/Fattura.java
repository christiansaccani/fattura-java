package fattura;
import java.util.ArrayList;

public class Fattura {

    // Attributi privati della classe
    private Intestatario intestatario;
    private ArrayList<Prodotto> prodotti;
    private String data;          
    private double ammontare;    
    private String modalita;  

    public Fattura(Intestatario i, String data, double ammontare, String modalita) {
        intestatario = new Intestatario(i.getNome());
        this.data = data;
        this.ammontare = ammontare;
        this.modalita = modalita;
    }
    
    public Fattura(Intestatario i, String data, String modalita) {
        intestatario = new Intestatario(i.getNome());
        this.prodotti = new ArrayList<Prodotto>();
        this.data = data;
        this.modalita = modalita;
    }
    
    public static class SequenzialeUnivoco {
        private static int counter = 0;

        public static String prossimoNumero() {
            String numeroUnivoco = String.format("%06d", counter);
            counter++;
            return numeroUnivoco;
        }
    }
    
    public void aggiungiProdotto(Prodotto p) {
        prodotti.add (p);
    } 

    public void calcolaTotale() {
        double totale = 0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getCosto();
        }
        this.ammontare = Math.round(totale * 100.0) / 100.0;;
    }
    
    public boolean isNegativo() {
        return this.ammontare <= 0;
    }
    
    public boolean isNotOk() {
        return !modalita.equals("B") && !modalita.equals("C") && !modalita.equals("A");
    } 

    @Override
    public String toString() {
        try{
            this.calcolaTotale();
            return "Fattura: " + intestatario + " | prodotti: " + prodotti + " | data: " + data + 
            " | ammontare: " + (isNegativo() ? "errore" : ammontare) + 
            " | modalita: " + (isNotOk() ? "errore" : modalita);

        }
        catch(NullPointerException e) {
           return "Fattura: " + intestatario +  " | data: " + data + 
            " | ammontare: " + (isNegativo() ? "errore" : ammontare) + 
            " | modalita: " + (isNotOk() ? "errore" : modalita);
        }
    }
}
