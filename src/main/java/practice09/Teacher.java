package practice09;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
  private LinkedList<Klass> classes;

  public Teacher(int id, String name, int age) {
    super(id, name, age);
  }

  public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
    super(id, name, age);
    this.classes = linkedList;
  }

  public LinkedList<Klass> getClasses() {
    return classes;
  }

  @Override
  public String introduce() {
    if (classes != null) {
      String classesNum = classes.stream().map(Klass::getNumber).collect(Collectors.toList()).toString();
      return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", classesNum.substring(1, classesNum.length()-1));
    }
    return super.introduce() + " I am a Teacher. I teach No Class.";
  }

  public String introduceWith(Student student) {
    List<Integer> classesNum = classes.stream().map(Klass::getNumber).collect(Collectors.toList());
    if (classes.size() != 0 && classesNum.contains(student.getKlass().getNumber())) {
      return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
    }
    return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
  }

  public boolean isTeaching(Student student) {
    List<Integer> classesNum = classes.stream().map(Klass::getNumber).collect(Collectors.toList());
    return classesNum.contains(student.getKlass().getNumber());
  }
}
