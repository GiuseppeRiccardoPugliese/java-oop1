package exercise.javabank;

import java.util.Random;

public class Conto {

    //ATTRIBUTES
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    //CONSTRUCT
    public Conto(String nomeProprietario){
        this.numeroConto = randomCodiceConto();
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
    }

    //SETTER
    public void setNomeProprietario(String nomeProprietario){
        this.nomeProprietario =  nomeProprietario;
    }

    //GETTER
    public String getNomeProprietario(){
        return nomeProprietario;
    }

    public int getNumeroConto(){
        return numeroConto;
    }

    public double getSaldo(){
        return saldo;
    }

    //METHODS
    private int randomCodiceConto(){ //Random code
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    //Metodo per VERSARE i soldi
    public boolean versaSoldi(double importo){
        if (importo > 0){
            saldo += importo;
            return true;
        }else {
            return false;
        }
    }

    //Metodo per PRELEVARE i soldi
    public boolean prelevaSoldi(double importo){
        if (importo > 0 && saldo >= importo){
            saldo -= importo;
            return true;
        }else {
            return false;
        }
    }

    // Metodi di utilità per ritornare le informazioni del conto e il saldo formattato
    public String getInfo() {
        return "Codice conto: " + getNumeroConto() + "\nProprietario: " + getNomeProprietario() + "\nSaldo: " + getSaldoFormattato();
    }

    public String getSaldoFormattato() {
        return String.format("%.2f€", saldo);
    }
}
