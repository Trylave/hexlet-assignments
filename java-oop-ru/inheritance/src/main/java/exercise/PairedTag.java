package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN

public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        String attributesString = attributesToString();
        String childrenString = children.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());

        return "<" + getName() + (attributesString.isEmpty() ? "" : " " + attributesString) + ">"
                + body + childrenString + "</" + getName() + ">";
    }
}
// END
