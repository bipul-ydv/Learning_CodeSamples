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


    public void produce() throws InterruptedException{
        while(true){
            synchronized (this){
               while(getCount()<2){
                   System.out.println("Produce :"+(getCount()+1));
                   setCount(getCount()+1);
                   Thread.sleep(1000);
               }
               notify();
               wait();
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){
            synchronized (this){
                while(getCount()>0){
                    System.out.println("Consume :"+getCount());
                    setCount(getCount()-1);
                    Thread.sleep(1000);
                }
                notify();
                wait();
            }
        }
    }
}
