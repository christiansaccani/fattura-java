package fattura;

public class FatturaTest {

    public static void main(String[] args) {
        // oggetti Intestatario
        Intestatario i = new Intestatario("Leonardo", "Bianchi","N","SCCCRS99A26H223M");
        Intestatario i2 = new Intestatario("Pasquale", "Mazzocchi","N","SCCCRS926H223M");
        Intestatario i3 = new Intestatario("Rossi", "SRL","S","12345678901");

        // oggetti Prodotto
        Prodotto p = new Prodotto("Scarpe", 70.99);
        Prodotto p2 = new Prodotto("Guanti", 5.99);
        Prodotto p3 = new Prodotto("Sciarpa", 7.99);
        
        // oggetti Fattura
        Fattura f1 = new Fattura(i, "270824", 1456, "B");
        Fattura f3 = new Fattura(i2, "290824", 4298, "C");
        Fattura f2 = new Fattura(i2, "290824", -4298, "C");
        Fattura f4 = new Fattura(i, "280824", 5298, "Co");
        Fattura f5 = new Fattura(i3, "230624", 3201, "A");
        Fattura f6 = new Fattura(i3, "230624", "A");
        f6.aggiungiProdotto(p);
        
        // Stampa delle informazioni della fattura
       System.out.println("f1: " + f1.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        
        System.out.println("f2: " + f2.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        
        System.out.println("f3: " + f3.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        
        System.out.println("f4: " + f4.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        
        System.out.println("f5: " + f5.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
        
        System.out.println("f6: " + f6.toString());
        System.out.println("Numero univoco: " + Fattura.SequenzialeUnivoco.prossimoNumero());
    }
}
