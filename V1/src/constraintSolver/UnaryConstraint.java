package constraintSolver;

public interface UnaryConstraint extends Constraint {
    public boolean isConsistent(Object obj);
}
