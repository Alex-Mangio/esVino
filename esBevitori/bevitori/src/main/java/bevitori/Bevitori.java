package bevitori;

public class Bevitori extends Thread {

    private Botte b;
    private boolean running = true;

    public Bevitori(int num, Botte b) {
        this.b = b;
        this.running = running;
    }

    @Override
    public void run() {
        while (running) {
            int tempo = 0;
            String nome = Thread.currentThread().getName();
            if (b.getLitriTot() < 1) {
                running = false;
            } else {
                b.bevi();
                System.out.println("La persona" + nome + " si sta ubriacando");
                tempo = (int) Math.random() * 2000 + 1000;
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("La persona" + nome + " ha bevuto per:" + tempo);
                System.out.println("La persona" + nome + " ha smesso di ubriacarsi");
                b.smettiDIBere();
            }
        }
    }
}
