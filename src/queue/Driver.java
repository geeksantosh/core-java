package queue;

public class Driver {
    public static void main(String[] args) {
        QueueDemo runQueue = new QueueDemo();
        runQueue.enQueue(5);
        runQueue.enQueue(7);
        runQueue.enQueue(9);
        runQueue.enQueue(2);

        runQueue.deQueue();
        runQueue.deQueue();
        runQueue.deQueue();



        runQueue.show();

    }


}
