/**
 * @author Stanislav Rakitov
 */
public class User implements Supplier, Reader{

  private String name;
  private Book book;

  public User(String name) {
    this.name = name;
  }

  @Override
  public void takeBook(Book book) {
    System.out.printf("Читатель %s взял книгу \"%s\"%n", name, book.getTitle());
  }

  @Override
  public void returnBook(Book book) {
    System.out.printf("Читатель %s вернул книгу \"%s\"%n", name, book.getTitle());
  }

  @Override
  public void supplyBook(Book book) {
    System.out.printf("Поставщик %s поставил книгу \"%s\"%n", name, book.getTitle());
  }

  @Override
  public String getName() {
    return this.name;
  }
}
