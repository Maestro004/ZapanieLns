public class Triangle extends Shape{


    public Triangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }


    @Override
    public double getPerimeter() {
        return getA()+getB()+getC();
    }

}
