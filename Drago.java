public class Drago implements Runnable {

    private int battiti;

    // Costruttore
    public Drago(int battiti) {
        this.battiti = battiti;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.battiti; i=i+1) {
            
            // controllo manuale dello stato di interruzione
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Il drago è stato colpito e muore definitivamente!");
                break; // Interrompe il ciclo e termina il thread
            }

            System.out.println("Il drago vola " + (i + 1));

        }
    }
}
