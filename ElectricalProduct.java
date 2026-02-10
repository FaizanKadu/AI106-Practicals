class Product {
    int pid;
    String name;
    int cid;
    double price;

    Product(int id, String n, int c, double p) {
        pid = id;
        name = n;
        cid = c;
        price = p;
    }
}

class ElectricalProduct extends Product {
    String vrange;
    int watt;

    ElectricalProduct(int id, String n, int c, double p, String v, int w) {
        super(id, n, c, p);
        vrange = v;
        watt = w;
    }

    void update(int w, double p) {
        watt = w;
        price = p;
    }

    void show() {
        System.out.println(name + " " + watt + "W " + vrange + " Price " + price);
    }

    public static void main(String args[]) {
        ElectricalProduct e = new ElectricalProduct(1, "Fan", 101, 2000, "220V", 50);
        e.update(60, 2500);
        e.show();
    }
}
