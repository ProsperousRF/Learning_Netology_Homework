import java.util.Random;

public class Main {

  private final int SIZE = 2;
  private int[][] colors;

  public Main() {
    this.colors = new int[SIZE][SIZE];
    matrixFill();
  }

  private void matrixFill() {
    Random random = new Random();
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
        colors[i][j] = random.nextInt(256);
      }
    }
  }

  public void printMatrix(int[][] matrix) {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        // %4d означает, что мы под каждый номер резервируем 4 знака
        // (незанятые будут заполнены пробелами)
        // таким образом, у нас получится ровная таблица
        System.out.format("%4d", matrix[i][j]);
      }
      // Переход на следующую строку
      System.out.println();
    }
  }

  public int[][] rotateMatrix(int[][] matrix) {
    // TODO: Matrix rotation
    return new int[SIZE][SIZE];
  }

  public static void main(String[] args) {

    Main main = new Main();
    main.printMatrix(main.colors);
    int[][] rotatedColors = main.rotateMatrix(main.colors);
    main.printMatrix(rotatedColors);
  }
}
