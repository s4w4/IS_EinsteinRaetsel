package v1;

public class ConstraintNetz {

    private static final Map<String, Vertex> vertexHashMap = new HashMap<>();
    private static final List<Integer> valueRange = new ArrayList<>();
    private static final Map<String, Arc> constraintMap = new HashMap();


    public static void addVertex(String name){
        vertexHashMap.put(name, new Vertex(name, new ArrayList<>(valueRange)));
    }

    public static void addVertex(String name, List<Integer> values){
        vertexHashMap.put(name, new Vertex(name, new ArrayList<>(values)));
    }

    public static void initValueRange(List<Integer> values){
        valueRange.addAll(values);
    }

    public static Map<String, Vertex> getVertexHashMap() {
        return vertexHashMap;
    }

    public static Map<String, Arc> getConstraintMap() {
        return constraintMap;
    }

    public static void addConstraint(String v1, String v2, Constraint constraint) throws NullPointerException{
        if (vertexHashMap.get(v1) == null || vertexHashMap.get(v2) == null) throw new NullPointerException();

        String key = vertexHashMap.get(v1).getName()+"_"+vertexHashMap.get(v2).getName();
        constraintMap.put(key, new Arc(vertexHashMap.get(v1),vertexHashMap.get(v2), constraint));
    }

    public static Constraint getConstraint(Vertex vi, Vertex vj ) {

          String key = vi.getName()+"_"+vj.getName();
         return constraintMap.get(key).getConstraint();
    }

    public static List<Arc> getAllArcsFromTarget(Vertex cv) {
        List<Arc> resultList = new ArrayList<>();

        Set<String > keysConstraint = constraintMap.keySet();
        for (String key : keysConstraint){
            Vertex target = constraintMap.get(key).getTarget();
            if (target.getName().equals(cv.getName())){
                resultList.add(constraintMap.get(key));
            }
        }
        return resultList;
    }

    public static List<Arc> getAllArcsFromTarget(Vertex v, List<Arc> arcList) {
        List<Arc> resultList = new ArrayList<>();
        for (Arc arc: arcList){
            Vertex source = arc.getSource();
            Vertex target = arc.getTarget();
            Vertex[] key = {source, target};
            if (target.getName().equals(v.getName()) && !source.isInitial()){
                resultList.add(constraintMap.get(key));
            }
        }
        return resultList;
    }

    public static void ausgabe() {
        Set<String> keys = vertexHashMap.keySet();
        System.out.println("---------------------------------------------");
        for (String key : keys){
            System.out.println(vertexHashMap.get(key).getName()+"                       >  "+vertexHashMap.get(key).getValueRange());
        }
    }

    public static void updateArcs(List<Arc> arcList) {
        for (Arc arc : arcList){
            Vertex source = arc.getSource();
            Vertex target = arc.getTarget();
            String key = source.getName()+"_"+target.getName();
            constraintMap.get(key).setSource(source);
            constraintMap.get(key).setTarget(target);
        }
    }
}
