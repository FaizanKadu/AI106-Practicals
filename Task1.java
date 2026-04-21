
class MyCustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Main method started in: " + Thread.currentThread().getName());
        
        MyCustomThread myThread = new MyCustomThread();
        myThread.start();
    }
}
