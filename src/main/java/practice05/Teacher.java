package practice05;

public class Teacher extends Person{
  private Integer klass = null;

  public Teacher(String name, int age) {
    super(name, age);
  }

  public Teacher(String name, int age, Integer klass) {
    super(name, age);
    this.klass = klass;
  }

  public int getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    if (klass != null) {
      return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", klass);
    }
    return super.introduce() + " I am a Teacher. I teach No Class.";
  }
}
