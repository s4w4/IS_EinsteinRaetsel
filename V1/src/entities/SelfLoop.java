package entities;

import java.util.ArrayList;
import java.util.List;

public class SelfLoop {

    private List<UnaryConstraint> constraintList;
    private Vertex vertex;

    public SelfLoop(Vertex vertex, UnaryConstraint constraint) {
        this.vertex = vertex;
        this.constraintList = new ArrayList<>();
        this.constraintList.add(constraint);
    }

    public SelfLoop(Vertex vertex, List<UnaryConstraint> constraintList) {
        this.vertex = vertex;
        this.constraintList = constraintList;
    }
    public List<UnaryConstraint> getConstraintList() {
        return constraintList;
    }

    public void setConstraintList(List<UnaryConstraint> constraintList) {
        this.constraintList = constraintList;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }


    @Override
    public String toString() {
        return "\nSelfLoop{" +
                "vertex: " + vertex +
                ", constraintList: " + constraintList +
                "}";
    }
}
