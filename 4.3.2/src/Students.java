import java.util.HashSet;
import java.util.Set;

/**
 * @author Stanislav Rakitov in 2021
 */
public class Students {
  private final Set<Student> students;

  public Students() {
    this.students = new HashSet<>();
  }

  public void addStudent(String rawString){
    if (rawString.isBlank()) {
      throw new IllegalArgumentException("Ошибка! Некорректно введены данные.");
    }

    String[] split = rawString.split(",");
    Student student = new Student(split[0], split[1], split[2]);
    if (!students.add(student)) {
      System.out.println("Студент с таким номером студенческого билета уже существует.");
    }
  }


  public void printStudents() {
    System.out.println("Список студентов:");
    if (students.isEmpty()) {
      System.out.println("Список пуст");
      return;
    }
    for (Student student : students) {
      System.out.println("  - " + student);
    }
  }
}
