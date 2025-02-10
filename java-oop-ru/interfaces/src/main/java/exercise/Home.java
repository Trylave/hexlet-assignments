package exercise;

// BEGIN
public interface Home extends Comparable<Home> {
    double getArea(); // Метод для получения площади
    int compareTo(Home another); // Метод для сравнения по площади
}
// END
