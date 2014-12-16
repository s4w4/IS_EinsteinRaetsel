package constraintSolver;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class ConstraintSolverAlgorithmus {

    /**
     * Algorithmus NC zur Knotenkonsistenz
     * <p/>
     * Es wird nur über die Schlingen iteriert
     * Bei jedem Knoten wird jedes Element aus dem Definitionsbereich
     * auf konsistenz geprüft.
     * wenn Element inkonsistenz ist wird er in eine DeleteList hinzugefügt
     * und am Ende aus dem Definitionsbereichs gelöscht
     *
     * @param selfLoopList
     */
    public static void nc(List<SelfLoop> selfLoopList) {
        List<Object> deleteList = new ArrayList<>();

        for (SelfLoop selfLoop : selfLoopList) {
            Vertex v = selfLoop.getVertex();
            Definition d = v.getDefinitionRange();
            for (Object x : d.getDefinitionList()) {
                for (UnaryConstraint constraint : selfLoop.getConstraintList()) {
                    if (!constraint.isConsistent(x)) {
                        deleteList.add(x);
                    }
                }
            }
            d.getDefinitionList().removeAll(deleteList);
        }

    }

    public static boolean revise(Vertex vi, Vertex vj, Arc arc) {
        return true;
    }


    public static boolean ac3la(Vertex cv, List<Arc> arcList) {
        List<Arc> q = getArcs(cv, arcList);
        boolean consistent = true;
        while (!q.isEmpty() && consistent) {
            Arc arcVkVm = selectAndDeleteAnyArc(q);
            Vertex vk = arcVkVm.getSource();
            Vertex vm = arcVkVm.getTarget();
            if (revise(vk, vm, arcVkVm)) {
                unionQ(vk, vm, cv, q, arcList);
                consistent = vk.getDefinitionRange().getDefinitionList().isEmpty();
            }
        }
        return consistent;
    }

    /**
     * Fügt in die ArcListe Q die Nachbarn von vk ein
     * wenn Arc schon vorhanden wird nicht erneut eingefügt!
     *
     * Q <- Q union {(vi,vk) such that (vi,vk) in arcs(G),
     *                i#k, i#m, i > cv}
     *
     * @param vk
     * @param vm
     * @param cv
     * @param q
     * @param arcList
     * @return
     */
    private static List<Arc> unionQ(Vertex vk, Vertex vm, Vertex cv, List<Arc> q, List<Arc> arcList) {
        for (Arc arc : arcList) {
            Vertex vi = arc.getSource();
            Vertex vTarget = arc.getSource();
            if (vTarget.equals(vk) &&
                    !vi.equals(vk) &&
                    !vi.equals(vm) &&
                    vi.getRang() > cv.getRang()) {
                Arc arcViVk = getArc(vi, vk, arcList);
                if (!q.contains(arcViVk)) {
                    q.add(arcViVk);
                }
            }
        }
        return q;
    }

    /**
     * Liefert ein Arc aus der ArcListe
     * für den die beiden Vertex passen
     *
     * @param v1    Source
     * @param v2    Target
     * @param arcList
     * @return
     */
    private static Arc getArc(Vertex v1, Vertex v2, List<Arc> arcList) {
        Arc arc = null;
        boolean found = false;
        int i = 0;
        while (!found && i < arcList.size()) {
            Arc tempArc = arcList.get(i);
            found = tempArc.getSource().equals(v1) &&
                    tempArc.getTarget().equals(v2);
            i++;
            if (found) arc = tempArc;
        }
        return arc;
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
     * <p/>
     * :: (Vi,Vcv) in arcs(G) , i > cv
     *
     * @param ca
     * @param arcList
     * @return
     */
    private static List<Arc> getArcs(Vertex ca, List<Arc> arcList) {
        List<Arc> resultList = new ArrayList<>();
        for (Arc arc : arcList) {
            Vertex vi = arc.getSource();
            Vertex target = arc.getTarget();
            if (target.equals(ca) && vi.getRang() > ca.getRang()) {
                resultList.add(arc);
            }
        }
        return resultList;
    }
}
