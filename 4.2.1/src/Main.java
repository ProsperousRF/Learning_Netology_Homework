import java.util.Scanner;

/** @author Stanislav Rakitov in 2021 */
public class Main {
  public static void main(String[] args) {
    Elevator elevator = new Elevator();

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
        String line = scanner.nextLine();
        try {
          int floor = Integer.parseInt(line);

          if (floor < 0 || floor > 25) {
            System.out.println("Такого этажа нет в доме");
          } else {
            elevator.addFloor(floor);
            if (floor == 0) {
              break;
            }
          }

        } catch (NumberFormatException e) {
          System.out.println("Нужно было вводить цифру.");
        }
      }
    }
    // Вывод информации о посещенных этажах в порядке добавления в формате: "этаж 1 -> этаж 22 ->
    // этаж 0".
    elevator.printRoute();
  }
}
