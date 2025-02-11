package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class FileKVTest {
    private static final Path filePath = Path.of("src/test/resources/file");

    @BeforeEach
    public void beforeEach() throws Exception {
        Files.deleteIfExists(filePath); // Удаляем файл перед каждым тестом
    }

    @AfterEach
    public void afterEach() throws Exception {
        Files.deleteIfExists(filePath); // Удаляем файл после каждого теста
    }

    @Test
    void testFileKV() {
        KeyValueStorage storage = new FileKV(filePath.toString(), Map.of("key", "value"));
        assertThat(storage.get("key", "")).isEqualTo("value");

        storage.set("key2", "value2");
        assertThat(storage.get("key2", "")).isEqualTo("value2");

        storage.unset("key");
        assertThat(storage.get("key", "default")).isEqualTo("default");

        Map<String, String> data = storage.toMap();
        assertThat(data).isEqualTo(Map.of("key2", "value2"));
    }

    @Test
    void testFilePersistence() {
        // Создаем первый объект FileKV и добавляем данные
        KeyValueStorage storage = new FileKV(filePath.toString(), Map.of("key", "value"));
        storage.set("key2", "value2");

        // Создаем второй объект FileKV и проверяем, что данные загрузились из файла
        KeyValueStorage newStorage = new FileKV(filePath.toString(), Map.of());
        assertThat(newStorage.get("key", "")).isEqualTo("value");
        assertThat(newStorage.get("key2", "")).isEqualTo("value2");
    }
}