import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] products = {"Хлеб", "Яблоки", "Молоко"};
    int[] prices = {100, 200, 300};
    System.out.println("Список возможных товаров для покупки");
    for (int i = 0; i < products.length; i++) {
      System.out.printf("%d. %s %d руб/шт%n", i + 1, products[i], prices[i]);
    }
    int productNumber;
    int productCount;
    int[] cart = new int[products.length];
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Выберите товар и количество или введите `end`");
      String line = scanner.nextLine();
      if (line.equals("end") || line.equals("")) {
        break;
      }
      String[] split = line.split(" ");
      productNumber = Integer.parseInt(split[0]) - 1;
      productCount = Integer.parseInt(split[1]);
      cart[productNumber] += productCount;
    }

    System.out.println("Ваша корзина:");
    System.out.println("Наименование товара  Количество  Цена/за.ед  Общая стоимость");

    int totalPrice = 0;

    for (int i = 0; i < products.length; i++) {

      if (cart[i] != 0) {
        int current = prices[i] * cart[i];
        System.out.printf("%-20s %-11d %-11d %d %n", products[i], cart[i], prices[i], current);
        totalPrice += current;
      }
    }
    System.out.printf("%38s %9d", "Итого", totalPrice);
  }
}
