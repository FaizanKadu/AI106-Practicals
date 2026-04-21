class MathThread extends Thread {
    private String operation;
    private double x;

    public MathThread(String operation, double x) {
        this.operation = operation;
        this.x = x;
    }

    @Override
    public void run() {
        if (operation.equalsIgnoreCase("sin")) {
            System.out.println("Sin(" + x + ") = " + Math.sin(x));
        } else if (operation.equalsIgnoreCase("cos")) {
            System.out.println("Cos(" + x + ") = " + Math.cos(x));
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        double angleInRadians = Math.PI / 4;

        MathThread sinThread = new MathThread("sin", angleInRadians);
        MathThread cosThread = new MathThread("cos", angleInRadians);

        sinThread.start();
        cosThread.start();
    }
}
