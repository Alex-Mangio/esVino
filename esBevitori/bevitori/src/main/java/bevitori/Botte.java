package bevitori;

public class Botte {

    private int rubinetti = 3;
    private int litriTot = 100;

    public Botte() {
        this.rubinetti = rubinetti;
        this.litriTot = litriTot;
    }

    public synchronized void bevi() {
        int litriPresi;
        while (rubinetti < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        rubinetti--;
        litriPresi = (int) (Math.random() * 3 + 1);
        litriTot -= litriPresi;
        System.out.println("La persona ha bevuto:" + litriPresi + " litri");
    }

    public synchronized void smettiDIBere() {
        rubinetti++;
        notifyAll();
    }

    public int getLitriTot() {
        return litriTot;
    }
}
