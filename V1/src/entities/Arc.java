package entities;

public class Arc {

    private BinaryConstraint constraint;
    private Vertex target;
    private Vertex source;

    public Arc(Vertex source, Vertex target, BinaryConstraint constraint) {
        this.source = source;
        this.target = target;
        this.constraint = constraint;
    }

    public BinaryConstraint getConstraint() {
        return constraint;
    }

    public void setConstraint(BinaryConstraint constraint) {
        this.constraint = constraint;
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
                ", constraint: " + constraint +
                "}";
    }
}
