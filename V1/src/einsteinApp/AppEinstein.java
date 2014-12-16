package einsteinApp;

import constraintSolver.*;

import java.util.ArrayList;
import java.util.List;

import entities.Arc;
import entities.BinaryConstraint;
import entities.Definition;
import entities.SelfLoop;
import entities.UnaryConstraint;
import entities.Vertex;

public class AppEinstein {
    public static void main(String[] args) {
        /**
         * Definitionsbereich erstellen
         */
        Definition defDefault = new Definition();
        Definition defGetraenkMilch = new Definition();
        Definition defGetraenkTee = new Definition();
        Definition defGetraenkKaffee = new Definition();
        Definition defGetraenkWasser = new Definition();
        Definition defGetraenkBier = new Definition();



        /**
         * Variablen erstellen
         */
        Vertex nationalitaet = new Vertex("nationalitaet", def);
        Vertex getraenke = new Vertex("Getraenke", def);
        Vertex tiere = new Vertex("Tiere", def);
        Vertex zigaretten = new Vertex("Zigaretten", def);
        Vertex farbe = new Vertex("Farbe", def);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(nationalitaet);
        vertexList.add(getraenke);
        vertexList.add(tiere);
        vertexList.add(zigaretten);
        vertexList.add(farbe);

        /**
         * Constraints erstellen
         */
        BinaryConstraint constraintEqualZigarettenGetraenk = new ConstraintEqual(1,4);
        BinaryConstraint constraintEqualGetraenkZigaretten = new ConstraintEqual(4,1);
        UnaryConstraint  constraintEqualValueOneNationalitaet = new ConstraintEqualValue(3,1);


        /**
         * Kanten erstellen
         */
        Arc arcZigarettenGetraenk = new Arc(zigaretten,getraenke, constraintEqualZigarettenGetraenk);
        Arc arcGetraenkZigaretten = new Arc(getraenke,zigaretten, constraintEqualGetraenkZigaretten);

        List<Arc> arcList = new ArrayList<>();
        arcList.add(arcZigarettenGetraenk);
        arcList.add(arcGetraenkZigaretten);

        SelfLoop selfLoopNationalitaet = new SelfLoop(nationalitaet, constraintEqualValueOneNationalitaet);

        List<SelfLoop> selfLoopList = new ArrayList<>();
        selfLoopList.add(selfLoopNationalitaet);

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
