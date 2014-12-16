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
        Definition dX = new Definition();
        dX.addValue(1);
        dX.addValue(2);
        dX.addValue(3);
        dX.addValue(4);
        dX.addValue(5);
        Definition dY = new Definition();
        dY.addValue(1);

        Vertex v1 = new Vertex("x", dX);
        Vertex v2 = new Vertex("y", dY);
        v1.setRang(1);
        v1.setRang(2);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(v1);
        vertexList.add(v2);

        BinaryConstraint cB = new ConstraintNotEqual();
        List<BinaryConstraint> cList = new ArrayList<>();
        cList.add(cB);

        Arc arc1 = new Arc(v1, v2, cList);
        Arc arc2 = new Arc(v2, v1, cList);
        List<Arc> arcList = new ArrayList<>();
        arcList.add(arc1);
        arcList.add(arc2);

        System.out.println(arcList);
        ConstraintSolver.ac3la(v2, arcList);
        System.out.println();
        System.out.println(arcList);

    }
}
