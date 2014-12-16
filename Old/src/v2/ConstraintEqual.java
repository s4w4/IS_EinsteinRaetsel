package v2;

public class ConstraintEqual extends  Constraint {
    @Override
    public boolean isConsistent(int x, int y) { return x == y; }
}
