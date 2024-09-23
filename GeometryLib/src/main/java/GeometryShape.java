
public abstract class GeometryShape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends GeometryShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

}

class Triangle extends GeometryShape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }
}

class Circle extends GeometryShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    class Trapezoid extends GeometryShape {
        private double a;
        private double b;
        private double h;
        private double c;
        private double d;

        public Trapezoid(double a, double b, double h, double c, double d) {
            this.a = a;
            this.b = b;
            this.h = h;
            this.c = c;
            this.d = d;
        }

        @Override
        public double area() {
            return ((a + b) * h) / 2;
        }

        @Override
        public double perimeter() {
            return a + b + c + d;
        }
    }
}