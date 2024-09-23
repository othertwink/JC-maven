
public class GeometryUtils {

    // Преобразование из квадратных метров в квадратные сантиметры
    public static double squareMetersToSquareCentimeters(double areaInSquareMeters) {
        return areaInSquareMeters * 10_000; // 1 м^2 = 10 000 см^2
    }

    // Преобразование из квадратных сантиметров в квадратные метры
    public static double squareCentimetersToSquareMeters(double areaInSquareCentimeters) {
        return areaInSquareCentimeters / 10_000;
    }

    // Сравнение площадей двух фигур
    public static String compareArea(GeometryShape shape1, GeometryShape shape2) {
        double area1 = shape1.area();
        double area2 = shape2.area();

        if (area1 > area2) {
            return "Первая фигура имеет большую площадь.";
        } else if (area1 < area2) {
            return "Вторая фигура имеет большую площадь.";
        } else {
            return "Обе фигуры имеют одинаковую площадь.";
        }
    }

    // Сравнение периметров двух фигур
    public static String comparePerimeter(GeometryShape shape1, GeometryShape shape2) {
        double perimeter1 = shape1.perimeter();
        double perimeter2 = shape2.perimeter();

        if (perimeter1 > perimeter2) {
            return "Первая фигура имеет больший периметр.";
        } else if (perimeter1 < perimeter2) {
            return "Вторая фигура имеет больший периметр.";
        } else {
            return "Обе фигуры имеют одинаковый периметр.";
        }
    }

    // Преобразование длины из метров в сантиметры
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    // Преобразование длины из сантиметров в метры
    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

}
