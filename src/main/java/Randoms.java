import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    public Randoms(int min, int max) {
        int diff = max - min;
        this.random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        //System.out.println(i);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
    }

    // return (int) ((Math.random() * (max - min)) + min);
    //...
}