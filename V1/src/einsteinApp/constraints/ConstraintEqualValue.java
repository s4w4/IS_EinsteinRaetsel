package einsteinApp.constraints;

import entities.UnaryConstraint;

public class ConstraintEqualValue implements UnaryConstraint {
    private int value;

    public ConstraintEqualValue(int value){
        this.value = value;
    }

    @Override
    public boolean isConsistent(Object obj) {
        return (int) obj == value;
    }

    public String toString() {
        return "=="+value;
    }
}