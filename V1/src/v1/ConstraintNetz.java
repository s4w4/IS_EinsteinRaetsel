package v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstraintNetz {

    private static final Map<String, Vertex> vertexHashMap = new HashMap<>();
    private static final List<Integer> valueRange = new ArrayList<>();
    private static final List<Arc> constraintList = new ArrayList<>();


    public static void addVertex(String name){
        vertexHashMap.put(name, new Vertex(name, new ArrayList<>(valueRange)));
    }

    public static void addVertex(String name, List<Integer> values){
        vertexHashMap.put(name, new Vertex(name, new ArrayList<>(values)));
    }

    public static void initValueRange(List<Integer> values){
        valueRange.addAll(values);
    }

    public Map<String, Vertex> getVertexHashMap() {
        return vertexHashMap;
    }

    public static List<Arc> getConstraintList() {
        return constraintList;
    }

    public static void addConstraint(String v1, String v2, Constraint constraint) throws NullPointerException{
        if (vertexHashMap.get(v1) == null || vertexHashMap.get(v2) == null) throw new NullPointerException();

        constraintList.add(new Arc(vertexHashMap.get(v1),vertexHashMap.get(v2), constraint));
    }
}
