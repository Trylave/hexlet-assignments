package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap(); // Получаем текущие данные
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            storage.unset(key); // Удаляем старую пару ключ-значение
            storage.set(value, key); // Меняем местами ключ и значение
        }
    }
}
// END
