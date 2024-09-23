public class GeometryApp {
    public static void main(String[] args) {
        GeometryShape circle = new Circle(5);
        GeometryShape rectangle = new Rectangle(4, 6);
        GeometryShape triangle = new Triangle(3);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        // utils 1.0.0 snapshot
        // System.out.println("Compare: " + Utils.compareArea(circle, rectangle));

        // GeometryUtils 1.1.0 snapshot
        System.out.println("Compare: " + GeometryUtils.compareArea(circle, rectangle));

        // ThreeDimensionalShapes 1.1.0 snapshot
        ThreeDimensionalShapes cube = new Cube(5);
    }
}
