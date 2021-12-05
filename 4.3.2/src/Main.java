import java.util.Scanner;

/**
 * @author Stanislav Rakitov in 2021
 */
public class Main {
  public static void main(String[] args) {
    Students studentsDB = new Students();
    System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
    try(Scanner in = new Scanner(System.in)){
      while (true) {
        String line = in.nextLine();

        // empty line is also breaks the loop
        if ("end".equalsIgnoreCase(line) || "".equals(line)) {
          break;
        }

        studentsDB.addStudent(line);
        System.out.println(
            "Введите информацию о студенте (для завершения работы программы введите \"end\")");
      }
      studentsDB.printStudents();
    }
  }
}
