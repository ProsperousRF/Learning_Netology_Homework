import java.util.ArrayList;
import java.util.HashMap;

/** @author Stanislav Rakitov in 2021 */
public class PhoneContacts {
  private final HashMap<String, ArrayList<Contact>> map;

  public PhoneContacts() {
    map = new HashMap<>();
  }

  public void addGroup(String groupName) {
    if (!map.containsKey(groupName)) {
      map.put(groupName, new ArrayList<>());
    }
  }

  public void addContact(String contactString, String[] groups) {
    Contact contact = new Contact(contactString);

    for (String groupName : groups) {
      if (map.containsKey(groupName)) {
        ArrayList<Contact> contacts = map.get(groupName);
        contacts.add(contact);
      } else {
        ArrayList<Contact> contacts = new ArrayList<>();
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
}
