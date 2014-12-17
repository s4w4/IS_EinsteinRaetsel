package einsteinApp;

import constraintSolver.ConstraintNet;
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
        List<Definition> definitionList = new ArrayList<>();
        for (int i = 0; i < 25; i++){
            Definition defPosition = new Definition();
            defPosition.addValue(1);
            defPosition.addValue(2);
            defPosition.addValue(3);
            defPosition.addValue(4);
            defPosition.addValue(5);
            definitionList.add(defPosition);
        }

        Definition defGetraenkMilch = new Definition(definitionList.get(0).getDefinitionList());
        Definition defGetraenkTee = new Definition(definitionList.get(1).getDefinitionList());
        Definition defGetraenkKaffee = new Definition(definitionList.get(2).getDefinitionList());
        Definition defGetraenkWasser = new Definition(definitionList.get(3).getDefinitionList());
        Definition defGetraenkBier = new Definition(definitionList.get(4).getDefinitionList());

        Definition defZigarettenWinfield = new Definition(definitionList.get(5).getDefinitionList());
        Definition defZigarettenRothmanns = new Definition(definitionList.get(6).getDefinitionList());
        Definition defZigarettenDunhill = new Definition(definitionList.get(7).getDefinitionList());
        Definition defZigarettenPallMall = new Definition(definitionList.get(8).getDefinitionList());
        Definition defZigarettenMarlboro = new Definition(definitionList.get(9).getDefinitionList());

        Definition defTierePferd = new Definition(definitionList.get(10).getDefinitionList());
        Definition defTiereHund = new Definition(definitionList.get(11).getDefinitionList());
        Definition defTiereFisch = new Definition(definitionList.get(12).getDefinitionList());
        Definition defTiereKatze = new Definition(definitionList.get(13).getDefinitionList());
        Definition defTiereVogel = new Definition(definitionList.get(14).getDefinitionList());

        Definition defFarbeGruen = new Definition(definitionList.get(15).getDefinitionList());
        Definition defFarbeBlau = new Definition(definitionList.get(16).getDefinitionList());
        Definition defFarbeRot = new Definition(definitionList.get(17).getDefinitionList());
        Definition defFarbeGelb = new Definition(definitionList.get(18).getDefinitionList());
        Definition defFarbeWeiss = new Definition(definitionList.get(19).getDefinitionList());

        Definition defNationalitaetDaene = new Definition(definitionList.get(20).getDefinitionList());
        Definition defNationalitaetBrite = new Definition(definitionList.get(21).getDefinitionList());
        Definition defNationalitaetNorwege = new Definition(definitionList.get(22).getDefinitionList());
        Definition defNationalitaetSchwede = new Definition(definitionList.get(23).getDefinitionList());
        Definition defNationalitaetDeutsche = new Definition(definitionList.get(24).getDefinitionList());


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

        UnaryConstraint constraintEqualValueOne = new ConstraintEqualValue(1);
        UnaryConstraint constraintEqualValueThree = new ConstraintEqualValue(3);

        List<BinaryConstraint> ConstraintListNotEqual = new ArrayList<>();
        ConstraintListNotEqual.add(constraintNotEqual);

        List<UnaryConstraint> ConstraintListEqualValueOne = new ArrayList<>();
        ConstraintListEqualValueOne.add(constraintEqualValueOne);
        List<UnaryConstraint> ConstraintListEqualValueThree = new ArrayList<>();
        ConstraintListEqualValueThree.add(constraintEqualValueThree);

        /**
         * Kanten erstellen
         */
        // Getraenke
        Arc arcGetraenkMilchGetraenkTee = new Arc(vertexGetraenkMilch, vertexGetraenkTee, ConstraintListNotEqual);
        Arc arcGetraenkMilchGetraenkKaffee = new Arc(vertexGetraenkMilch, vertexGetraenkKaffee, ConstraintListNotEqual);
        Arc arcGetraenkMilchGetraenkWasser = new Arc(vertexGetraenkMilch, vertexGetraenkWasser, ConstraintListNotEqual);
        Arc arcGetraenkMilchGetraenkBier = new Arc(vertexGetraenkMilch, vertexGetraenkBier, ConstraintListNotEqual);

        Arc arcGetraenkTeeGetraenkMilch = new Arc(vertexGetraenkTee, vertexGetraenkMilch, ConstraintListNotEqual);
        Arc arcGetraenkTeeGetraenkKaffee = new Arc(vertexGetraenkTee, vertexGetraenkKaffee, ConstraintListNotEqual);
        Arc arcGetraenkTeeGetraenkWasser = new Arc(vertexGetraenkTee, vertexGetraenkWasser, ConstraintListNotEqual);
        Arc arcGetraenkTeeGetraenkBier = new Arc(vertexGetraenkTee, vertexGetraenkBier, ConstraintListNotEqual);

        Arc arcGetraenkKaffeeGetraenkTee = new Arc(vertexGetraenkKaffee, vertexGetraenkTee, ConstraintListNotEqual);
        Arc arcGetraenkKaffeeGetraenkMilch = new Arc(vertexGetraenkKaffee, vertexGetraenkMilch, ConstraintListNotEqual);
        Arc arcGetraenkKaffeeGetraenkWasser = new Arc(vertexGetraenkKaffee, vertexGetraenkWasser, ConstraintListNotEqual);
        Arc arcGetraenkKaffeeGetraenkBier = new Arc(vertexGetraenkKaffee, vertexGetraenkBier, ConstraintListNotEqual);

        Arc arcGetraenkWasserGetraenkTee = new Arc(vertexGetraenkWasser, vertexGetraenkTee, ConstraintListNotEqual);
        Arc arcGetraenkWasserGetraenkKaffee = new Arc(vertexGetraenkWasser, vertexGetraenkKaffee, ConstraintListNotEqual);
        Arc arcGetraenkWasserGetraenkMilch = new Arc(vertexGetraenkWasser, vertexGetraenkMilch, ConstraintListNotEqual);
        Arc arcGetraenkWasserGetraenkBier = new Arc(vertexGetraenkWasser, vertexGetraenkBier, ConstraintListNotEqual);

        Arc arcGetraenkBierGetraenkTee = new Arc(vertexGetraenkBier, vertexGetraenkTee, ConstraintListNotEqual);
        Arc arcGetraenkBierGetraenkKaffee = new Arc(vertexGetraenkBier, vertexGetraenkKaffee, ConstraintListNotEqual);
        Arc arcGetraenkBierGetraenkWasser = new Arc(vertexGetraenkBier, vertexGetraenkWasser, ConstraintListNotEqual);
        Arc arcGetraenkBierGetraenkMilch = new Arc(vertexGetraenkBier, vertexGetraenkMilch, ConstraintListNotEqual);

        // Zigaretten
        Arc arcZigarettenWinfieldZigarettenRothmanns = new Arc(vertexZigarettenWinfield, vertexZigarettenRothmanns, ConstraintListNotEqual);
        Arc arcZigarettenWinfieldZigarettenDunhill = new Arc(vertexZigarettenWinfield, vertexZigarettenDunhill, ConstraintListNotEqual);
        Arc arcZigarettenWinfieldZigarettenPallMall = new Arc(vertexZigarettenWinfield, vertexZigarettenPallMall, ConstraintListNotEqual);
        Arc arcZigarettenWinfieldZigarettenMarlboro = new Arc(vertexZigarettenWinfield, vertexZigarettenMarlboro, ConstraintListNotEqual);

        Arc arcZigarettenRothmannsZigarettenWinfield = new Arc(vertexZigarettenRothmanns, vertexZigarettenWinfield, ConstraintListNotEqual);
        Arc arcZigarettenRothmannsZigarettenDunhill = new Arc(vertexZigarettenRothmanns, vertexZigarettenDunhill, ConstraintListNotEqual);
        Arc arcZigarettenRothmannsZigarettenPallMall = new Arc(vertexZigarettenRothmanns, vertexZigarettenPallMall, ConstraintListNotEqual);
        Arc arcZigarettenRothmannsZigarettenMarlboro = new Arc(vertexZigarettenRothmanns, vertexZigarettenMarlboro, ConstraintListNotEqual);

        Arc arcZigarettenDunhillZigarettenRothmanns = new Arc(vertexZigarettenDunhill, vertexZigarettenRothmanns, ConstraintListNotEqual);
        Arc arcZigarettenDunhillZigarettenWinfield = new Arc(vertexZigarettenDunhill, vertexZigarettenWinfield, ConstraintListNotEqual);
        Arc arcZigarettenDunhillZigarettenPallMall = new Arc(vertexZigarettenDunhill, vertexZigarettenPallMall, ConstraintListNotEqual);
        Arc arcZigarettenDunhillZigarettenMarlboro = new Arc(vertexZigarettenDunhill, vertexZigarettenMarlboro, ConstraintListNotEqual);

        Arc arcZigarettenPallMallZigarettenRothmanns = new Arc(vertexZigarettenPallMall, vertexZigarettenRothmanns, ConstraintListNotEqual);
        Arc arcZigarettenPallMallZigarettenDunhill = new Arc(vertexZigarettenPallMall, vertexZigarettenDunhill, ConstraintListNotEqual);
        Arc arcZigarettenPallMallZigarettenWinfield = new Arc(vertexZigarettenPallMall, vertexZigarettenWinfield, ConstraintListNotEqual);
        Arc arcZigarettenPallMallZigarettenMarlboro = new Arc(vertexZigarettenPallMall, vertexZigarettenMarlboro, ConstraintListNotEqual);

        Arc arcZigarettenMarlboroZigarettenRothmanns = new Arc(vertexZigarettenMarlboro, vertexZigarettenRothmanns, ConstraintListNotEqual);
        Arc arcZigarettenMarlboroZigarettenDunhill = new Arc(vertexZigarettenMarlboro, vertexZigarettenDunhill, ConstraintListNotEqual);
        Arc arcZigarettenMarlboroZigarettenPallMall = new Arc(vertexZigarettenMarlboro, vertexZigarettenPallMall, ConstraintListNotEqual);
        Arc arcZigarettenMarlboroZigarettenWinfield = new Arc(vertexZigarettenMarlboro, vertexZigarettenWinfield, ConstraintListNotEqual);

        // Tiere
        Arc arcTierePferdTiereHund = new Arc(vertexTierePferd, vertexTiereHund, ConstraintListNotEqual);
        Arc arcTierePferdTiereFisch = new Arc(vertexTierePferd, vertexTiereFisch, ConstraintListNotEqual);
        Arc arcTierePferdTiereKatze = new Arc(vertexTierePferd, vertexTiereKatze, ConstraintListNotEqual);
        Arc arcTierePferdTiereVogel = new Arc(vertexTierePferd, vertexTiereVogel, ConstraintListNotEqual);

        Arc arcTiereHundTierePferd = new Arc(vertexTiereHund, vertexTierePferd, ConstraintListNotEqual);
        Arc arcTiereHundTiereFisch = new Arc(vertexTiereHund, vertexTiereFisch, ConstraintListNotEqual);
        Arc arcTiereHundTiereKatze = new Arc(vertexTiereHund, vertexTiereKatze, ConstraintListNotEqual);
        Arc arcTiereHundTiereVogel = new Arc(vertexTiereHund, vertexTiereVogel, ConstraintListNotEqual);

        Arc arcTiereFischTiereHund = new Arc(vertexTiereFisch, vertexTiereHund, ConstraintListNotEqual);
        Arc arcTiereFischTierePferd = new Arc(vertexTiereFisch, vertexTierePferd, ConstraintListNotEqual);
        Arc arcTiereFischTiereKatze = new Arc(vertexTiereFisch, vertexTiereKatze, ConstraintListNotEqual);
        Arc arcTiereFischTiereVogel = new Arc(vertexTiereFisch, vertexTiereVogel, ConstraintListNotEqual);

        Arc arcTiereKatzeTiereHund = new Arc(vertexTiereKatze, vertexTiereHund, ConstraintListNotEqual);
        Arc arcTiereKatzeTiereFisch = new Arc(vertexTiereKatze, vertexTiereFisch, ConstraintListNotEqual);
        Arc arcTiereKatzeTierePferd = new Arc(vertexTiereKatze, vertexTierePferd, ConstraintListNotEqual);
        Arc arcTiereKatzeTiereVogel = new Arc(vertexTiereKatze, vertexTiereVogel, ConstraintListNotEqual);

        Arc arcTiereVogelTiereHund = new Arc(vertexTiereVogel, vertexTiereHund, ConstraintListNotEqual);
        Arc arcTiereVogelTiereFisch = new Arc(vertexTiereVogel, vertexTiereFisch, ConstraintListNotEqual);
        Arc arcTiereVogelTiereKatze = new Arc(vertexTiereVogel, vertexTiereKatze, ConstraintListNotEqual);
        Arc arcTiereVogelTierePferd = new Arc(vertexTiereVogel, vertexTierePferd, ConstraintListNotEqual);

        // Farbe
        Arc arcFarbeGruenFarbeBlau = new Arc(vertexFarbeGruen, vertexFarbeBlau, ConstraintListNotEqual);
        Arc arcFarbeGruenFarbeRot = new Arc(vertexFarbeGruen, vertexFarbeRot, ConstraintListNotEqual);
        Arc arcFarbeGruenFarbeGelb = new Arc(vertexFarbeGruen, vertexFarbeGelb, ConstraintListNotEqual);
        Arc arcFarbeGruenFarbeWeiss = new Arc(vertexFarbeGruen, vertexFarbeWeiss, ConstraintListNotEqual);

        Arc arcFarbeBlauFarbeGruen = new Arc(vertexFarbeBlau, vertexFarbeGruen, ConstraintListNotEqual);
        Arc arcFarbeBlauFarbeRot = new Arc(vertexFarbeBlau, vertexFarbeRot, ConstraintListNotEqual);
        Arc arcFarbeBlauFarbeGelb = new Arc(vertexFarbeBlau, vertexFarbeGelb, ConstraintListNotEqual);
        Arc arcFarbeBlauFarbeWeiss = new Arc(vertexFarbeBlau, vertexFarbeWeiss, ConstraintListNotEqual);

        Arc arcFarbeRotFarbeBlau = new Arc(vertexFarbeRot, vertexFarbeBlau, ConstraintListNotEqual);
        Arc arcFarbeRotFarbeGruen = new Arc(vertexFarbeRot, vertexFarbeGruen, ConstraintListNotEqual);
        Arc arcFarbeRotFarbeGelb = new Arc(vertexFarbeRot, vertexFarbeGelb, ConstraintListNotEqual);
        Arc arcFarbeRotFarbeWeiss = new Arc(vertexFarbeRot, vertexFarbeWeiss, ConstraintListNotEqual);

        Arc arcFarbeGelbFarbeBlau = new Arc(vertexFarbeGelb, vertexFarbeBlau, ConstraintListNotEqual);
        Arc arcFarbeGelbFarbeRot = new Arc(vertexFarbeGelb, vertexFarbeRot, ConstraintListNotEqual);
        Arc arcFarbeGelbFarbeGruen = new Arc(vertexFarbeGelb, vertexFarbeGruen, ConstraintListNotEqual);
        Arc arcFarbeGelbFarbeWeiss = new Arc(vertexFarbeGelb, vertexFarbeWeiss, ConstraintListNotEqual);

        Arc arcFarbeWeissFarbeBlau = new Arc(vertexFarbeWeiss, vertexFarbeBlau, ConstraintListNotEqual);
        Arc arcFarbeWeissFarbeRot = new Arc(vertexFarbeWeiss, vertexFarbeRot, ConstraintListNotEqual);
        Arc arcFarbeWeissFarbeGelb = new Arc(vertexFarbeWeiss, vertexFarbeGelb, ConstraintListNotEqual);
        Arc arcFarbeWeissFarbeGruen = new Arc(vertexFarbeWeiss, vertexFarbeGruen, ConstraintListNotEqual);

        // Nationalitaet
        Arc arcNationalitaetDaeneNationalitaetBrite = new Arc(vertexNationalitaetDaene, vertexNationalitaetBrite, ConstraintListNotEqual);
        Arc arcNationalitaetDaeneNationalitaetNorwege = new Arc(vertexNationalitaetDaene, vertexNationalitaetNorwege, ConstraintListNotEqual);
        Arc arcNationalitaetDaeneNationalitaetSchwede = new Arc(vertexNationalitaetDaene, vertexNationalitaetSchwede, ConstraintListNotEqual);
        Arc arcNationalitaetDaeneNationalitaetDeutsche = new Arc(vertexNationalitaetDaene, vertexNationalitaetDeutsche, ConstraintListNotEqual);

        Arc arcNationalitaetBriteNationalitaetDaene = new Arc(vertexNationalitaetBrite, vertexNationalitaetDaene, ConstraintListNotEqual);
        Arc arcNationalitaetBriteNationalitaetNorwege = new Arc(vertexNationalitaetBrite, vertexNationalitaetNorwege, ConstraintListNotEqual);
        Arc arcNationalitaetBriteNationalitaetSchwede = new Arc(vertexNationalitaetBrite, vertexNationalitaetSchwede, ConstraintListNotEqual);
        Arc arcNationalitaetBriteNationalitaetDeutsche = new Arc(vertexNationalitaetBrite, vertexNationalitaetDeutsche, ConstraintListNotEqual);

        Arc arcNationalitaetNorwegeNationalitaetBrite = new Arc(vertexNationalitaetNorwege, vertexNationalitaetBrite, ConstraintListNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetDaene = new Arc(vertexNationalitaetNorwege, vertexNationalitaetDaene, ConstraintListNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetSchwede = new Arc(vertexNationalitaetNorwege, vertexNationalitaetSchwede, ConstraintListNotEqual);
        Arc arcNationalitaetNorwegeNationalitaetDeutsche = new Arc(vertexNationalitaetNorwege, vertexNationalitaetDeutsche, ConstraintListNotEqual);

        Arc arcNationalitaetSchwedeNationalitaetBrite = new Arc(vertexNationalitaetSchwede, vertexNationalitaetBrite, ConstraintListNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetNorwege = new Arc(vertexNationalitaetSchwede, vertexNationalitaetNorwege, ConstraintListNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetDaene = new Arc(vertexNationalitaetSchwede, vertexNationalitaetDaene, ConstraintListNotEqual);
        Arc arcNationalitaetSchwedeNationalitaetDeutsche = new Arc(vertexNationalitaetSchwede, vertexNationalitaetDeutsche, ConstraintListNotEqual);

        Arc arcNationalitaetDeutscheNationalitaetBrite = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetBrite, ConstraintListNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetNorwege = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetNorwege, ConstraintListNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetSchwede = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetSchwede, ConstraintListNotEqual);
        Arc arcNationalitaetDeutscheNationalitaetDaene = new Arc(vertexNationalitaetDeutsche, vertexNationalitaetDaene, ConstraintListNotEqual);

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

        /**
         * CONSTRAINTS von Aufgabe

        Arc arcGetraenkTeeNationalitaetDaene = new Arc(vertexGetraenkTee, vertexNationalitaetDaene, constraintEqual);
        Arc arcNationalitaetDaeneGetraenkTee = new Arc(vertexNationalitaetDaene, vertexGetraenkTee, constraintEqual);
        arcList.add(arcGetraenkTeeNationalitaetDaene);
        arcList.add(arcNationalitaetDaeneGetraenkTee);

        Arc arcGetraenkKaffeeFarbeGruen = new Arc(vertexGetraenkKaffee, vertexFarbeGruen, constraintEqual);
        Arc arcFarbeGruenGetraenkKaffee = new Arc(vertexFarbeGruen, vertexGetraenkKaffee, constraintEqual);
        arcList.add(arcGetraenkKaffeeFarbeGruen);
        arcList.add(arcFarbeGruenGetraenkKaffee);

        Arc arcGetraenkBierZigarettenWinfield = new Arc(vertexGetraenkBier, vertexZigarettenWinfield, constraintEqual);
        Arc arcZigarettenWinfieldGetraenkBier = new Arc(vertexZigarettenWinfield, vertexGetraenkBier, constraintEqual);
        arcList.add(arcGetraenkBierZigarettenWinfield);
        arcList.add(arcZigarettenWinfieldGetraenkBier);

        Arc arcZigarettenRothmannsNationalitaetDeutsche = new Arc(vertexZigarettenRothmanns, vertexNationalitaetDeutsche, constraintEqual);
        Arc arcNationalitaetDeutscheZigarettenRothmanns = new Arc(vertexNationalitaetDeutsche, vertexZigarettenRothmanns, constraintEqual);
        arcList.add(arcZigarettenRothmannsNationalitaetDeutsche);
        arcList.add(arcNationalitaetDeutscheZigarettenRothmanns);

        Arc arcNationalitaetSchwedeTiereHund = new Arc(vertexNationalitaetSchwede, vertexTiereHund, constraintEqual);
        Arc arcTiereHundNationalitaetSchwede = new Arc(vertexTiereHund, vertexNationalitaetSchwede, constraintEqual);
        arcList.add(arcNationalitaetSchwedeTiereHund);
        arcList.add(arcTiereHundNationalitaetSchwede);

        Arc arcFarbeRotNationalitaetBrite = new Arc(vertexFarbeRot, vertexNationalitaetBrite, constraintEqual);
        Arc arcNationalitaetBriteFarbeRot = new Arc(vertexNationalitaetBrite, vertexFarbeRot, constraintEqual);
        arcList.add(arcFarbeRotNationalitaetBrite);
        arcList.add(arcNationalitaetBriteFarbeRot);

        Arc arcZigarettenPallMallTiereVogel = new Arc(vertexZigarettenPallMall, vertexTiereVogel, constraintEqual);
        Arc arcTiereVogelZigarettenPallMall = new Arc(vertexTiereVogel, vertexZigarettenPallMall, constraintEqual);
        arcList.add(arcZigarettenPallMallTiereVogel);
        arcList.add(arcTiereVogelZigarettenPallMall);

        Arc arcZigarettenDunhillFarbeGelb = new Arc(vertexZigarettenDunhill, vertexFarbeGelb, constraintEqual);
        Arc arcFarbeGelbZigarettenDunhill = new Arc(vertexFarbeGelb, vertexZigarettenDunhill, constraintEqual);
        arcList.add(arcZigarettenDunhillFarbeGelb);
        arcList.add(arcFarbeGelbZigarettenDunhill);

        Arc arcFarbeWeissFarbeGruenLeft  = new Arc(vertexFarbeWeiss, vertexFarbeGruen, constraintLeftNeighbar);
        Arc arcFarbeWeissFarbeGruenRight = new Arc(vertexFarbeGruen, vertexFarbeWeiss, constraintRightNeighbar);
        arcList.add(arcFarbeWeissFarbeGruenLeft);
        arcList.add(arcFarbeWeissFarbeGruenRight);

        Arc arcZigarettenMarlboroGetraenkWasser = new Arc(vertexZigarettenMarlboro, vertexGetraenkWasser, constraintNeighbar);
        Arc arcGetraenkWasserZigarettenMarlboro = new Arc(vertexGetraenkWasser, vertexZigarettenMarlboro, constraintNeighbar);
        arcList.add(arcZigarettenMarlboroGetraenkWasser);
        arcList.add(arcGetraenkWasserZigarettenMarlboro);


        Arc arcZigarettenMarlboroTiereKatze = new Arc(vertexZigarettenMarlboro, vertexTiereKatze, constraintNeighbar);
        Arc arcTiereKatzeZigarettenMarlboro = new Arc(vertexTiereKatze, vertexZigarettenMarlboro, constraintNeighbar);
        arcList.add(arcZigarettenMarlboroTiereKatze);


        Arc arcZigarettenDunhillTierePferd  = new Arc(vertexZigarettenDunhill, vertexTierePferd, constraintNeighbar);
        Arc arcTierePferdZigarettenDunhill = new Arc(vertexTierePferd, vertexZigarettenDunhill, constraintNeighbar);
        arcList.add(arcZigarettenDunhillTierePferd);
        arcList.add(arcTierePferdZigarettenDunhill);

        Arc arcNationalitaetNorwegeFarbeBlau  = new Arc(vertexNationalitaetNorwege, vertexFarbeBlau, constraintNeighbar);
        Arc arcFarbeBlauNationalitaetNorwege  = new Arc(vertexFarbeBlau, vertexNationalitaetNorwege, constraintNeighbar);
        arcList.add(arcNationalitaetNorwegeFarbeBlau);
        arcList.add(arcFarbeBlauNationalitaetNorwege);

         *
         */

        SelfLoop selfLoopNationalitaetNorwege   = new SelfLoop(vertexNationalitaetNorwege, ConstraintListEqualValueOne);
        SelfLoop selfLoopGetraenkMilch          = new SelfLoop(vertexGetraenkMilch, ConstraintListEqualValueThree);

        List<SelfLoop> selfLoopList = new ArrayList<>();
        selfLoopList.add(selfLoopNationalitaetNorwege);
        selfLoopList.add(selfLoopGetraenkMilch);

        /**
         * ConstraintNetz erstellen
         */
        ConstraintNet constraintNetz = new ConstraintNet(vertexList, arcList, selfLoopList);
        System.out.println(vertexList);
        System.out.println();
        ConstraintSatisfactionProblem csp = new ConstraintSatisfactionProblem();
        List<Arc> solution = csp.findSolution(constraintNetz);
        System.out.println(solution);
    }

}
