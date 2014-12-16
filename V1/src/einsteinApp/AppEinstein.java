package einsteinApp;

import einsteinApp.constraints.*;
import entities.Arc;
import entities.BinaryConstraint;
import entities.Definition;
import entities.Vertex;

import java.util.ArrayList;
import java.util.List;

import static einsteinApp.VariablenCommon.*;

public class AppEinstein {
    public static void main(String[] args) {
        /**
         * Definitionsbereich erstellen
         */
        Definition defPosition = new Definition();
        defPosition.addValue(1);
        defPosition.addValue(2);
        defPosition.addValue(3);
        defPosition.addValue(4);
        defPosition.addValue(5);

        Definition defGetraenkMilch = new Definition(defPosition.getDefinitionList());
        Definition defGetraenkTee = new Definition(defPosition.getDefinitionList());
        Definition defGetraenkKaffee = new Definition(defPosition.getDefinitionList());
        Definition defGetraenkWasser = new Definition(defPosition.getDefinitionList());
        Definition defGetraenkBier = new Definition(defPosition.getDefinitionList());

        Definition defZigarettenWinfield = new Definition(defPosition.getDefinitionList());
        Definition defZigarettenRothmanns = new Definition(defPosition.getDefinitionList());
        Definition defZigarettenDunhill = new Definition(defPosition.getDefinitionList());
        Definition defZigarettenPallMall = new Definition(defPosition.getDefinitionList());
        Definition defZigarettenMarlboro = new Definition(defPosition.getDefinitionList());

        Definition defTierePferd = new Definition(defPosition.getDefinitionList());
        Definition defTiereHund = new Definition(defPosition.getDefinitionList());
        Definition defTiereFisch = new Definition(defPosition.getDefinitionList());
        Definition defTiereKatze = new Definition(defPosition.getDefinitionList());
        Definition defTiereVogel = new Definition(defPosition.getDefinitionList());

        Definition defFarbeGruen = new Definition(defPosition.getDefinitionList());
        Definition defFarbeBlau = new Definition(defPosition.getDefinitionList());
        Definition defFarbeRot = new Definition(defPosition.getDefinitionList());
        Definition defFarbeGelb = new Definition(defPosition.getDefinitionList());
        Definition defFarbeWeiss = new Definition(defPosition.getDefinitionList());

        Definition defNationalitaetDaene = new Definition(defPosition.getDefinitionList());
        Definition defNationalitaetBrite = new Definition(defPosition.getDefinitionList());
        Definition defNationalitaetNorwege = new Definition(defPosition.getDefinitionList());
        Definition defNationalitaetSchwede = new Definition(defPosition.getDefinitionList());
        Definition defNationalitaetDeutsche = new Definition(defPosition.getDefinitionList());


        /**
         * Variablen erstellen
         */

        Vertex vertexGetraenkMilch = new Vertex(GETRAENK_MILCH, defGetraenkMilch);
        Vertex vertexGetraenkTee = new Vertex(GETRAENK_TEE, defGetraenkTee);
        Vertex vertexGetraenkKaffee = new Vertex(GETRAENK_KAFFEE, defGetraenkKaffee);
        Vertex vertexGetraenkWasser = new Vertex(GETRAENK_WASSER, defGetraenkWasser);
        Vertex vertexGetraenkBier = new Vertex(GETRAENK_BIER, defGetraenkBier);

        Vertex vertexZigarettenWinfield = new Vertex(ZIGARETTEN_WINFIELD, defZigarettenWinfield);
        Vertex vertexZigarettenRothmanns = new Vertex(ZIGARETTEN_ROTHMANNS, defZigarettenRothmanns);
        Vertex vertexZigarettenDunhill = new Vertex(ZIGARETTEN_DUNHILL, defZigarettenDunhill);
        Vertex vertexZigarettenPallMall = new Vertex(ZIGARETTEN_PALLMALL, defZigarettenPallMall);
        Vertex vertexZigarettenMarlboro = new Vertex(ZIGARETTEN_MARLBORO, defZigarettenMarlboro);

        Vertex vertexTierePferd = new Vertex(TIERE_PFERD, defTierePferd);
        Vertex vertexTiereHund = new Vertex(TIERE_HUND, defTiereHund);
        Vertex vertexTiereFisch = new Vertex(TIERE_FISCH, defTiereFisch);
        Vertex vertexTiereKatze = new Vertex(TIERE_KATZE, defTiereKatze);
        Vertex vertexTiereVogel = new Vertex(TIERE_VOGEL, defTiereVogel);

        Vertex vertexFarbeGruen = new Vertex(FARBEN_GRUEN, defFarbeGruen);
        Vertex vertexFarbeBlau = new Vertex(FARBEN_BLAU, defFarbeBlau);
        Vertex vertexFarbeRot = new Vertex(FARBEN_ROT, defFarbeRot);
        Vertex vertexFarbeGelb = new Vertex(FARBEN_GELB, defFarbeGelb);
        Vertex vertexFarbeWeiss = new Vertex(FARBEN_WEISS, defFarbeWeiss);

        Vertex vertexNationalitaetDaene = new Vertex(NATIONALITAET_DAENE, defNationalitaetDaene);
        Vertex vertexNationalitaetBrite = new Vertex(NATIONALITAET_BRITE, defNationalitaetBrite);
        Vertex vertexNationalitaetNorwege = new Vertex(NATIONALITAET_NORWEGE, defNationalitaetNorwege);
        Vertex vertexNationalitaetSchwede = new Vertex(NATIONALITAET_SCHWEDE, defNationalitaetSchwede);
        Vertex vertexNationalitaetDeutsche = new Vertex(NATIONALITAET_DEUTSCHE, defNationalitaetDeutsche);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vertexGetraenkMilch);
        vertexList.add(vertexGetraenkTee);
        vertexList.add(vertexGetraenkKaffee);
        vertexList.add(vertexGetraenkWasser);
        vertexList.add(vertexGetraenkBier);

