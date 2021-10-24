import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int SIZE = 8;
    int[][] colors = new int[SIZE][SIZE];

    Random random = new Random();
    for (int i = 0; i< SIZE; i++) {
      for (int j = 0; j< SIZE; j++) {
        // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
        colors[i][j] = random.nextInt(256);
      }
    }

    for (int i = 0; i< SIZE; i++) {
      for (int j = 0; j< SIZE; j++) {
        // %4d означает, что мы под каждый номер резервируем 4 знака
        // (незанятые будут заполнены пробелами)
        // таким образом, у нас получится ровная таблица
        System.out.format("%4d", colors[i][j]);
      }
      // Переход на следующую строку
      System.out.println();
    }


  }
}
