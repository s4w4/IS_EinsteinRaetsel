package einsteinApp.constraints;

import entities.BinaryConstraint;

public class ConstraintLeftNeighbar implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object rechteNachbar, Object linkeNachbar) {
        int x = (int) rechteNachbar;
        int y = (int) linkeNachbar;
        return  x-y  == 1;
    }

    public String toString() {
        return " x-y  == 1";
    }
}
