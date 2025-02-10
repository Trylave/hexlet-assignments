package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    // Метод для сортировки и выбора первых n элементов
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        return homes.stream()
                .sorted() // Сортировка по площади (используется compareTo)
                .limit(n) // Ограничение количества элементов
                .map(Home::toString) // Преобразование в строку
                .collect(Collectors.toList()); // Сбор в список
    }
}
// END
