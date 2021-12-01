package practice09;

public class Student extends Person {
  private Klass klass;

  public Student(int id, String name, int age, Klass klass) {
    super(id, name, age);
    this.klass = klass;
  }

  public void setKlass(Klass newClass) {
    klass = newClass;
  }

  public Klass getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    if (klass.getLeader() != null && klass.getLeader().getName().equals(this.getName())) {
      return super.introduce() + String.format(" I am a Student. I am Leader of Class %d.", klass.getNumber());
    }
    return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass.getNumber());
  }
}
