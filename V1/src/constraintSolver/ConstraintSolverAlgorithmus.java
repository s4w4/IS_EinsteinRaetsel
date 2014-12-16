package constraintSolver;

import java.util.ArrayList;
import java.util.List;

public class ConstraintSolverAlgorithmus {

    public static boolean revise(Vertex vi, Vertex vj, List<Arc> arcList){
        return true;
    }


    public static boolean ac3la(Vertex cv, List<Arc> arcList){
        List<Arc> q = getArcs(cv, arcList);
        boolean consistent = true;
        while (!q.isEmpty() && consistent){
            Arc arcVkVm = selectAndDeleteAnyArc(q);
            Vertex vk = arcVkVm.getSource();
            Vertex vm = arcVkVm.getTarget();
            if (revise(vk,vm,q)){
                addNeighbars(vk,vm,cv,q,arcList);
            }
        }
        return consistent;
    }

    private static void addNeighbars(Vertex vk, Vertex vm, Vertex cv, List<Arc> q, List<Arc> arcList) {
        for (Arc arc : arcList){
            Vertex vi = arc.getSource();
            Vertex target = arc.getTarget();
            if (target.equals(vk) && !vi.equals(vk) && !vi.equals(vm) && vi.getRang() > cv.getRang()){
                /*TODO
                arcList.indexOf();
                if (!q.contains()){
                    arcList.add();
                }*/
            }
        }
    }

    /**
     * wählt einen Arc aus der Liste von Arcs aus
     * löscht diesen aus der Liste und liefert den
     * dann zurück
     *
     * @param q
     * @return
     */
    private static Arc selectAndDeleteAnyArc(List<Arc> q) {
        Arc resultArc = q.get(0);
        q.remove(0);
        return resultArc;
    }

    /**
     * Liefert eine Liste von Arcs zurück,
     * bei den cv als Target ist und
     * die SourceKonten noch nicht initialisiert wurden
     *
     * :: (Vi,Vcv) in arcs(G) , i > cv
     *
     * @param ca
     * @param arcList
     * @return
     */
    private static List<Arc> getArcs(Vertex ca, List<Arc> arcList) {
        List<Arc> resultList = new ArrayList<>();
        for (Arc arc : arcList){
            Vertex vi = arc.getSource();
            Vertex target = arc.getTarget();
            if (target.equals(ca) && vi.getRang() > ca.getRang()){
                resultList.add(arc);
            }
        }
        return resultList;
    }
}
