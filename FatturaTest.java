package fattura;
import java.util.ArrayList;

public class FatturaTest {

    public static void main(String[] args) {

        // ----- INTESTATARI ----- //
        
        Intestatario i1 = new Fisico("Leonardo Bianchi", "BNCLRD99M01H501A");
        Intestatario i2 = new Fisico("Pasquale Mazzocchi", "MZZPQL99M01H501X");
        Intestatario i3 = new Azienda("Rossi SRL", "10987654321");
        Intestatario i4 = new Fisico("Mario Rossi", "RSSMRA80A01H501Z");
        Intestatario i5 = new Azienda("Tech Srl", "12345678901");
        Intestatario i6 = new Fisico("Pasquale Mazzocchi", "MZZPQL99M01H501X");  //must be error

        ArrayList<Intestatario> listaIntestatari = new ArrayList<Intestatario>();
        ArrayList<String> valoriUnici = new ArrayList<String>();

        // Aggiungi a lista solo se il valore unico non è presente nella lista dei valori unici

        Intestatario[] intestatari = {i1, i2, i3, i4, i5, i6};
        for (Intestatario intestatario : intestatari) {
            String valoreUnico = intestatario.getUniqueValue(intestatario);
            if (valoreUnico != null && !valoriUnici.contains(valoreUnico)) {
                valoriUnici.add(valoreUnico);
                listaIntestatari.add(intestatario);
            }
        }

        for (Intestatario intestatario : listaIntestatari) {
            String valoreUnico = intestatario.getUniqueValue(intestatario);
            if (valoreUnico != null) {
                System.out.println("ID: " + valoreUnico);
            }
        }
        
        // ----- PRODOTTI ----- //
        
        Prodotto p = new Prodotto("Scarpe", 70.99);
        Prodotto p2 = new Prodotto("Guanti", 5.99);
        Prodotto p3 = new Prodotto("Sciarpa", 7.99);
        
        // ----- FATTURE ----- //
        
        Fattura f1 = new Fattura(i1, "270824", 1456, "B");
        Fattura f3 = new Fattura(i2, "290824", 4298, "C");
        Fattura f2 = new Fattura(i2, "290824", -4298, "C");
        Fattura f4 = new Fattura(i3, "280824", 5298, "Co");
        Fattura f5 = new Fattura(i4, "230624", 3201, "A");
        Fattura f6 = new Fattura(i5, "230624","A");
        f6.aggiungiProdotto(p);
        f6.aggiungiProdotto(p2);
        f6.aggiungiProdotto(p3);
        
        ArrayList<Fattura> fatture = new ArrayList<Fattura>();
        fatture.add(f1);
        fatture.add(f2);
        fatture.add(f3);
        fatture.add(f4);
        fatture.add(f5);
        fatture.add(f6);
        
        // ----- STAMPA ----- //
        
        for (Fattura fattura : fatture) {
            System.out.println("f" + (fatture.indexOf(fattura) + 1) + ": " + fattura.toString());
            System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        }
    }
}
