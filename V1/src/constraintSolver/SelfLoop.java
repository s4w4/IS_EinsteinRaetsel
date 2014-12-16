package constraintSolver;

public class SelfLoop {

    private UnaryConstraint constraint;
    private Vertex vertex;

    public SelfLoop(Vertex vertex, UnaryConstraint constraint) {
        this.vertex = vertex;
        this.constraint = constraint;
    }

    public UnaryConstraint getConstraint() {
        return constraint;
    }

    public void setConstraint(UnaryConstraint constraint) {
        this.constraint = constraint;
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
                ", constraint: " + constraint +
                "}";
    }
}
