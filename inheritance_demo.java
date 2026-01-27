class figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("The area for this figure is" + a);
    }

    public void dispVolume() {
        System.out.println("The volume we calculated" + v);
    }
}

class cone extends figure {
    double h, s;

    public void calcArea() {
        
        a = (3.14 * r * s) + (3.14 * r * s);
    }

    public void calcVolume() {
        
        v = (3.14 * r * s) / 3;
    }
}

public class inheritance_demo {
    public static void main(String[] args) {
        cone myCone = new cone();
        myCone.r = 7.5;
        myCone.s = 10.0;
        myCone.h = 12.0;

        System.out.println("..cecking the results for our cone inheritance test...");
        myCone.calcArea();
        myCone.calcVolume();
        
        myCone.dispArea();
        myCone.dispVolume();
    }
}
