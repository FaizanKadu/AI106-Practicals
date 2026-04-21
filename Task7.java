import java.util.Random;

class BankAccount {
    private int balance = 600;
    private boolean isFatherTurn = true;

    public synchronized void deposit(int amount) throws InterruptedException {
        while (!isFatherTurn) {
            wait();
        }
        balance += amount;
        System.out.println("Father deposits: Rs." + amount + " | Balance: Rs." + balance);
        
        if (balance > 2000) {
            System.out.println(">>> Balance exceeded Rs.2000. Son's turn to withdraw.");
            isFatherTurn = false;
            notifyAll();
        }
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        while (isFatherTurn) {
            wait();
        }
        int actualWithdrawal = Math.min(amount, balance);
        balance -= actualWithdrawal;
        System.out.println("Son withdraws: Rs." + actualWithdrawal + " | Balance: Rs." + balance);
        
        if (balance < 500) {
            System.out.println(">>> Balance dropped below Rs.500. Father's turn to deposit.");
            isFatherTurn = true;
            notifyAll();
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Random random = new Random();

        // Father Thread
        Thread father = new Thread(() -> {
            try {
                while (true) {
                    int depositAmt = random.nextInt(200) + 1; // 1 to 200
                    account.deposit(depositAmt);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Son Thread
        Thread son = new Thread(() -> {
            try {
                while (true) {
                    int withdrawAmt = random.nextInt(150) + 1;
                    account.withdraw(withdrawAmt);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        father.start();
        son.start();
    }
}
