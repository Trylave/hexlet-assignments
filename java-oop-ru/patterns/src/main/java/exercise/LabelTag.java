package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface childTag;

    // Конструктор, принимающий текст и дочерний тег
    public LabelTag(String text, TagInterface childTag) {
        this.text = text;
        this.childTag = childTag;
    }

    // Реализация метода render() для тега <label>
    @Override
    public String render() {
        return String.format("<label>%s%s</label>", text, childTag.render());
    }
}
// END
