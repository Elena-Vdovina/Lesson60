import java.util.ArrayList;
import java.util.List;

public class Homework {

// Используйте класс Book (книга) из домашнего задания к уроку 45 (см. Book.java).
// Создайте список книг и отсортируйте книги по названию, (при одинаковых названиях - по автору)
// при помощи лямбда-функции.
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Author1", "Title1", 75));
    books.add(new Book("Author5", "Title2", 56));
    books.add(new Book("Author2", "Title1", 34));
    books.add(new Book("Author4", "Title2", 26));
    books.add(new Book("Author3", "Title3", 24));
    System.out.println(books);

    books.sort((Book o1, Book o2) -> {
      if (!o1.getTitle().equals(o2.getTitle())) {
        return o1.getTitle().compareTo(o2.getTitle());
      } return o1.getAuthor().compareTo(o2.getAuthor());
    });

    System.out.println(books);
  }
}
