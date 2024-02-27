public class Square extends Shape {
    public Square() {
    }

    public Square(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC()+getD();
    }

    public void getPerimeter(double a, double b, double c, double d) {


    }
}


