/**
 * @author Stanislav Rakitov
 */
public class Main {
  public static void main(String[] args) {
    Reader petro = new User("Петр");
    Supplier vasya = new User("Василий");
    Administrator administrator = new LibraryWorker();
    Librarian librarian = new LibraryWorker();

    Book book1 = new Book("Orwell", "1984");
    Book book2 = new Book("Валентина Терешкова", "Новая конституция Российской Федерации");
    Book book3 = new Book("Аркадий самогонов", "Самолечение водкой");

    vasya.supplyBook(book2);
    vasya.supplyBook(book3);
    librarian.orderBook(book1, vasya);
    administrator.findBook(book1);
    petro.takeBook(book3);
    administrator.overdueNotification(petro);


  }
}
