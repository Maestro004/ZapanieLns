public class Circle extends Shape {
    public Circle() {
    }

    public Circle(int pi, int radius) {
        super(pi, radius);

}


    @Override
    public double getPerimeter() {
        return 2*(getPi()*getRadius());
    }
}
