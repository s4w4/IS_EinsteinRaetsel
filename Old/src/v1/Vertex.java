package v1;

import java.util.List;

public class Vertex {

    private List<Integer> valueRange;
    private String name;
    private boolean initial;

    public Vertex(String name, List<Integer> valueRange){
        this.name = name;
        this.valueRange = valueRange;
        this.initial = false;
    }

    public List<Integer> getValueRange() {
        return valueRange;
    }

    public boolean isInitial() {
        return initial;
    }

    public void setInitial(boolean initial) {
        this.initial = initial;
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

    @Override
    public String toString() {
        return "["+name+" => "+valueRange+"]";
    }


}
