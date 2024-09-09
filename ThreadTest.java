public class ThreadTest {
    public static void main(String[] args) {
        Worker first = new Worker("first job");
        Worker second = new Worker("second job");
        Worker third = new Worker("third job");
        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);

        t1.start();
        t2.start();
        t3.start();
    }
}
