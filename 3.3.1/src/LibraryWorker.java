/** @author Stanislav Rakitov */
public class LibraryWorker implements Librarian, Administrator {
  @Override
  public void overdueNotification(Reader reader) {
    System.out.printf("Читатель %s просрочил возврат книги %n", reader.getName());
  }

  @Override
  public void findBook(Book book) {
    System.out.printf("Администратор нашел книгу \"%s\"%n", book.getTitle());
  }

  @Override
  public void giveBook(Reader reader, Book book) {
    System.out.printf(
        "Администратор выдал книгу \"%s\" читателю %s%n", book.getTitle(), reader.getName());
  }

  @Override
  public void orderBook(Book book, Supplier supplier) {
    System.out.printf(
        "Администратор заказал книгу %s у поставщика %s%n", book.getTitle(), supplier.getName());
  }
}
