public abstract class Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private double i;
    private int pi;
    private int radius;

    public Shape(int pi, int radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public Shape() {
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double p, double r) {

    }


    //    for Square
    public Shape(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //    for Pentagon
    public Shape(double a, double b, double c, double d, double i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
    }


    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }


    public abstract double getPerimeter();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setD(double d) {
        this.d = d;

    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", i=" + i +
                ", pi=" + pi +
                ", radius=" + radius +
                '}';
    }
}