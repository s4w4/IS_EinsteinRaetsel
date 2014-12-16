package app;

import constraintSolver.BinaryConstraint;

public class ConstraintEqual implements BinaryConstraint {

    @Override
    public boolean isConsistent(Object v1, Object v2) {
        return (int) v1 == (int) v2;
    }

    public String toString(){
        return "==";
    }
}
