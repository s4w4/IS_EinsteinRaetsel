package entities;

public interface BinaryConstraint extends Constraint {

    public boolean isConsistent(Object obj1, Object obj2);
}
