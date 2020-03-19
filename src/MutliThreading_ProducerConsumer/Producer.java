package MutliThreading_ProducerConsumer;

public class Producer implements Runnable{
    Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
    //produce value
    }

}
