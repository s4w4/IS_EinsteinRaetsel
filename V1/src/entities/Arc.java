package entities;

import java.util.ArrayList;
import java.util.List;

public class Arc{

    private List<BinaryConstraint> constraintList;
    private Vertex target;
    private Vertex source;

    public Arc(Vertex source, Vertex target, BinaryConstraint constraint) {
        this.source = source;
        this.target = target;
        this.constraintList = new ArrayList<>();
        this.constraintList.add(constraint);
    }

    public Arc(Vertex source, Vertex target, List<BinaryConstraint> constraintList) {
        this.source = source;
        this.target = target;
        this.constraintList = constraintList;
    }


    public List<BinaryConstraint> getConstraintList() {
        return constraintList;
    }

    public void setConstraintList(List<BinaryConstraint> constraintList) {
        this.constraintList = constraintList;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "\nArc{" +
                "source: " + source +
                ", target: " + target +
                ", constraintList: " + constraintList +
                "}";
    }



}
