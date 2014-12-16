package entities;

import java.util.ArrayList;
import java.util.List;

public class Arc {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arc arc = (Arc) o;

        if (constraintList != null ? !constraintList.equals(arc.constraintList) : arc.constraintList != null)
            return false;
        if (source != null ? !source.equals(arc.source) : arc.source != null) return false;
        if (target != null ? !target.equals(arc.target) : arc.target != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constraintList != null ? constraintList.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }
}
