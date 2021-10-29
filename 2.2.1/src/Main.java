/** @author Stanislav Rakitov */
public class Main {

  public static void main(String[] args) {

    int SIZE = 8;

    Matrix colors = new Matrix(SIZE);
    colors.print();

    System.out.println("---");

    Matrix rotatedColors = new Matrix(colors);
    rotatedColors.print();
  }
}
