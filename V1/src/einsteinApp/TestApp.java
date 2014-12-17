package einsteinApp;

import app.ConstraintGreaterEqual;
import app.ConstraintLesserThan;
import app.ConstraintLesserThanValue;
import constraintSolver.ConstraintNet;
import einsteinApp.constraints.ConstraintNotEqual;
import entities.*;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args){
        /**
         * Definitionsbereich erstellen
         */
        Definition dX = new Definition();
        dX.addValue(1);
        dX.addValue(2);
        Definition dY = new Definition();
        dY.addValue(1);
        dY.addValue(4);
        Definition dZ = new Definition();
        dZ.addValue(5);
        dZ.addValue(6);

        /**
         * Variablen / Knoten erstellen
         */
        Vertex vX = new Vertex("x", dX);
        Vertex vY = new Vertex("y", dY);
        Vertex vZ = new Vertex("z", dZ);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vX);
        vertexList.add(vY);
        vertexList.add(vZ);

        
        /**
         * Unaere Constraints erstellen
         */
        UnaryConstraint cXX = new ConstraintLesserThanValue(2);
        List<UnaryConstraint> cListXX = new ArrayList<>();
        cListXX.add(cXX); 

        /**
         * Binäre Constraints erstellen
         */
        BinaryConstraint cXY = new ConstraintNotEqual();
        BinaryConstraint cZY = new ConstraintGreaterEqual();
        BinaryConstraint cYZ = new ConstraintLesserThan();
        List<BinaryConstraint> cListXY = new ArrayList<>();
        cListXY.add(cXY);
        List<BinaryConstraint> cListZY = new ArrayList<>();
        cListZY.add(cZY);
        List<BinaryConstraint> cListYZ = new ArrayList<>();
        cListYZ.add(cYZ);

        /**
         * Kanten erstellen
         */
        SelfLoop selfLoopXX = new SelfLoop(vX, cListXX);
        
        Arc arcXY = new Arc(vX, vY, cListXY);
        Arc arcYX = new Arc(vY, vX, cListXY);

        Arc arcYZ = new Arc(vY, vZ, cListYZ);
        Arc arcZY = new Arc(vZ, vY, cListZY);

        List<Arc> arcList = new ArrayList<>();
        arcList.add(arcXY);
        arcList.add(arcYX);
        arcList.add(arcYZ);
        arcList.add(arcZY);
        
        

        /**
         * Sortieren
         */
        vX.setRang(1);
        vY.setRang(2);
        vZ.setRang(3);

        List<Vertex> sortierteVertex = new ArrayList<>();
        sortierteVertex.add(vX);
        sortierteVertex.add(vY);
        sortierteVertex.add(vZ);
        
        List<SelfLoop> selfLoopList = new ArrayList<SelfLoop>();
        selfLoopList.add(selfLoopXX);
        
		ConstraintNet constraintNetz = new ConstraintNet(vertexList, arcList, selfLoopList);


        /**
         * Starten
         */
        System.out.println(arcList);
        //ConstraintSolver.ac3la(v1, arcList);
        ConstraintSatisfactionProblem csp = new ConstraintSatisfactionProblem();
        List<Arc> resultArcList = csp.findSolution(constraintNetz);

        /**
         * Ausgabe
         */
        System.out.println();
        System.out.println(resultArcList);

    }
}
