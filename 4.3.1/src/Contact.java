import java.util.Objects;

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
    try {
      int index = rawString.lastIndexOf(" ");
      this.name = rawString.substring(0, index);
      this.phoneNumber =rawString.substring(index + 1);

    } catch (StringIndexOutOfBoundsException exception) {
      System.out.println("Ошибка при добавлении контакта. Не указанно имя или телефон");
    }
  }

  @Override
  public String toString() {
    return "Имя: " + name +  ", Телефон: " + phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contact)) return false;
    Contact contact = (Contact) o;
    return name.equals(contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber);
  }
}
