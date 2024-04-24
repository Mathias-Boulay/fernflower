package records;

public record TestRecordNonTrivialSecondaryConstructor(int x, int y) {
  public TestRecordNonTrivialSecondaryConstructor(int x) {
    this(x, 0);
  }
}