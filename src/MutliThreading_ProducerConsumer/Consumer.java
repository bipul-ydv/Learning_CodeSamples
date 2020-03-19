package MutliThreading_ProducerConsumer;

public class Consumer implements Runnable {
    Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //consume
    }

}
