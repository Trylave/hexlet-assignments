package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private String type;
    private String value;

    // Конструктор, принимающий атрибуты type и value
    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    // Реализация метода render() для тега <input>
    @Override
    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", type, value);
    }
}
// END
