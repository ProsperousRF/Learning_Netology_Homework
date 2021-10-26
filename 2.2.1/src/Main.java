import java.util.Random;

public class Main {

  private final int SIZE = 8;
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

  public void rotateMatrix(int[][] matrix) {

    int N = matrix.length - 1;
    int temp;

    for (int i=0; i < N; i++) {
      for (int j=0; j+i < N; j++) {
        temp = matrix[i][N-j];
        matrix[i][N-j] = matrix[i+j][i];
        matrix[i+j][i] = matrix[N][i+j];
        matrix[N][i+j] = matrix[N-j][N];
        matrix[N-j][N] = temp;
      }
      N--;
    }
  }

  public static void main(String[] args) {

    Main main = new Main();
    main.printMatrix(main.colors);
    main.rotateMatrix(main.colors);
    System.out.println("---");
    main.printMatrix(main.colors);
  }
}
