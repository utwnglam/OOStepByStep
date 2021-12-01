package practice06;

public class Klass {
  private int number;

  public Klass(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public String getDisplayName() {
    return String.format("Class %d", number);
  }
}
