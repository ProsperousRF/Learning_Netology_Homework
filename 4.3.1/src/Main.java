import java.util.Scanner;

/** @author Stanislav Rakitov in 2021 */
public class Main {
  public static void main(String[] args) {

    PhoneContacts phoneContacts = new PhoneContacts();

    try (Scanner scanner = new Scanner(System.in)) {
      String line;
      System.out.println("Программа справочник");

      // Here we ask for groups
      System.out.println("Введите название группы контактов:");
      while (true) {
        line = scanner.nextLine();
        if ("нет".equalsIgnoreCase(line) || "".equals(line)) {
          break;
        } else {
          // add contacts group
          phoneContacts.addGroup(line);
          System.out.println("Создать еще одну группу (введите название или введите нет)?");
        }
      }

      // and here is the contacts
      while (true) {
        System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
        String contact = scanner.nextLine();
        if ("нет".equalsIgnoreCase(contact) || "".equals(contact)) {
          break;
        } else {
          System.out.println("Укажите группы контакта через пробел");
          String groupsLine = scanner.nextLine();
          if (groupsLine == null) {
            System.out.println("Без указания группы контакт не добавляется.");
            continue;
          }
          String[] groups = groupsLine.split(" ");
          phoneContacts.addContact(contact, groups);
        }
      }
    }
    System.out.println("Группы в справочнике:");
    phoneContacts.printContent();

    System.out.println("---\nА теперь дискотека с геттерами\n---");
    System.out.println("Список групп и контактов в ней");
    for (String groupName : phoneContacts.getGroups()) {
      System.out.println("Группа " + groupName);
      for (Contact contact : phoneContacts.getContacts(groupName) ) {
        System.out.println("\t" + contact);
      }
    }
  }
}
