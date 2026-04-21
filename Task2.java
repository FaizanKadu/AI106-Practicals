public class Task2 implements Runnable {
    private Thread t;

    public Task2() {
        t = new Thread(this, "ConstructorThread");
        System.out.println("Thread created in constructor. Starting...");
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Runnable thread is executing: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Task2();
    }
}
