package einsteinApp.constraints;

import entities.BinaryConstraint;

public class ConstraintRightNeighbar implements BinaryConstraint {
    @Override
    public boolean isConsistent(Object linkeNachbar, Object rechteNachbar) {
        int x = (int) linkeNachbar;
        int y = (int) rechteNachbar;
        return y-x == 1;
    }

    public String toString() {
        return " y-x  == 1";
    }
}