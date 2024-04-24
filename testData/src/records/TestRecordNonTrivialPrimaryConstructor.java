package records;

public record TestRecordNonTrivialPrimaryConstructor(int x, int y) {
  public TestRecordNonTrivialPrimaryConstructor {
    if (x < 0) throw new IllegalArgumentException("x must be non-negative");
    if (y < 0) throw new IllegalArgumentException("y must be non-negative");
  }
}