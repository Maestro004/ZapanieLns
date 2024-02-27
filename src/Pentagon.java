public class Pentagon extends Shape {
    public Pentagon() {
    }



    public Pentagon(double a, double b, double c, double d, double i) {
        super(a, b, c, d, i);
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC()+getD()+getI();
    }
}
