interface QueueImpl {
    void insert(int x);
    void delete();
    void display();
}

class QueueDemo implements QueueImpl {
    int arr[] = new int[10];
    int rear = -1;

    public void insert(int x) {
        if (rear == 9) {
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = x;
        }
    }

    public void delete() {
        if (rear == -1) {
            System.out.println("queue is empty");
        } else {
            System.out.println("Deleted" + arr[0]);
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }
    }

    public void display() {
        if (rear == -1) {
            System.out.println("nothing to show");
        } else {
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        QueueDemo q = new QueueDemo();
        q.insert(5);
        q.insert(15);
        q.display();
        q.delete();
        q.display();
    }
}
