package entities;

import java.util.List;

public class Vertex {

    private Definition definitionRange;
    private String name;

    public Vertex(String name, Definition definitionRange){
        this.name = name;
        this.definitionRange = definitionRange;
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
}
