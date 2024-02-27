public class Rectangle extends Shape{
    public Rectangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()*2;
    }

}

