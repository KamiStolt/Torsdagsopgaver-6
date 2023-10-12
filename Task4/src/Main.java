public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(20);
        System.out.println(c1.getArea());

        Square s1 = new Square(20);
        System.out.println(s1.getArea());

        ShapeBuilder sh1 = new ShapeBuilder();
        sh1.addShape(c1);
        sh1.addShape(s1);

        System.out.println(sh1.getTotalArea());

    }
}