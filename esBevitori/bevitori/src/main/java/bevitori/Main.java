package bevitori;

public class Main {
    public static void main(String[] args) {

        Botte botte = new Botte();

        for (int i = 0; i < 10; i++) {

            Bevitori b = new Bevitori(i, botte);
            b.start();
        }
    }
}