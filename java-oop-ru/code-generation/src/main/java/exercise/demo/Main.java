package exercise;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        User owner = new User(1, "Ivan", "P", 25);

        // Создаем объект Car
        Car car = new Car(1, "bmv", "x5", "black", owner);

        // Сериализуем объект Car в JSON
        String jsonRepresentation = car.serialize();
        System.out.println(jsonRepresentation);

        // Десериализуем JSON обратно в объект Car
        Car instance = Car.deserialize(jsonRepresentation);
        System.out.println(instance.getBrand()); // "bmv"
        System.out.println(instance.getModel()); // "x5"

        // Сохраняем объект Car в файл
        Path path1 = Paths.get("/tmp/file1.json");
        App.save(path1, car);

        // Извлекаем объект Car из файла
        Path path2 = Paths.get("/tmp/file2.json");
        Car car2 = App.extract(path2);
        System.out.println(car2.getModel()); // "passat"
    }
}
