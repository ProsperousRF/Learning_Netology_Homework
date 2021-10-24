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


  }
}
