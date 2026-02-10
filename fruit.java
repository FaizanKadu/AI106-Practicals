class fruit {
    String name;
    String type;
    int price;

    fruit(String n, String t, int p) {
        name = n;
        type = t;
        price = p;
    }

    void displayFruit() {
        System.out.println(name + " is" + type + " and costs" + price);
    }

    public static void main(String args[]) {
        fruit f1 = new fruit("Apple", "single", 20);
        fruit f2 = new fruit("grapes", "Bunch", 50);
        f1.displayFruit();
        f2.displayFruit();
    }
}
