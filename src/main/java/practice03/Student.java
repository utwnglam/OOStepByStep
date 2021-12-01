package practice03;

import practice02.Person;

public class Student extends Person {
  private final int klass;

  public Student(String name, int age, int klass) {
    super(name, age);
    this.klass = klass;
  }

  public int getKlass() {
    return klass;
  }

  @Override
  public String introduce() {
    return String.format("I am a Student. I am at Class %d.", klass);
  }
}
