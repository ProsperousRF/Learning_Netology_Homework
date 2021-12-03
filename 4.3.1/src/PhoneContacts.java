import java.util.HashMap;
import java.util.HashSet;

/** @author Stanislav Rakitov in 2021 */
public class PhoneContacts {
  private final HashMap<String, HashSet<Contact>> map;

  public PhoneContacts() {
    map = new HashMap<>();
  }

  public void addGroup(String groupName) {
    if (!map.containsKey(groupName)) {
      map.put(groupName, new HashSet<>());
    }
  }

  public void addContact(String contactString, String[] groups) {
    Contact contact = new Contact(contactString);

    for (String groupName : groups) {
      if (map.containsKey(groupName)) {
        HashSet<Contact> contacts = map.get(groupName);
        if (!contacts.add(contact)) {
          System.out.println("Дубликат..");
        }
      } else {
        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact);
        map.put(groupName, contacts);
      }
    }
  }

  public void printContent() {
    for (String groupName : map.keySet()) {
      if (!map.get(groupName).isEmpty()) {
        System.out.println("- " + groupName + ":");
        for (Contact contact : map.get(groupName)) {
          System.out.println("\t" + contact);
        }
      }
    }
  }

  // метод получения групп
  public String[] getGroups() {
    return map.keySet().toArray(new String[0]);
  }

  // метод получения контактов по группе
  public Contact[] getContacts(String group) {

    HashSet<Contact> contacts = map.get(group);
    Contact[] contactsArray = new Contact[contacts.size()];

    return contacts.toArray(contactsArray);
  }
}
