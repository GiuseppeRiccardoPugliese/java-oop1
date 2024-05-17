package exercise.javashop;

import java.util.Random;

public class Prodotto {

    //ATTRIBUTES
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    //CONSTRUCT
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode(); //Chiamo il metodo per generare il codice random
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //Metodo di SERVIZIO privato per generare un codice random
    private int generateRandomCode(){
        Random random = new Random();
        return random.nextInt(10000);
    }

    //GETTER E SETTER

    //Sola lettura del codice
    public String getCodice(){
        return String.format("%06d", codice);
    }

    //Lettura e scrittura per i restanti attributi
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //METHODS

    //Prezzo base
    public double getPrezzoBase(){
        return prezzo;
    }

    //Prezzo con IVA
    public double getPrezzoIva(){
        return prezzo + (prezzo * iva / 100);
    }

    //Nome esteso (codice + nome)
    public String getNomeEsteso(){
        return getCodice() + "-" + nome;
    }
}
