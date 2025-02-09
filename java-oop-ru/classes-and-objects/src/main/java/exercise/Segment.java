package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    // Конструктор, принимающий начальную и конечную точки отрезка
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    // Метод для получения начальной точки отрезка
    public Point getBeginPoint() {
        return beginPoint;
    }

    // Метод для получения конечной точки отрезка
    public Point getEndPoint() {
        return endPoint;
    }

    // Метод для получения середины отрезка
    public Point getMidPoint() {
        int midX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(midX, midY);
    }
}
// END
