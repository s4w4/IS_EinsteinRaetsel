package app;

import constraintSolver.*;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args){
        test1();
    }

    private static void test1() {
        /**
         * Definitionsbereich erstellen
         */
        Definition dX = new Definition();
        dX.addValue(1);
        dX.addValue(2);
        dX.addValue(3);
        dX.addValue(4);
        dX.addValue(5);

        Definition dY = new Definition();
        dY.addValue(1);
        dY.addValue(2);
        dY.addValue(3);
        dY.addValue(4);
        dY.addValue(5);

        /**
         * Variablen erstellen
         */
        Vertex x = new Vertex("x", dX);
        Vertex y = new Vertex("y", dY);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(x);
        vertexList.add(y);

        /**
         * Constraints erstellen
         */
        BinaryConstraint constraintLesserThan = new ConstraintLesserThan();
        BinaryConstraint constraintGreaterEqual = new ConstraintGreaterEqual();
        UnaryConstraint constraintLesserThanFour = new ConstraintLesserThanValue(2);


        /**
         * Kanten erstellen
         */
        Arc arcXY = new Arc(x,y, constraintLesserThan);
        Arc arcYX = new Arc(y,x, constraintGreaterEqual);

        List<Arc> arcList = new ArrayList<>();
        arcList.add(arcXY);
        arcList.add(arcYX);

        SelfLoop selfLoopXX = new SelfLoop(x, constraintLesserThanFour);

        List<SelfLoop> selfLoopList = new ArrayList<>();
        selfLoopList.add(selfLoopXX);

        /**
         * ConstraintNetz erstellen
         */
        ConstraintNet constraintNetz = new ConstraintNet(vertexList, arcList, selfLoopList);
        System.out.println("VertexList  : "+vertexList);
        System.out.println("ArcList     : "+arcList);
        System.out.println("SelfLoopList: "+selfLoopList);
        System.out.println();

        ConstraintSolver.nc(selfLoopList);
        System.out.println("VertexList  : "+vertexList);
        System.out.println("ArcList     : "+arcList);
        System.out.println("SelfLoopList: "+selfLoopList);
        System.out.println();


    }
}
