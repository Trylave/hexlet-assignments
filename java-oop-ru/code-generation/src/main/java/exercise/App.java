package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class App {

    // Сохраняет объект Car в файл в виде JSON
    public static void save(Path path, Car car) throws IOException {
        String json = car.serialize(); // Может выбросить IOException
        Files.writeString(path, json);
    }

    // Читает JSON из файла и возвращает объект Car
    public static Car extract(Path path) throws IOException {
        String json = Files.readString(path);
        return Car.deserialize(json); // Может выбросить IOException
    }
}
// END
