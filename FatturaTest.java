package fattura;

public class FatturaTest {

    public static void main(String[] args) {
        // Creazione di un oggetto Intestatario
        Intestatario i = new Intestatario("Leonardo", "Bianchi","N","SCCCRS99A26H223M");
        Intestatario i2 = new Intestatario("Pasquale", "Mazzocchi","N","SCCCRS926H223M");
        Intestatario i3 = new Intestatario("Rossi", "SRL","S","12345678901");
        
        
        // Creazione di un oggetto Fattura
        Fattura f1 = new Fattura(i, "270824", 1456, "B");
        Fattura f3 = new Fattura(i2, "290824", 4298, "C");
        Fattura f2 = new Fattura(i2, "290824", -4298, "C");
        Fattura f4 = new Fattura(i, "280824", 5298, "Co");
        Fattura f5 = new Fattura(i3, "230624", 3201, "A");
        
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
    }
}
