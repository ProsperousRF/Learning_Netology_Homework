/**
 * @author Stanislav Rakitov
 */
public interface Administrator {
  void overdueNotification(Reader reader);
  void findBook(Book book);
  Book giveBook(Reader reader, Book book);
}
