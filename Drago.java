public class Drago implements Runnable {

    private int battiti;

    // Costruttore
    public Drago(int battiti) {
        this.battiti = battiti;
    }

    @Override
    public void run() {

        for (int i = 0; i < battiti; i++) {

            System.out.println("Il drago vola " + (i + 1));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Il drago è stato colpito!");
                System.out.println("Il drago è morto!");
                return;
            }
        }
    }
}
