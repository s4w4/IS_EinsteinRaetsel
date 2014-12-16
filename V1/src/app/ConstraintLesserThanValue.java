package app;

import entities.UnaryConstraint;

public class ConstraintLesserThanValue implements UnaryConstraint {

    int value;

    public ConstraintLesserThanValue(int value){
        this.value = value;
    }

    @Override
    public boolean isConsistent(Object obj) {
        return (int) obj < value;
    }

    @Override
    public String toString() {
        return "<"+value;
    }
}
