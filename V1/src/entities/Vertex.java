package entities;

import java.util.List;

public class Vertex {

    private int rang;
    private Definition definitionRange;
    private String name;
    private int lastIndex = 0;

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

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    @Override
    public String toString() {
        return "\n\tVertex{" +
                "name='" + name + "\', " +
                "definitionRange=" + definitionRange +
                "rang= "+rang+
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

        if (name != null ? !name.equals(vertex.name) : vertex.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
