import java.util.Scanner;

/** @author Stanislav Rakitov */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player = new Player();
    // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
    System.out.format(
        "У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n",
        player.getSlotsCount());
    int slot;

    while (true) {
      slot = scanner.nextInt();
      if (slot == -1) {
        break;
      } else {
        player.shotWithWeapon(slot - 1);
      }

    }
    scanner.close();

    System.out.println("Game over!");
  }
}
