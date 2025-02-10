package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String original;
    private String reversed;

    // Конструктор
    public ReversedSequence(String original) {
        this.original = original;
        this.reversed = new StringBuilder(original).reverse().toString();
    }

    // Реализация метода charAt()
    @Override
    public char charAt(int index) {
        return reversed.charAt(index);
    }

    // Реализация метода length()
    @Override
    public int length() {
        return reversed.length();
    }

    // Реализация метода subSequence()
    @Override
    public CharSequence subSequence(int start, int end) {
        return reversed.subSequence(start, end);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return reversed;
    }
}
// END
