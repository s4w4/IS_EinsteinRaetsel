package einsteinApp;

import constraintSolver.ConstraintNet;
import constraintSolver.ConstraintSolver;
import entities.Arc;
import entities.SelfLoop;
import entities.Vertex;
import heuristik.Heuristik;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class ConstraintSatisfactionProblem {

//    private ConstraintSolver constraintSolver;

    public ConstraintSatisfactionProblem(){
//        this.constraintSolver = new ConstraintSolver();
    }
    
    public void findSolution(ConstraintNet constraintNet){
    	//Knotenkonsistenz
        List<SelfLoop> selfLoopList = constraintNet.getSelfLoopList(); 
        ConstraintSolver constraintSolver = new ConstraintSolver(); 
        if (selfLoopList != null){
        	constraintSolver.nc(selfLoopList);        	
        }        
        //Knoten Sortieren
        Map<Integer, Vertex> sortedVertex = Heuristik.DYNAMIC_SEARCH_REARRANGEMENT_HEURISTIK.sort(constraintNet); 
        List<Arc> arcList = constraintNet.getArcList(); 
        //Kantenkonsistenz
        findSolution2_(sortedVertex, arcList, 0); 
    }
    
    private void findSolution2_(Map<Integer, Vertex> sortedVertex, List<Arc> arcList, int cv) {
    	
    	Vertex vertex = sortedVertex.get(cv);
    	
    	List<Arc> arcListTemp = new ArrayList<Arc>(); 
    	arcListTemp.addAll(arcList); 
    	
//    	List<Object> defTemp = new ArrayList<>(); 
//    	defTemp.addAll(vertex.getDefinitionRange().getDefinitionList());
    	
    	ConstraintSolver constraintSolver = new ConstraintSolver();
		boolean isConsistent = constraintSolver.ac3la(vertex, arcList);

		if (isConsistent){
			findSolution2_(sortedVertex, arcList, cv++);
		}else{
			
		}
		
	}

//    public void findSolutionSawa(ConstraintNet constraintNet){
//        List<Vertex> vertexList = constraintNet.getVertexList();
//        List<Arc> arcList = constraintNet.getArcList();
//        
//        Heuristik.NO_HEURISTIK.sort(constraintNet); 
//        
//        int i = 0;
//        while (!isSolution(vertexList) && i < vertexList.size()){
//        	
//            Vertex vertex = vertexList.get(i);
//            List<Object> defTemp = new ArrayList<>();
//            
//            defTemp.addAll(vertex.getDefinitionRange().getDefinitionList());
//            vertex.getDefinitionRange().getDefinitionList().removeAll(defTemp);
//            vertex.getDefinitionRange().getDefinitionList().add(defTemp.get(0));
//
//
//			constraintSolver.ac3la(vertex, arcList);
//
//            i++;
//        }
//
//    }

    private boolean isSolution(List<Vertex> vertexList) {
        boolean solutionFound = true;
        for (Vertex v : vertexList){
            solutionFound &= v.getDefinitionRange().getDefinitionList().size() == 1;
        }
        return solutionFound;
    }

    private boolean isAnyDefinitionEmpty(List<Vertex> vertexList) {
        boolean foundEmpty = false;
        int i = 0;
        while(!foundEmpty && i < vertexList.size()){
            foundEmpty |= vertexList.get(i).getDefinitionRange().getDefinitionList().isEmpty();
        }
        return foundEmpty;
    }

}
