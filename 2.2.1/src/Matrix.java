import java.util.Random;

/** @author Stanislav Rakitov */
public class Matrix {

  private int SIZE;
  private int[][] colors;

  public Matrix(int size) {
    this.SIZE = size;
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

  public void print() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        // %4d означает, что мы под каждый номер резервируем 4 знака
        // (незанятые будут заполнены пробелами)
        // таким образом, у нас получится ровная таблица
        System.out.format("%4d", colors[i][j]);
      }
      // Переход на следующую строку
      System.out.println();
    }
  }

  public Matrix rotate() {
    Matrix matrix = new Matrix(SIZE);
    matrix.colors = new int[SIZE][SIZE];
    for (int j = 0; j < SIZE; j++) {
      for (int i = SIZE - 1; i >= 0; i--) {
        int cell = (SIZE - 1) - i;
        matrix.colors[j][cell] = colors[i][j];
      }
    }
    return matrix;
  }
}
