package exercise;

import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileKV implements KeyValueStorage {
    private String filePath;
    private Map<String, String> storage;

    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = filePath;
        Path path = Paths.get(filePath);

        // Создаем директорию, если она не существует
        try {
            Files.createDirectories(path.getParent());
        } catch (Exception e) {
            throw new RuntimeException("Failed to create directory: " + path.getParent(), e);
        }

        if (Files.exists(path)) {
            loadFromFile(); // Загружаем данные из файла, если он существует
        } else {
            this.storage = new HashMap<>(initialData); // Используем начальные данные
            saveToFile(); // Сохраняем начальные данные в файл
        }
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
        saveToFile(); // Сохраняем изменения в файл
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
        saveToFile(); // Сохраняем изменения в файл
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage); // Возвращаем копию данных
    }

    private void saveToFile() {
        try {
            String serializedData = Utils.serialize(storage); // Сериализуем данные в JSON
            Utils.writeFile(Path.of(filePath), serializedData); // Записываем данные в файл
        } catch (Exception e) {
            throw new RuntimeException("Failed to save data to file: " + filePath, e);
        }
    }

    private void loadFromFile() {
        try {
            String serializedData = Utils.readFile(Path.of(filePath)); // Читаем данные из файла
            storage = Utils.deserialize(serializedData); // Десериализуем данные из JSON
        } catch (Exception e) {
            throw new RuntimeException("Failed to load data from file: " + filePath, e);
        }
    }
}
// END
