package einsteinApp;

import constraintSolver.ConstraintNet;
import constraintSolver.ConstraintSolver;
import entities.Arc;
import entities.Definition;
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
    
    public List<Arc> findSolution(ConstraintNet constraintNet){
    	//Knotenkonsistenz
        List<SelfLoop> selfLoopList = constraintNet.getSelfLoopList(); 
        ConstraintSolver constraintSolver = new ConstraintSolver(); 
        if (selfLoopList != null){
        	constraintSolver.nc(selfLoopList);        	
        }

        //Knoten Sortieren
        Map<Integer, Vertex> sortedVertex = Heuristik.DYNAMIC_SEARCH_REARRANGEMENT_HEURISTIK.sort(constraintNet.getVertexList());
        List<Arc> arcList = constraintNet.getArcList();
        //Kantenkonsistenz
        return findSolution2_(sortedVertex, arcList, 1, 0);
    }
    
    private List<Arc> findSolution2_(Map<Integer, Vertex> sortedVertex, List<Arc> arcList, int cv, int indexDef) {
        if (sortedVertex.size() < cv)
            return arcList;
        if (cv == 10) {
            boolean t = true;
        }

        Vertex vertex = sortedVertex.get(cv);
        if (vertex.getDefinitionRange().getDefinitionList().size() <= indexDef) {
            System.out.println("cv: "+cv+", vertex: "+vertex);
            return null;
        }

        List<Object> defTemp = new ArrayList<>();
        defTemp.addAll(vertex.getDefinitionRange().getDefinitionList());
        vertex.getDefinitionRange().getDefinitionList().removeAll(defTemp);
        vertex.getDefinitionRange().getDefinitionList().add(defTemp.get(indexDef));
        List<Arc> arcListTemp = getCopyArcs(arcList);

    	ConstraintSolver constraintSolver = new ConstraintSolver();
        boolean isConsistent = constraintSolver.ac3la(cv, arcListTemp);

		if (isConsistent){
            getCopyVertex(sortedVertex, arcListTemp);
            return findSolution2_(sortedVertex, arcListTemp, ++cv, 0);
		}else{
            vertex.getDefinitionRange().getDefinitionList().remove(0);
            vertex.getDefinitionRange().getDefinitionList().addAll(defTemp);

            return findSolution2_(sortedVertex, arcList, cv, ++indexDef);
		}

	}

    private void getCopyVertex(Map<Integer, Vertex> vertexMap, List<Arc> arcList) {
        for (Arc arc : arcList) {
            int sourceRang = arc.getSource().getRang();
            int targetRang = arc.getTarget().getRang();

            vertexMap.put(sourceRang, arc.getSource());
            vertexMap.put(targetRang, arc.getTarget());
        }
    }

    private List<Arc> getCopyArcs(List<Arc> arcList) {
        List<Arc> copyArcList = new ArrayList<>();
        for (Arc arc : arcList){

            String sourceName = arc.getSource().getName();
            String targetName = arc.getTarget().getName();

            List<Object> sourceDList = new ArrayList<>();
            List<Object> targetDList = new ArrayList<>();

            Definition sourceD = null;
            Definition targetD = null;
            for (Arc tempArc : copyArcList){
                if (tempArc.getSource().getName().equals(sourceName)){
                    sourceD = tempArc.getSource().getDefinitionRange();
                }
                if (tempArc.getSource().getName().equals(targetName)){
                    targetD = tempArc.getSource().getDefinitionRange();
                }
                if (tempArc.getTarget().getName().equals(sourceName)){
                    sourceD = tempArc.getTarget().getDefinitionRange();
                }
                if (tempArc.getTarget().getName().equals(targetName)){
                    targetD = tempArc.getTarget().getDefinitionRange();
                }
            }
            if (sourceD == null) {
                sourceDList.addAll(arc.getSource().getDefinitionRange().getDefinitionList());
                sourceD = new Definition(sourceDList);
            }
            Vertex source = new Vertex(sourceName, sourceD);
            source.setRang(arc.getSource().getRang());

            if (targetD == null) {
                targetDList.addAll(arc.getTarget().getDefinitionRange().getDefinitionList());
                targetD = new Definition(targetDList);
            }
            Vertex target = new Vertex(targetName, targetD);
            target.setRang(arc.getTarget().getRang());

            copyArcList.add(new Arc(source, target, arc.getConstraintList()));
        }

        return copyArcList;
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
