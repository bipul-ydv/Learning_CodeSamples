package MutliThreading_ProducerConsumer;

public class Consumer implements Runnable {
    Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        //consume
        try {
            resource.produce();
        }catch (InterruptedException e){
            System.out.println("Interrupt :"+e.getCause());
        }
    }

}
