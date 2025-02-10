package exercise;

// BEGIN
public class Flat implements Home {
    private double area; // Жилая площадь
    private double balconyArea; // Площадь балкона
    private int floor; // Этаж

    // Конструктор
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    // Реализация метода getArea()
    @Override
    public double getArea() {
        return area + balconyArea; // Общая площадь = жилая площадь + площадь балкона
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
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
