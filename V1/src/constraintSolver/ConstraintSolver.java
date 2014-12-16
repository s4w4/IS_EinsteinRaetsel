package constraintSolver;

import java.util.ArrayList;
import java.util.List;

public class ConstraintSolver {


    /**
     * Algorithmus NC zur Knotenkonsistenz
     *
     * Es wird nur über die Schlingen iteriert
     * Bei jedem Knoten wird jedes Element aus dem Definitionsbereich
     * auf konsistenz geprüft.
     * wenn Element inkonsistenz ist wird er in eine DeleteList hinzugefügt
     * und am Ende aus dem Definitionsbereichs gelöscht
     *
     * @param selfLoopList
     */
    public static void nc(List<SelfLoop> selfLoopList){
        List<Object> deleteList = new ArrayList<>();

        for (SelfLoop selfLoop: selfLoopList){
            Vertex v = selfLoop.getVertex();
            Definition d = v.getDefinitionRange();
            for (Object x : d.getDefinitionList()){
                if(!selfLoop.getConstraint().isConsistent(x)){
                    deleteList.add(x);
                }
            }
            d.getDefinitionList().removeAll(deleteList);
        }

    }


}
