/***Срок сдачи : 28.02.2024 / 17:00


public abstract double getPerimeter()

деген абстракт методун  Shape деген класска кошунуз.

Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Периметр");

        Shape shape1 = new Rectangle(3,4,5,6);
        System.out.println("P = "+shape1.getPerimeter());
        Shape shape2 = new Triangle(3,4,5,6);
        System.out.println("P = "+shape2.getPerimeter());
        Shape shape3 = new Square(6,6,6,6);
        System.out.println("P = "+shape3.getPerimeter());
        Shape shape4 = new Pentagon(2,3,4,5,6);
        System.out.println("P = "+shape4.getPerimeter());
        Shape shape5 = new Circle(7,6);
        System.out.println("C = "+shape5.getPerimeter());
        Shape[] shapes = {shape1,shape2,shape3,shape4,shape5};
        result(shapes);


    }

    private static void result(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}