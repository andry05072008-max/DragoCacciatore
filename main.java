 drago.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Sto osservando il drago");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main interrotto");
            }

            if (i == 2) {
                c.colpisciDrago(drago);
            }
        }

        tastiera.close();
    }
}
