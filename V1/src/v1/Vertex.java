package v1;

import java.util.List;

public class Vertex {

    private List<Integer> valueRange;
    private String name;

    public Vertex(String name, List<Integer> valueRange){
        this.name = name;
        this.valueRange = valueRange;
    }

    public List<Integer> getValueRange() {
        return valueRange;
    }

    public void setValueRange(List<Integer> valueRange) {
        this.valueRange = valueRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
