import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        ReadFile book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}