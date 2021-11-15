/**
 * @author Stanislav Rakitov
 */
public interface Reader extends Person{
  void takeBook(Book book);
  void returnBook(Book book);
}
