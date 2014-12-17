package einsteinApp;

import constraintSolver.ConstraintNet;
import constraintSolver.ConstraintSolver;
import einsteinApp.constraints.*;
import entities.*;

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
        UnaryConstraint constraintNotEqualValueOne = new ConstraintEqualValue(1);
        UnaryConstraint constraintNotEqualValueThree = new ConstraintEqualValue(3);


        /**
         * Kanten erstellen
         */
        // Getraenke
        Arc arcGetraenkMilchGetraenkTee = new Arc(vertexGetraenkMilch, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkKaffee = new Arc(vertexGetraenkMilch, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkWasser = new Arc(vertexGetraenkMilch, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkMilchGetraenkBier = new Arc(vertexGetraenkMilch, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkTeeGetraenkMilch = new Arc(vertexGetraenkTee, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkKaffee = new Arc(vertexGetraenkTee, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkWasser = new Arc(vertexGetraenkTee, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkTeeGetraenkBier = new Arc(vertexGetraenkTee, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkKaffeeGetraenkTee = new Arc(vertexGetraenkKaffee, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkMilch = new Arc(vertexGetraenkKaffee, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkWasser = new Arc(vertexGetraenkKaffee, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkKaffeeGetraenkBier = new Arc(vertexGetraenkKaffee, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkWasserGetraenkTee = new Arc(vertexGetraenkWasser, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkKaffee = new Arc(vertexGetraenkWasser, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkMilch = new Arc(vertexGetraenkWasser, vertexGetraenkMilch, constraintNotEqual);
        Arc arcGetraenkWasserGetraenkBier = new Arc(vertexGetraenkWasser, vertexGetraenkBier, constraintNotEqual);

        Arc arcGetraenkBierGetraenkTee = new Arc(vertexGetraenkBier, vertexGetraenkTee, constraintNotEqual);
        Arc arcGetraenkBierGetraenkKaffee = new Arc(vertexGetraenkBier, vertexGetraenkKaffee, constraintNotEqual);
        Arc arcGetraenkBierGetraenkWasser = new Arc(vertexGetraenkBier, vertexGetraenkWasser, constraintNotEqual);
        Arc arcGetraenkBierGetraenkMilch = new Arc(vertexGetraenkBier, vertexGetraenkMilch, constraintNotEqual);

        // Zigaretten
        Arc arcZigarettenWinfieldZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenDunhill = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenPallMall = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenWinfieldZigarettenMarlboro = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenRothmannsZigarettenWinfield = new Arc(vertexZigarettenRothmanns, vertexZigarettenWinfield, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenDunhill = new Arc(vertexZigarettenRothmanns, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenPallMall = new Arc(vertexZigarettenRothmanns, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenRothmannsZigarettenMarlboro = new Arc(vertexZigarettenRothmanns, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenDunhillZigarettenRothmanns = new Arc(vertexZigarettenDunhill, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenWinfield = new Arc(vertexZigarettenDunhill, vertexZigarettenWinfield, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenPallMall = new Arc(vertexZigarettenDunhill, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenDunhillZigarettenMarlboro = new Arc(vertexZigarettenDunhill, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenPallMallZigarettenRothmanns = new Arc(vertexZigarettenPallMall, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenPallMallZigarettenDunhill = new Arc(vertexZigarettenPallMall, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenPallMallZigarettenWinfield = new Arc(vertexZigarettenPallMall, vertexZigarettenWinfield, constraintNotEqual);
        Arc arcZigarettenPallMallZigarettenMarlboro = new Arc(vertexZigarettenPallMall, vertexZigarettenMarlboro, constraintNotEqual);

        Arc arcZigarettenMarlboroZigarettenRothmanns = new Arc(vertexZigarettenMarlboro, vertexZigarettenRothmanns, constraintNotEqual);
        Arc arcZigarettenMarlboroZigarettenDunhill = new Arc(vertexZigarettenMarlboro, vertexZigarettenDunhill, constraintNotEqual);
        Arc arcZigarettenMarlboroZigarettenPallMall = new Arc(vertexZigarettenMarlboro, vertexZigarettenPallMall, constraintNotEqual);
        Arc arcZigarettenMarlboroZigarettenWinfield = new Arc(vertexZigarettenMarlboro, vertexZigarettenWinfield, constraintNotEqual);

        // Tiere
        Arc arcTierePferdTiereHund = new Arc(vertexTierePferd, vertexTiereHund, constraintNotEqual);
        Arc arcTierePferdTiereFisch = new Arc(vertexTierePferd, vertexTiereFisch, constraintNotEqual);
        Arc arcTierePferdTiereKatze = new Arc(vertexTierePferd, vertexTiereKatze, constraintNotEqual);
        Arc arcTierePferdTiereVogel = new Arc(vertexTierePferd, vertexTiereVogel, constraintNotEqual);

        Arc arcTiereHundTierePferd = new Arc(vertexTiereHund, vertexTierePferd, constraintNotEqual);
        Arc arcTiereHundTiereFisch = new Arc(vertexTiereHund, vertexTiereFisch, constraintNotEqual);
        Arc arcTiereHundTiereKatze = new Arc(vertexTiereHund, vertexTiereKatze, constraintNotEqual);
        Arc arcTiereHundTiereVogel = new Arc(vertexTiereHund, vertexTiereVogel, constraintNotEqual);

        Arc arcTiereFischTiereHund = new Arc(vertexTiereFisch, vertexTiereHund, constraintNotEqual);
        Arc arcTiereFischTierePferd = new Arc(vertexTiereFisch, vertexTierePferd, constraintNotEqual);
        Arc arcTiereFischTiereKatze = new Arc(vertexTiereFisch, vertexTiereKatze, constraintNotEqual);
        Arc arcTiereFischTiereVogel = new Arc(vertexTiereFisch, vertexTiereVogel, constraintNotEqual);

        Arc arcTiereKatzeTiereHund = new Arc(vertexTiereKatze, vertexTiereHund, constraintNotEqual);
        Arc arcTiereKatzeTiereFisch = new Arc(vertexTiereKatze, vertexTiereFisch, constraintNotEqual);
        Arc arcTiereKatzeTierePferd = new Arc(vertexTiereKatze, vertexTierePferd, constraintNotEqual);
        Arc arcTiereKatzeTiereVogel = new Arc(vertexTiereKatze, vertexTiereVogel, constraintNotEqual);

        Arc arcTiereVogelTiereHund = new Arc(vertexTiereVogel, vertexTiereHund, constraintNotEqual);
        Arc arcTiereVogelTiereFisch = new Arc(vertexTiereVogel, vertexTiereFisch, constraintNotEqual);
        Arc arcTiereVogelTiereKatze = new Arc(vertexTiereVogel, vertexTiereKatze, constraintNotEqual);
        Arc arcTiereVogelTierePferd = new Arc(vertexTiereVogel, vertexTierePferd, constraintNotEqual);

        // Farbe
        Arc arcFarbeGruenFarbeBlau = new Arc(vertexFarbeGruen, vertexFarbeBlau, constraintNotEqual);
        Arc arcFarbeGruenFarbeRot = new Arc(vertexFarbeGruen, vertexFarbeRot, constraintNotEqual);
        Arc arcFarbeGruenFarbeGelb = new Arc(vertexFarbeGruen, vertexFarbeGelb, constraintNotEqual);
        Arc arcFarbeGruenFarbeWeiss = new Arc(vertexFarbeGruen, vertexFarbeWeiss, constraintNotEqual);

        Arc arcFarbeBlauFarbeGruen = new Arc(vertexFarbeBlau, vertexFarbeGruen, constraintNotEqual);
        Arc arcFarbeBlauFarbeRot = new Arc(vertexFarbeBlau, vertexFarbeRot, constraintNotEqual);
        Arc arcFarbeBlauFarbeGelb = new Arc(vertexFarbeBlau, vertexFarbeGelb, constraintNotEqual);
        Arc arcFarbeBlauFarbeWeiss = new Arc(vertexFarbeBlau, vertexFarbeWeiss, constraintNotEqual);

        Arc arcFarbeRotFarbeBlau = new Arc(vertexFarbeRot, vertexFarbeBlau, constraintNotEqual);
        Arc arcFarbeRotFarbeGruen = new Arc(vertexFarbeRot, vertexFarbeGruen, constraintNotEqual);
        Arc arcFarbeRotFarbeGelb = new Arc(vertexFarbeRot, vertexFarbeGelb, constraintNotEqual);
        Arc arcFarbeRotFarbeWeiss = new Arc(vertexFarbeRot, vertexFarbeWeiss, constraintNotEqual);

        Arc arcFarbeGelbFarbeBlau = new Arc(vertexFarbeGelb, vertexFarbeBlau, constraintNotEqual);
        Arc arcFarbeGelbFarbeRot = new Arc(vertexFarbeGelb, vertexFarbeRot, constraintNotEqual);
        Arc arcFarbeGelbFarbeGruen = new Arc(vertexFarbeGelb, vertexFarbeGruen, constraintNotEqual);
        Arc arcFarbeGelbFarbeWeiss = new Arc(vertexFarbeGelb, vertexFarbeWeiss, constraintNotEqual);

        Arc arcFarbeWeissFarbeBlau = new Arc(vertexFarbeWeiss, vertexFarbeBlau, constraintNotEqual);
        Arc arcFarbeWeissFarbeRot = new Arc(vertexFarbeWeiss, vertexFarbeRot, constraintNotEqual);
        Arc arcFarbeWeissFarbeGelb = new Arc(vertexFarbeWeiss, vertexFarbeGelb, constraintNotEqual);
        Arc arcFarbeWeissFarbeGruen = new Arc(vertexFarbeWeiss, vertexFarbeGruen, constraintNotEqual);

        // Nationalitaet
        Arc arcNationalitaetDaeneNationalitaetBrite = new Arc(vertexNationalitaetDaene, vertexNationalitaetBrite, constraintNotEqual);
        Arc arcNationalitaetDaeneNationalitaetNorwege = new Arc(vertexNationalitaetDaene, vertexNationalitaetNorwege, constraintNotEqual);
        Arc arcNationalitaetDaeneNationalitaetSchwede = new Arc(vertexNationalitaetDaene, vertexNationalitaetSchwede, constraintNotEqual);
        Arc arcNationalitaetDaeneNationalitaetDeutsche = new Arc(vertexNationalitaetDaene, vertexNationalitaetDeutsche, constraintNotEqual);

        Arc arcNationalitaetBriteNationalitaetDaene = new Arc(vertexNationalitaetBrite, vertexNationalitaetDaene, constraintNotEqual);
        Arc arcNationalitaetBriteNationalitaetNorwege = new Arc(vertexNationalitaetBrite, vertexNationalitaetNorwege, constraintNotEqual);
        Arc arcNationalitaetBriteNationalitaetSchwede = new Arc(vertexNationalitaetBrite, vertexNationalitaetSchwede, constraintNotEqual);
        Arc arcNationalitaetBriteNationalitaetDeutsche = new Arc(vertexNationalitaetBrite, vertexNationalitaetDeutsche, constraintNotEqual);

        Arc arcNationalitaetNorwegeNationalitaetBrite = new Arc(vertexNationalitaetNorwege, vertexNationalitaetBrite, constraintNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetDaene = new Arc(vertexNationalitaetNorwege, vertexNationalitaetDaene, constraintNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetSchwede = new Arc(vertexNationalitaetNorwege, vertexNationalitaetSchwede, constraintNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetDeutsche = new Arc(vertexNationalitaetNorwege, vertexNationalitaetDeutsche, constraintNotEqual);

        Arc arcNationalitaetSchwedeNationalitaetBrite = new Arc(vertexNationalitaetSchwede, vertexNationalitaetBrite, constraintNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetNorwege = new Arc(vertexNationalitaetSchwede, vertexNationalitaetNorwege, constraintNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetDaene = new Arc(vertexNationalitaetSchwede, vertexNationalitaetDaene, constraintNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetDeutsche = new Arc(vertexNationalitaetSchwede, vertexNationalitaetDeutsche, constraintNotEqual);

        Arc arcNationalitaetDeutscheNationalitaetBrite = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetBrite, constraintNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetNorwege = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetNorwege, constraintNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetSchwede = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetSchwede, constraintNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetDaene = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetDaene, constraintNotEqual);

        List<Arc> arcList = new ArrayList<>();
        // Getraenke
        arcList.add(arcGetraenkMilchGetraenkTee);
        arcList.add(arcGetraenkMilchGetraenkKaffee);
        arcList.add(arcGetraenkMilchGetraenkWasser);
        arcList.add(arcGetraenkMilchGetraenkBier);

        arcList.add(arcGetraenkTeeGetraenkMilch);
        arcList.add(arcGetraenkTeeGetraenkKaffee);
        arcList.add(arcGetraenkTeeGetraenkWasser);
        arcList.add(arcGetraenkTeeGetraenkBier);

        arcList.add(arcGetraenkKaffeeGetraenkTee);
        arcList.add(arcGetraenkKaffeeGetraenkMilch);
        arcList.add(arcGetraenkKaffeeGetraenkWasser);
        arcList.add(arcGetraenkKaffeeGetraenkBier);

        arcList.add(arcGetraenkWasserGetraenkTee);
        arcList.add(arcGetraenkWasserGetraenkKaffee);
        arcList.add(arcGetraenkWasserGetraenkMilch);
        arcList.add(arcGetraenkWasserGetraenkBier);

        arcList.add(arcGetraenkBierGetraenkTee);
        arcList.add(arcGetraenkBierGetraenkKaffee);
        arcList.add(arcGetraenkBierGetraenkWasser);
        arcList.add(arcGetraenkBierGetraenkMilch);

        // Zigaretten
        arcList.add(arcZigarettenWinfieldZigarettenRothmanns);
        arcList.add(arcZigarettenWinfieldZigarettenDunhill);
        arcList.add(arcZigarettenWinfieldZigarettenPallMall);
        arcList.add(arcZigarettenWinfieldZigarettenMarlboro);

        arcList.add(arcZigarettenRothmannsZigarettenWinfield);
        arcList.add(arcZigarettenRothmannsZigarettenDunhill);
        arcList.add(arcZigarettenRothmannsZigarettenPallMall);
        arcList.add(arcZigarettenRothmannsZigarettenMarlboro);

        arcList.add(arcZigarettenDunhillZigarettenRothmanns);
        arcList.add(arcZigarettenDunhillZigarettenWinfield);
        arcList.add(arcZigarettenDunhillZigarettenPallMall);
        arcList.add(arcZigarettenDunhillZigarettenMarlboro);

        arcList.add(arcZigarettenPallMallZigarettenRothmanns);
        arcList.add(arcZigarettenPallMallZigarettenDunhill);
        arcList.add(arcZigarettenPallMallZigarettenWinfield);
        arcList.add(arcZigarettenPallMallZigarettenMarlboro);

        arcList.add(arcZigarettenMarlboroZigarettenRothmanns);
        arcList.add(arcZigarettenMarlboroZigarettenDunhill);
        arcList.add(arcZigarettenMarlboroZigarettenPallMall);
        arcList.add(arcZigarettenMarlboroZigarettenWinfield);

        // Tiere
        arcList.add(arcTierePferdTiereHund);
        arcList.add(arcTierePferdTiereFisch);
        arcList.add(arcTierePferdTiereKatze);
        arcList.add(arcTierePferdTiereVogel);

        arcList.add(arcTiereHundTierePferd);
        arcList.add(arcTiereHundTiereFisch);
        arcList.add(arcTiereHundTiereKatze);
        arcList.add(arcTiereHundTiereVogel);

        arcList.add(arcTiereFischTiereHund);
        arcList.add(arcTiereFischTierePferd);
        arcList.add(arcTiereFischTiereKatze);
        arcList.add(arcTiereFischTiereVogel);

        arcList.add(arcTiereKatzeTiereHund);
        arcList.add(arcTiereKatzeTiereFisch);
        arcList.add(arcTiereKatzeTierePferd);
        arcList.add(arcTiereKatzeTiereVogel);

        arcList.add(arcTiereVogelTiereHund);
        arcList.add(arcTiereVogelTiereFisch);
        arcList.add(arcTiereVogelTiereKatze);
        arcList.add(arcTiereVogelTierePferd);

        // Farbe
        arcList.add(arcFarbeGruenFarbeBlau);
        arcList.add(arcFarbeGruenFarbeRot);
        arcList.add(arcFarbeGruenFarbeGelb);
        arcList.add(arcFarbeGruenFarbeWeiss);

        arcList.add(arcFarbeBlauFarbeGruen);
        arcList.add(arcFarbeBlauFarbeRot);
        arcList.add(arcFarbeBlauFarbeGelb);
        arcList.add(arcFarbeBlauFarbeWeiss);

        arcList.add(arcFarbeRotFarbeBlau);
        arcList.add(arcFarbeRotFarbeGruen);
        arcList.add(arcFarbeRotFarbeGelb);
        arcList.add(arcFarbeRotFarbeWeiss);

        arcList.add(arcFarbeGelbFarbeBlau);
        arcList.add(arcFarbeGelbFarbeRot);
        arcList.add(arcFarbeGelbFarbeGruen);
        arcList.add(arcFarbeGelbFarbeWeiss);

        arcList.add(arcFarbeWeissFarbeBlau);
        arcList.add(arcFarbeWeissFarbeRot);
        arcList.add(arcFarbeWeissFarbeGelb);
        arcList.add(arcFarbeWeissFarbeGruen);

        // Nationalitaet
        arcList.add(arcNationalitaetDaeneNationalitaetBrite);
        arcList.add(arcNationalitaetDaeneNationalitaetNorwege);
        arcList.add(arcNationalitaetDaeneNationalitaetSchwede);
        arcList.add(arcNationalitaetDaeneNationalitaetDeutsche);

        arcList.add(arcNationalitaetBriteNationalitaetDaene);
        arcList.add(arcNationalitaetBriteNationalitaetNorwege);
        arcList.add(arcNationalitaetBriteNationalitaetSchwede);
        arcList.add(arcNationalitaetBriteNationalitaetDeutsche);

        arcList.add(arcNationalitaetNorwegeNationalitaetBrite);
        arcList.add(arcNationalitaetNorwegeNationalitaetDaene);
        arcList.add(arcNationalitaetNorwegeNationalitaetSchwede);
        arcList.add(arcNationalitaetNorwegeNationalitaetDeutsche);

        arcList.add(arcNationalitaetSchwedeNationalitaetBrite);
        arcList.add(arcNationalitaetSchwedeNationalitaetNorwege);
        arcList.add(arcNationalitaetSchwedeNationalitaetDaene);
        arcList.add(arcNationalitaetSchwedeNationalitaetDeutsche);

        arcList.add(arcNationalitaetDeutscheNationalitaetBrite);
        arcList.add(arcNationalitaetDeutscheNationalitaetNorwege);
        arcList.add(arcNationalitaetDeutscheNationalitaetSchwede);
        arcList.add(arcNationalitaetDeutscheNationalitaetDaene);

        SelfLoop selfLoopNationalitaetNorwege   = new SelfLoop(vertexNationalitaetNorwege, constraintNotEqualValueOne);
        SelfLoop selfLoopGetraenkMilch          = new SelfLoop(vertexGetraenkMilch, constraintNotEqualValueThree);

        List<SelfLoop> selfLoopList = new ArrayList<>();
        selfLoopList.add(selfLoopNationalitaetNorwege);
        selfLoopList.add(selfLoopGetraenkMilch);

        /**
         * ConstraintNetz erstellen
         */
        ConstraintNet constraintNetz = new ConstraintNet(vertexList, arcList, selfLoopList);
        System.out.println("VertexList  : " + vertexList);
        System.out.println("ArcList     : " + arcList);
        System.out.println("SelfLoopList: " + selfLoopList);
        System.out.println();

        ConstraintSolver cs = new ConstraintSolver();
        cs.nc(selfLoopList);
        System.out.println("VertexList  : " + vertexList);
        System.out.println("ArcList     : " + arcList);
        System.out.println("SelfLoopList: " + selfLoopList);
        System.out.println();
    }

}
