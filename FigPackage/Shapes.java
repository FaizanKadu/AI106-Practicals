package FigPackage;

class Cone extends Figure {
    double n, s, h;
    public void calcArea() {
         a = (pi * r * s) + (pi * r * r); 
         }
    public void calcVolume() {
         v = (pi * r * v * h) / 3; 
         }
    public void dispArea() {
         System.out.println("Cone Area -" + a); 
         }
    public void dispVolume() {
         System.out.println("Cone Volume " + v); 
         }
}

class Sphere extends Figure {
    public void calcArea() {
         a = (4 * pi * r * r); 
         }
    public void calcVolume() {
         v = (4 * pi * r * r * r) / 3; 
         }
    public void dispArea() {
         System.out.println("Sphere Area" + a); 
         }
    public void dispVolume() {
         System.out.println("Sphere Volume " + v); 
         }
}

class Cylinder extends Figure {
    double h;
    public void calcArea() {
         a = (2 * pi * r * r) + (2 * pi * r * h); 
         }
    public void calcVolume() {
         v = pi * r * r * h; 
         }
    public void dispArea() {
         System.out.println("Cylinder Area " + a); 
         }
    public void dispVolume() {
         System.out.println("Cylinder Volume - " + v); 
         }
}