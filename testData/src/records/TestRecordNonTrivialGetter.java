package records;

public record TestRecordNonTrivialGetter(int x, int y) {
  public int x() {
    return x * 2;
  }
}