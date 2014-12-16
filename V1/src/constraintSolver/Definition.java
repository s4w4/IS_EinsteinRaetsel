package constraintSolver;

import java.util.ArrayList;
import java.util.List;

public class Definition {

    private List<Object> definitionList;

    public Definition(){
        this.definitionList = new ArrayList<>();
    }

    public Definition(List<Object> definitionList ){ this.definitionList = new ArrayList<>();}

    public void addValue(Object value) {
        definitionList.add(value);
    }

    public Object get(int index){
        return definitionList.get(index);
    }

    public List<Object> getDefinitionList() {
        return definitionList;
    }

    @Override
    public String toString() {
        return definitionList.toString();
    }
}
