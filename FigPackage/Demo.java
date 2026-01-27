package FigPackage;

public class Demo {
    public static void main(String[] args) {
        System.out.println("-calculations-\n");

        Sphere s = new Sphere();
        s.r = 10;
        s.calcArea(); s.calcVolume();
        s.dispArea(); s.dispVolume();
    }
}