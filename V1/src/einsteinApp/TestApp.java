package einsteinApp;

import constraintSolver.ConstraintSolver;
import einsteinApp.constraints.ConstraintNotEqual;
import entities.Arc;
import entities.BinaryConstraint;
import entities.Definition;
import entities.Vertex;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args){
        /**
         * Definitionsbereich erstellen
         */
        Definition dX = new Definition();
        dX.addValue(1);
        Definition dY = new Definition();
        dY.addValue(1);
        dY.addValue(2);
        dY.addValue(3);
        dY.addValue(4);
        dY.addValue(5);

        /**
         * Variablen / Knoten erstellen
         */
        Vertex v1 = new Vertex("x", dX);
        Vertex v2 = new Vertex("y", dY);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(v1);
        vertexList.add(v2);

        /**
         * Binäre Constraints erstellen
         */
        BinaryConstraint cB = new ConstraintNotEqual();
        List<BinaryConstraint> cList = new ArrayList<>();
        cList.add(cB);

        /**
         * Kanten erstellen
         */
        Arc arc1 = new Arc(v1, v2, cList);
        Arc arc2 = new Arc(v2, v1, cList);
        List<Arc> arcList = new ArrayList<>();
        arcList.add(arc1);
        arcList.add(arc2);

        /**
         * Sortieren
         */
        v1.setRang(1);
        v2.setRang(2);

        /**
         * Starten
         */
        System.out.println(arcList);
        ConstraintSolver.ac3la(v1, arcList);

        /**
         * Ausgabe
         */
        System.out.println();
        System.out.println(arcList);

    }
}
