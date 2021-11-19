/**
 * @author staso on 11/19/2021
 */
public class User {
  private String login;
  private String password;
  private String email;
  private int age;

  public User(String login, String email, String pass, int age) {
    this.login = login;
    this.email = email;
    this.password = pass;
    this.age = age;
  }

  public boolean checkPassword(String password) {
    return this.password.equals(password);
  }

  public String getLogin() {
    return login;
  }

  public int getAge() {
    return age;
  }
}
