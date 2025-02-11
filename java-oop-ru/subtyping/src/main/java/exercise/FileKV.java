package exercise;

// BEGIN
import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.HashMap;

public class FileKV implements KeyValueStorage {
    private String filePath;
    private Map<String, String> storage;

    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = filePath;
        if (Files.exists(Path.of(filePath))) {
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
        String serializedData = Utils.serialize(storage); // Сериализуем данные в JSON
        Utils.writeFile(Path.of(filePath), serializedData); // Записываем данные в файл
    }

    private void loadFromFile() {
        String serializedData = Utils.readFile(Path.of(filePath)); // Читаем данные из файла
        storage = Utils.deserialize(serializedData); // Десериализуем данные из JSON
    }
}
// END
