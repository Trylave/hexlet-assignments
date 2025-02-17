package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        String attributesString = attributesToString();
        return "<" + getName() + (attributesString.isEmpty() ? "" : " " + attributesString) + ">";
    }
}
// END
