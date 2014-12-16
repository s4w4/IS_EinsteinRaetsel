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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Definition that = (Definition) o;

        if (definitionList != null ? !definitionList.equals(that.definitionList) : that.definitionList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return definitionList != null ? definitionList.hashCode() : 0;
    }
}
