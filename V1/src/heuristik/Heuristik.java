package heuristik;

import constraintSolver.ConstraintNet;
import entities.Vertex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Heuristik {
	/*
	 * Statische Ordnungsheuristiken f�r Variablen
	 */
	// keine
	NO_HEURISTIK,
	// Variable mit h�chster Wahrscheinlichkeit des Scheiterns zuerst w�hlen
	FIRST_FAIL_HEURISTIK,
	// �hnliche �berlegung: Variable, die an den meisten Constraints beteiligt
	// ist
	MAXUMUM_DEGREE_HEURISTIK,
	// Variable mit den meisten Constraints mit bereits instantiierten Variablen
	MAXIMUM_CARDINALITY_HEURISTIK,
	// Reihenfolge der Variablen unterstuetzt Weite des Constraint-Netzes
	MINIMAL_WIDTH_HEURISTIK,
	// Es wird immer die Variable als n�chste
	// genommen, die �ber die kleinste Anzahl m�glicher Werte verf�gt.
	// So wird der L�sungsraum maximal beschnitten.
	DYNAMIC_SEARCH_REARRANGEMENT_HEURISTIK;

	public Map<Integer, Vertex> sort(ConstraintNet constraintNetz) {
        Map<Integer, Vertex> resultVertexMap = new HashMap<>();
        List<Vertex> vertexList;
        switch (this) {
		case NO_HEURISTIK:
            vertexList = constraintNetz.getVertexList();
            for (int i = 0; i < vertexList.size(); i++){
                vertexList.get(i).setRang(i + 1);
                resultVertexMap.put(vertexList.get(i).getRang(),vertexList.get(i));
            }
            return resultVertexMap;

		case DYNAMIC_SEARCH_REARRANGEMENT_HEURISTIK:
			/**
			 * QUICKSORT HIER
			 */
            vertexList = constraintNetz.getVertexList();

            QuickSort quickSort = new QuickSort();
            List<Vertex> sL = quickSort.quicksort(vertexList);
            for (int i = 0; i < sL.size(); i++){
                sL.get(i).setRang(i + 1);
            }
            for (Vertex v : vertexList){
                resultVertexMap.put(v.getRang(),v);
            }
            return resultVertexMap;

		default:
			System.out.println("default");
			break;
		}

		return null;
	}

}
