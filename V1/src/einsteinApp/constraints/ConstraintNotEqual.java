package einsteinApp.constraints;


import entities.BinaryConstraint;

public class ConstraintNotEqual implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object obj1, Object obj2) {
        return (int) obj1 != (int) obj2;
    }

    public String toString() {
        return "!=";
    }
}
