import java.util.Iterator;

public class Randoms implements Iterator {
    protected int min;
    protected int max;

    protected Random current;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        this.current = new Random(this.min, this.max);
        return this.current();
    }

    public Integer current() {
        return this.current.getValue();
    }
    
    protected class Random {
        protected int value;
        public Random(int min, int max) {
            this.value = (int)((Math.random() * (max - min + 1)) + min);
        }

        public int getValue() {
            return this.value;
        }
    }
}