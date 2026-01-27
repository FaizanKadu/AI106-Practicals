abstract class Figure {
    double pi = 3.1420;
    double r, a, v;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}

class cone extends Figure {
    double n, s;
    cone(double r, double s) {
        this.r = r;
        this.s = s;
    }
    public void calcArea() {
      a = (pi * r * s) + (pi * r * r); 
    }
    public void calcVol() {
      v = (pi * r * r * 5) / 3; 
    }
    public void DispArea() {
      System.out.println("Area of the cone is - " + a); 
    }
    public void Dispvol() {
      System.out.println("Volume of the cone is " + v); 
    }
}

class sphere extends Figure {
    sphere(double r) { this.r = r; }
    public void calcArea() {
      a = 4 * pi * r * r; 
    }
    public void calcVol() {
      v = (4 * pi * r * r * r) / 3; 
    }
    public void DispArea() {
      System.out.println("Sphere area" + a); 
    }
    public void Dispvol() {
      System.out.println("Sphere volume - " + v); 
    }
}

class cylinder extends Figure {
    double h;
    cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public void calcArea() {
      a = (2 * pi * r * r) + (2 * pi * r * h); 
    }
    public void calcVol() {
      v = pi * r * r * h; 
    }
    public void DispArea() {
      System.out.println("Cylinder area; " + a); 
    }
    public void Dispvol() {
      System.out.println("Cylinder volume " + v); 
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("...Running the abstract class demonstration...");
        
        cone c = new cone(5.0, 10.0);
        c.calcArea(); c.calcVol();
        c.DispArea(); c.Dispvol();

        sphere s = new sphere(4.0);
        s.calcArea(); s.calcVol();
        s.DispArea(); s.Dispvol();

        cylinder cy = new cylinder(3.0, 7.0);
        cy.calcArea(); cy.calcVol();
        cy.DispArea(); cy.Dispvol();
    }
}
