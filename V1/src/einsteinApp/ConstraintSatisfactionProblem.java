package einsteinApp;

import constraintSolver.ConstraintSolver;
import entities.Arc;
import entities.Vertex;

import java.util.ArrayList;
import java.util.List;

public class ConstraintSatisfactionProblem {

    private ConstraintSolver constraintSolver;

    public ConstraintSatisfactionProblem(){
        this.constraintSolver = new ConstraintSolver();
    }

    public void findSolution(List<Vertex> vertexList, List<Arc> arcList){

        int i = 0;
        while (!isSolution(vertexList) && i < vertexList.size()){
            Vertex vertex = vertexList.get(i);
            List<Object> defTemp = new ArrayList<>();
            defTemp.addAll(vertex.getDefinitionRange().getDefinitionList());
            vertex.getDefinitionRange().getDefinitionList().removeAll(defTemp);
            vertex.getDefinitionRange().getDefinitionList().add(defTemp.get(0));

            i++;
        }

    }

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
