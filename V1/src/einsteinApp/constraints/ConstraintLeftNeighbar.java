package einsteinApp.constraints;

import constraintSolver.BinaryConstraint;

public class ConstraintLeftNeighbar implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object obj1, Object obj2) {
        int x = (int) obj1;
        int y = (int) obj2;
        return  x-y  == 1;
    }

    public String toString() {
        return " x-y  == 1";
    }
}
