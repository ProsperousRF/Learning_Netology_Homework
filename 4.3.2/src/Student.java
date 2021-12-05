import java.util.Objects;

/** @author Stanislav Rakitov in 2021 */
public class Student {
  private final String name;
  private final String group;
  private final String studentId;

  public Student(String name, String group, String studentId) {
    this.name = name;
    this.group = group;
    this.studentId = studentId;
  }

  @Override
  public String toString() {
    return name + ", " + group + ", " + studentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    return this.hashCode() == o.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentId);
  }
}