        vertexList.add(vertexZigarettenWinfield);
        vertexList.add(vertexZigarettenRothmanns);
        vertexList.add(vertexZigarettenDunhill);
        vertexList.add(vertexZigarettenPallMall);
        vertexList.add(vertexZigarettenMarlboro);

        vertexList.add(vertexTierePferd);
        vertexList.add(vertexTiereHund);
        vertexList.add(vertexTiereFisch);
        vertexList.add(vertexTiereKatze);
        vertexList.add(vertexTiereVogel);

        vertexList.add(vertexFarbeGruen);
        vertexList.add(vertexFarbeBlau);
        vertexList.add(vertexFarbeRot);
        vertexList.add(vertexFarbeGelb);
        vertexList.add(vertexFarbeWeiss);

        vertexList.add(vertexNationalitaetDaene);
        vertexList.add(vertexNationalitaetBrite);
        vertexList.add(vertexNationalitaetNorwege);
        vertexList.add(vertexNationalitaetSchwede);
        vertexList.add(vertexNationalitaetDeutsche);

        /**
         * Constraints erstellen
         */
        BinaryConstraint constraintNotEqual = new ConstraintNotEqual();
        BinaryConstraint constraintEqual = new ConstraintEqual();
        BinaryConstraint constraintNeighbar = new ConstraintNeighbar();
        BinaryConstraint constraintLeftNeighbar = new ConstraintLeftNeighbar();
        BinaryConstraint constraintRightNeighbar = new ConstraintRightNeighbar();


        /**
         * Kanten erstellen
         */
        // Getraenke
        Arc arcGetraenkMilchGetraenkTee     = new Arc(vertexGetraenkMilch, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkKaffee  = new Arc(vertexGetraenkMilch, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkWasser  = new Arc(vertexGetraenkMilch, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkBier    = new Arc(vertexGetraenkMilch, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkTeeGetraenkMilch     = new Arc(vertexGetraenkTee, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkKaffee    = new Arc(vertexGetraenkTee, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkWasser    = new Arc(vertexGetraenkTee, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkBier      = new Arc(vertexGetraenkTee, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkKaffeeGetraenkTee    = new Arc(vertexGetraenkKaffee, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkMilch  = new Arc(vertexGetraenkKaffee, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkWasser = new Arc(vertexGetraenkKaffee, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkBier   = new Arc(vertexGetraenkKaffee, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkWasserGetraenkTee    = new Arc(vertexGetraenkWasser, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkKaffee = new Arc(vertexGetraenkWasser, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkMilch  = new Arc(vertexGetraenkWasser, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkBier   = new Arc(vertexGetraenkWasser, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkBierGetraenkTee      = new Arc(vertexGetraenkBier, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkBierGetraenkKaffee   = new Arc(vertexGetraenkBier, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkBierGetraenkWasser   = new Arc(vertexGetraenkBier, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkBierGetraenkMilch    = new Arc(vertexGetraenkBier, vertexGetraenkMilch, constraintNotEqual);

        // Zigaretten
        Arc arcZigarettenWinfieldZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenDunhill   = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenPallMall  = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenMarlboro  = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenRothmannsZigarettenWinfield = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenDunhill   = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenPallMall  = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenMarlboro  = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenDunhillZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenWinfield   = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenPallMall  = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenMarlboro  = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);
/*
        Arc arcZigarettenWinfieldZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenDunhill   = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenPallMall  = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenMarlboro  = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenWinfieldZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenDunhill   = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenPallMall  = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenMarlboro  = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);

        // Tiere

        // Farbe

        // Nationalitaet

        List<Arc> arcList = new ArrayList<>();
        arcList.add(arcZigarettenGetraenk);
        arcList.add(arcGetraenkZigaretten);

        SelfLoop selfLoopNationalitaet = new SelfLoop(nationalitaet, constraintEqualValueOneNationalitaet);

        List<SelfLoop> selfLoopList = new ArrayList<>();
        selfLoopList.add(selfLoopNationalitaet);
*/
        /**
         * ConstraintNetz erstellen
         */
/*        ConstraintNet constraintNetz = new ConstraintNet(vertexList, arcList, selfLoopList);
        System.out.println("VertexList  : " + vertexList);
        System.out.println("ArcList     : " + arcList);
        System.out.println("SelfLoopList: " + selfLoopList);
        System.out.println();

        ConstraintSolver.nc(selfLoopList);
        System.out.println("VertexList  : " + vertexList);
        System.out.println("ArcList     : " + arcList);
        System.out.println("SelfLoopList: " + selfLoopList);
        System.out.println();*/
    }

}
