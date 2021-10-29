import java.util.Random;

/** @author Stanislav Rakitov */
public class Matrix {

  private final int SIZE;
  private final int[][] colors;

  protected Matrix(Matrix matrix) {
    this.SIZE = matrix.SIZE;
    this.colors = new int[SIZE][SIZE];
    rotate(matrix.colors);
  }

  public Matrix(int size) {
    this.SIZE = size;
    this.colors = new int[SIZE][SIZE];
    fill();
  }

  private void fill() {
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

  private void rotate(int[][] originalMatrix) {
    int aSize = SIZE - 1;
    for (int j = 0; j < SIZE; j++) {
      for (int i = aSize; i >= 0; i--) {
        int cell = aSize - i;
        this.colors[j][cell] = originalMatrix[i][j];
      }
    }
  }
}
