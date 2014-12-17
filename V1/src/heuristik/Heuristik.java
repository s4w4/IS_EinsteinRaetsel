package heuristik;

import java.util.List;

import constraintSolver.ConstraintNet;
import entities.Vertex;

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

	public List<Vertex> sort(ConstraintNet constraintNetz) {
		switch (this) {
		case NO_HEURISTIK:
			System.out.println(">>>NO_HEURISTIK");

			break;

		case DYNAMIC_SEARCH_REARRANGEMENT_HEURISTIK:
			/**
			 * QUICKSORT HIER
			 */
			List<Vertex> vertexList = constraintNetz.getVertexList();
			for (Vertex vertex : vertexList){
				vertex.getDefinitionRange().getDefinitionList().size(); 
			}
			break;

		default:
			System.out.println("default");
			break;
		}

		return null;
	}

}
