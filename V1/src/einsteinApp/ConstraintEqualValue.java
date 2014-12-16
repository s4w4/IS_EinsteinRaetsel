package einsteinApp;

import java.util.List;

import entities.UnaryConstraint;

public class ConstraintEqualValue implements UnaryConstraint {

    private int value;
    private int index;

    public ConstraintEqualValue(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public boolean isConsistent(Object obj) {
        return ((List<Integer>) obj).get(index) == value;
    }
    
    public String toString(){
        return "pi("+index+") == "+value;
    }
    
}
