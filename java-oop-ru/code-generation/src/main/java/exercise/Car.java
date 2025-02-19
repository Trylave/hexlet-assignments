package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@AllArgsConstructor
@Getter
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private User owner;

    // Сериализация объекта в JSON строку
    public String serialize() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    // Десериализация JSON строки в объект Car
    public static Car deserialize(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Car.class);
    }
}
