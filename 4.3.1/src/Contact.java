/**
 * @author Stanislav Rakitov in 2021
 */
public class Contact {
  private String name;
  private String phoneNumber;

  public Contact(String rawString) {
    proceedRawString(rawString);
  }

  private void proceedRawString(String rawString) {
    int index = rawString.lastIndexOf(" ");
    this.name = rawString.substring(0, index);
    this.phoneNumber =rawString.substring(index + 1);
  }

  @Override
  public String toString() {
    return "Имя: " + name +  ", Телефон: " + phoneNumber;
  }
}
