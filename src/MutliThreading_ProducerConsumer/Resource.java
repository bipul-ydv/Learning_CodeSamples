package MutliThreading_ProducerConsumer;

public class Resource {
    private int count;

    public Resource(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
