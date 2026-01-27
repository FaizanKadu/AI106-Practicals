class x {
    int i, j;
    x(int a, int b) {
        i = a;
        j = b;
    }
    int final_sum() {
        return i + j;
    }
}

class y extends x {
    y(int a, int b) {
        super(a, b);
    }
    int find_product() {
        return i * j;
    }
}

class Z extends y {
    Z(int a, int b) {
        super(a, b);
    }
    int find_difference() {
        return i - j;
    }
}

public class multilevel_inheritance_demo {
    public static void main(String[] args) {
        Z obj = new Z(15, 5);
        
        System.out.println("working with multilevel inheritance (Z extending Y extending X)");
        System.out.println("The Sum from class X " + obj.final_sum());
        System.out.println("the Product from class Y - " + obj.find_product());
        System.out.println("The difference from class Z - " + obj.find_difference());
    }
}
