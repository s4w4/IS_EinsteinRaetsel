import java.util.List;

public class Vertex {

    private String name;
    private List<Integer> definitionRange;
    private int value;

    public Vertex(String name, List<Integer> defintionRange){
        this.name = name;
        this.definitionRange = defintionRange;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getDefinitionRange() {
        return definitionRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefinitionRange(List<Integer> definitionRange) {
        this.definitionRange = definitionRange;
    }
}
