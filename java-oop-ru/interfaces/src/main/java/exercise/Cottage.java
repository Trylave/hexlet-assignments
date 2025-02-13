package exercise;

// BEGIN
public class Cottage implements Home {
    private double area; // Общая площадь
    private int floorCount; // Количество этажей

    // Конструктор
    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    // Реализация метода getArea()
    @Override
    public double getArea() {
        return area;
    }

    // Реализация метода compareTo()
    @Override
    public int compareTo(Home another) {
        double thisArea = this.getArea();
        double anotherArea = another.getArea();
        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        } else {
            return 0;
        }
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
