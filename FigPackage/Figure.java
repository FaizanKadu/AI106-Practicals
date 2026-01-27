package FigPackage;

public abstract class Figure {
    public double r, a, v;
    public double pi = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}