package einsteinApp;

import java.util.List;

import entities.BinaryConstraint;

public class ConstraintEqual implements BinaryConstraint{

    private int indexTarget;
    private int indexSource;

    public ConstraintEqual(int indexSource, int indexTarget){
        this.indexSource = indexSource;
        this.indexTarget = indexTarget;
    }

    @Override
    public boolean isConsistent(Object obj1, Object obj2) {
        int sourcePos = ((List<Integer>) obj1).get(indexSource);
        int targetPos = ((List<Integer>) obj2).get(indexTarget);
        return sourcePos == targetPos;
    }

    public String toString(){
        return "pi("+indexSource+") == pi("+indexTarget+")";
    }
}
