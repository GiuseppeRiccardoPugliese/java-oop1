package exercise.javashop;

public class Main {
    public static void main(String[] args) {

        //Creo il nuovo oggetto(istanza)
        Prodotto prodotto = new Prodotto("Laptop", "Laptop potente con 16GB di RAM", 1200.00, 22.0);

        // Test delle funzionalità della classe Prodotto
        System.out.println("Codice prodotto: " + prodotto.getCodice());
        System.out.println("Nome prodotto: " + prodotto.getNome());
        System.out.println("Descrizione prodotto: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());

        //Test setter
        prodotto.setNome("PlayStation 5");
        prodotto.setDescrizione("Ultimo modello di PlayStation broken");
        prodotto.setPrezzo(500.00);
        prodotto.setIva(22.0);

        //Stampa dopo la modifica utilizzando i setter
        System.out.println("\nDopo la modifica;");
        System.out.println("Nome prodotto: " + prodotto.getNome());
        System.out.println("Descrizione prodotto: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());

    }
}
