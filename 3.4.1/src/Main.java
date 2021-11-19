import java.util.Scanner;

/**
 * @author Stanislav Rakitov in 2021
 */
public class Main {
  public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите логин");
    String login = scanner.nextLine();
    System.out.println("Введите пароль");
    String password = scanner.nextLine();

    //Проверить логин и пароль
    User user = getUserByLoginAndPassword(login, password);
    //Вызвать методы валидации пользователя
    validateUser(user);
    // или короче
    // validateUser(getUserByLoginAndPassword(login, password));
    System.out.println("Доступ предоставлен");
  }

 // этот метод должен возвращать список заранее созданных пользователей
  public static User[] getUsers() {
    User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
    User user2 = new User("adam", "me@first.com", "1", 44);
    User user3 = new User("sarah", "beatu4532@yahoo.com", "pinkPussy", 21);
    User user4 = new User("boss", "janitor@irs.gov", "moneyHeist", 46);
    User user5 = new User("rukolla", "weed@example.com", "qwerty", 14);
    return new User[]{user1,user2, user3, user4, user5};
  }


/**
* этом методе нужно найти соответствие пары логина и пароля пользователя из массива,
 * возвращаемого методом getUsers. Если пользователь не найден, выбрасываем исключение
 * UserNotFoundException, если найден - возвращаем найденного пользователя:
* @param login the user login
* @param password the user password
* @return the Founded User
* @throws UserNotFoundException if no user founded or password is incorrect
*/
  public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
    User[] users = getUsers();
    for (User user : users) {
        if (user.getLogin().equalsIgnoreCase(login) && user.checkPassword(password)) {
          return user;
        }
    }
    throw new UserNotFoundException("User not found");
  }

  /**
   * Если возраст менее 18 лет, метод должен выбросить исключение AccessDeniedException:
   * @param user the User to check
   * @throws AccessDeniedException if the User age is less than 18
   */
  public static void validateUser(User user) throws AccessDeniedException {
    if (user.getAge() < 18) {
      throw new AccessDeniedException("User is too young!");
    }
  }
}
