public class TestShape {
    public static void main(String[] args) {
        
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("red", false);
        System.out.println(s2);

        Circle2 c1 = new Circle2(2.5, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}
