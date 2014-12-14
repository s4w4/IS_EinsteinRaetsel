
public class Arcs {

    private Vertex source;
    private Vertex target;

    public Arcs(Vertex source, Vertex target){
        this.source = source;
        this.target = target;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }
}
