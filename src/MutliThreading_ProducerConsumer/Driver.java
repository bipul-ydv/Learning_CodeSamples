package MutliThreading_ProducerConsumer;

public class Driver {
    public static void main(String[] args) {
        final Resource resource = new Resource(0);
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
