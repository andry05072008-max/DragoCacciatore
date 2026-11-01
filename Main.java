import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci il numero di battiti d'ali: ");
        int numeroBattiti = tastiera.nextInt();

        // Punti 1 e 2: istanziazione e avvio del Thread tramite Runnable
        Drago dragoRunnable = new Drago(numeroBattiti);
        Thread threadDrago = new Thread(dragoRunnable);

        threadDrago.start();

        // Punto 4: istanziazione del Cacciatore
        Cacciatore cacciatore = new Cacciatore();

        // Punti 2 e 3: ciclo di osservazione con sleep
        for (int i = 0; i < numeroBattiti; i = i + 1) {
            System.out.println("Main: sto osservando il drago...");

            // Simula l'attacco del cacciatore a metà dell'osservazione
            if (i == numeroBattiti / 2) {
                cacciatore.colpisciDrago(threadDrago);
            }

            // Punto 3: sleep nel ciclo del Main
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Errore nell'attesa del Main.");
            }
        }

        tastiera.close();
    }
}
