public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 101);

        while(randoms.hasNext()) {
            int r = randoms.next();
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
