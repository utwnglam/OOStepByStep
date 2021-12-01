package practice10;

public class Person {
  private String name;
  private int age;
  private int id;

  public Person(int id, String name, int age) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String introduce() {
    return String.format("My name is %s. I am %d years old.", name, age);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }

    final Person other = (Person) obj;
    if (other.name == null || !this.name.equals(other.name)) {
      return false;
    }
    if (this.age != other.age) {
      return false;
    }
    return this.id == other.id;
  }
}
