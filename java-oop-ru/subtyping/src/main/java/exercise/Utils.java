package exercise;

import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Path;
import java.nio.file.Files;

public class Utils {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String serialize(Map<String, String> data) {
        try {
            return MAPPER.writeValueAsString(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> deserialize(String data) {
        try {
            return MAPPER.readValue(data, Map.class);
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
