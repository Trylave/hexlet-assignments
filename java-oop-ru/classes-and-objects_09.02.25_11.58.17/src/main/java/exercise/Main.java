package exercise;

public class Main {
    public static void main(String[] args) {
        // Создаем две точки
        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);

        // Создаем отрезок, используя эти точки
        Segment segment = new Segment(point1, point2);

        // Получаем середину отрезка
        Point midPoint = segment.getMidPoint();

        // Выводим координаты середины отрезка
        System.out.println("Midpoint X: " + midPoint.getX()); // 5
        System.out.println("Midpoint Y: " + midPoint.getY()); // 2
    }
}
