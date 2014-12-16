package einsteinApp.constraints;

import entities.BinaryConstraint;

public class ConstraintNeighbar implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object obj1, Object obj2) {
        int x = (int) obj1;
        int y = (int) obj2;
        return Math.abs(x-y) == 1;
    }

    public String toString() {
        return "|x-y| == 1";
    }
}
