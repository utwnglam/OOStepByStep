package practice10;

public class Klass {
  private final int number;
  private Student leader = null;
  private Teacher teacher = null;

  public Klass(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public String getDisplayName() {
    return String.format("Class %d", number);
  }

  public void assignLeader(Student student) {
    if (student.getKlass().getNumber() == number) {
      this.leader = student;
      if (teacher != null) {
        System.out.printf("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number);
      }
    } else System.out.print("It is not one of us.\n");
  }

  public Student getLeader() {
    return leader;
  }

  public boolean isIn(Student student) {
    return student.getKlass().getNumber() == this.number;
  }

  public void appendMember(Student student) {
    student.setKlass(this);
    if (teacher != null) {
      System.out.printf("I am %s. I know %s has joined Class %d.\n", teacher.getName(), student.getName(), number);
    }
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
}
