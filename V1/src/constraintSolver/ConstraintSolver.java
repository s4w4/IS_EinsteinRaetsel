package constraintSolver;

import entities.Arc;
import entities.BinaryConstraint;
import entities.Constraint;
import entities.Definition;
import entities.SelfLoop;
import entities.UnaryConstraint;
import entities.Vertex;

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
                for (UnaryConstraint constraint : selfLoop.getConstraintList()){
                    if(!constraint.isConsistent(x)){
                        deleteList.add(x);
                    }
                }

            }
            d.getDefinitionList().removeAll(deleteList);
        }
    }
    
    
    
    public static boolean revise(Vertex vi, Vertex vj, Arc arc){
        List<Object> deleteList = new ArrayList<>();
    	boolean delete = false; 
    	List<Object> di = vi.getDefinitionRange().getDefinitionList(); 
    	List<Object> dj = vj.getDefinitionRange().getDefinitionList(); 
    	for (Object x : di) {
    		boolean isConsistent = false; 
    		int index = 0; 
    		while(!isConsistent&&index<dj.size()){
    			Object y = dj.get(index); 
	    		if (isConsistent(x, y, arc)){
	    			isConsistent = true; 
	    		}
    			index++;
    		}
    		if (!isConsistent){
    			//delete X from di; 
                deleteList.add(x);
    			delete = true; 
    		}

    	}
        di.removeAll(deleteList);
    	return delete; 
    }



	private static boolean isConsistent(Object x, Object y, Arc arc) {
		boolean isConsistent = true; 
    	//Alle Constraints von vi und vj 
		List<BinaryConstraint> constraintList = arc.getConstraintList(); 
		for ( BinaryConstraint constraint : constraintList ){
			if(!constraint.isConsistent(x, y)){
                isConsistent = false; 
            }
		}
		return isConsistent;
	}


}
