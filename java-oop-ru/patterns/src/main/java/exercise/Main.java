package exercise;

public class Main {
    public static void main(String[] args) {
        // Создаем тег <input>
        TagInterface inputTag = new InputTag("submit", "Save");

        // Создаем тег <label>, который оборачивает тег <input>
        TagInterface labelTag = new LabelTag("Press Submit", inputTag);

        // Генерируем HTML-код
        System.out.println(labelTag.render());
        // Вывод: <label>Press Submit<input type="submit" value="Save"></label>
    }
}