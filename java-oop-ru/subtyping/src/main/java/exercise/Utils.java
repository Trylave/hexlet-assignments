// Методы класса в этом файл нужны для самостоятельной работы

package exercise;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Utils {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String serialize(Map<String, String> data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> deserialize(String data) {
        try {
            return mapper.readValue(data, Map.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile(Path filePath) {
        try {
            return Files.readString(filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(Path filePath, String content) {
        try {
            Files.writeString(filePath, content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}