package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // Генерирует конструктор со всеми полями
@Getter // Генерирует геттеры для всех полей
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}