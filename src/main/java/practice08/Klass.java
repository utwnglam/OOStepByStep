package practice08;

public class Klass {
  private final int number;
  private Student leader = null;

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
    } else System.out.print("It is not one of us.\n");
  }

  public Student getLeader() {
    return leader;
  }

  public void appendMember(Student student) {
    student.setKlass(this);
  }
}
