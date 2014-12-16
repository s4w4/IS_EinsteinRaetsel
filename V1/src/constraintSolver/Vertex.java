package constraintSolver;

import java.util.List;

public class Vertex {

    private int rang;
    private Definition definitionRange;
    private String name;

    public Vertex(String name, Definition definitionRange){
        this.name = name;
        this.definitionRange = definitionRange;
        this.rang = 0;
    }

    public Definition getDefinitionRange() {
        return definitionRange;
    }

    public void setDefinitionRange(Definition definitionRange) {
        this.definitionRange = definitionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + "\', " +
                "definitionRange=" + definitionRange +
                '}';
    }

    public void removeValue(Object x) {
        List<Object> dl = this.definitionRange.getDefinitionList();
        int index = dl.indexOf(x);
        this.definitionRange.getDefinitionList().remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        if (definitionRange != null ? !definitionRange.equals(vertex.definitionRange) : vertex.definitionRange != null)
            return false;
        if (name != null ? !name.equals(vertex.name) : vertex.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = definitionRange != null ? definitionRange.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}
