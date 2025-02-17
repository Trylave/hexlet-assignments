package exercise;

public class NegativeRadiusException extends Exception {
    public NegativeRadiusException() {
        super("Радиус не может быть отрицательным");
    }
}