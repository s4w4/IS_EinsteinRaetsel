package einsteinApp.constraints;

import entities.BinaryConstraint;

public class ConstraintRightNeighbar implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object obj1, Object obj2) {
        int x = (int) obj1;
        int y = (int) obj2;
        return y-x == 1;
    }

    public String toString() {
        return " y-x  == 1";
    }
}