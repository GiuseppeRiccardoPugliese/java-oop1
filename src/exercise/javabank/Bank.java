package exercise.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto in Bank!");
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        // Creazione del conto
        Conto conto = new Conto(nome);

        System.out.println("Conto creato con successo!");
        System.out.println(conto.getInfo());

        while (true){
            //SCELTA utente
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Versa una somma");
            System.out.println("2. Preleva una somma");
            System.out.println("3. Esci");

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            //SE 3 ESCI
            if (scelta == 3) {
                System.out.println("Grazie mille e arrivederci!");
                break;
            }

            double importo;

            //SWITCH per le restanti scelte da fare
            switch (scelta){
                case 1: //SCELTA 1
                    System.out.println("Inserisci l'importo: ");
                    importo = scanner.nextDouble();
                    if (conto.versaSoldi(importo)) {
                        System.out.println("Importo versato con successo");
                    }else {
                        System.out.println("Errore durante il versamento dei soldi, l'importo deve essere positivo");
                    }
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                    break;
                
                case 2: //SCELTA 2
                    System.out.println("Inserisci l'importo: ");
                    importo = scanner.nextDouble();

                    if (conto.prelevaSoldi(importo)) {
                        System.out.println("Saldo prelevato con successo");
                    }else {
                        System.out.println("Errore durante il prelevamento dei soldi, saldo insufficiente oppure importo negativo");
                    }
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }
        scanner.close();
    }
}
