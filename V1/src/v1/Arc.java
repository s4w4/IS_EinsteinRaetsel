package v1;

public class Arc {
    private Constraint constraint;
    private Vertex target;
    private Vertex source;

    public Arc(Vertex source, Vertex target, Constraint constraint){
        this.source = source;
        this.target = target;
        this.constraint = constraint;
    }

    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
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
        return "Arc{" +
                "constraint=" + constraint +
                ", target=" + target.getName() +
                ", source=" + source.getName() +
                '}';
    }
}
