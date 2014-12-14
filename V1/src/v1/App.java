package v1;

import java.util.ArrayList;
import java.util.List;
import static v1.VariablenCommon.*;

public class App {
    public static void main(String[] args) {

        createVertex();
        createConstraints();
        // TODO: sortieren Vertex!!!

    }

    private static void createConstraints() {
        // Nationalitäten
        ConstraintNetz.addConstraint(NATIONALITAET_BRITE,NATIONALITAET_DEUTSCHE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_BRITE,NATIONALITAET_DAENE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_BRITE,NATIONALITAET_NORWEGE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_BRITE,NATIONALITAET_SCHWEDE,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(NATIONALITAET_DEUTSCHE,NATIONALITAET_BRITE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DEUTSCHE,NATIONALITAET_DAENE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DEUTSCHE,NATIONALITAET_NORWEGE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DEUTSCHE,NATIONALITAET_SCHWEDE,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(NATIONALITAET_DAENE,NATIONALITAET_BRITE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DAENE,NATIONALITAET_DEUTSCHE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DAENE,NATIONALITAET_NORWEGE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_DAENE,NATIONALITAET_SCHWEDE,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(NATIONALITAET_NORWEGE,NATIONALITAET_BRITE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_NORWEGE,NATIONALITAET_DAENE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_NORWEGE,NATIONALITAET_DEUTSCHE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_NORWEGE,NATIONALITAET_SCHWEDE,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(NATIONALITAET_SCHWEDE,NATIONALITAET_BRITE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_SCHWEDE,NATIONALITAET_DAENE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_SCHWEDE,NATIONALITAET_NORWEGE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(NATIONALITAET_SCHWEDE,NATIONALITAET_DEUTSCHE,Constraint.NOT_EQUALS);

        // Getraenke
        ConstraintNetz.addConstraint(GETRAENK_BIER,GETRAENK_KAFFEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_BIER,GETRAENK_MILCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_BIER,GETRAENK_TEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_BIER,GETRAENK_WASSER,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,GETRAENK_BIER,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,GETRAENK_MILCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,GETRAENK_TEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,GETRAENK_WASSER,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(GETRAENK_MILCH,GETRAENK_KAFFEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_MILCH,GETRAENK_BIER,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_MILCH,GETRAENK_TEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_MILCH,GETRAENK_WASSER,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(GETRAENK_TEE,GETRAENK_KAFFEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_TEE,GETRAENK_MILCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_TEE,GETRAENK_BIER,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_TEE,GETRAENK_WASSER,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(GETRAENK_WASSER,GETRAENK_KAFFEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_WASSER,GETRAENK_MILCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_WASSER,GETRAENK_TEE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_WASSER,GETRAENK_BIER,Constraint.NOT_EQUALS);

        // Farben
        ConstraintNetz.addConstraint(FARBEN_GELB,FARBEN_GRUEN,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GELB,FARBEN_BLAU,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GELB,FARBEN_ROT,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GELB,FARBEN_WEISS,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(FARBEN_GRUEN,FARBEN_GELB,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GRUEN,FARBEN_BLAU,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GRUEN,FARBEN_ROT,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_GRUEN,FARBEN_WEISS,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(FARBEN_BLAU,FARBEN_GRUEN,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_BLAU,FARBEN_GELB,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_BLAU,FARBEN_ROT,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_BLAU,FARBEN_WEISS,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(FARBEN_ROT,FARBEN_GRUEN,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_ROT,FARBEN_GELB,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_ROT,FARBEN_BLAU,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_ROT,FARBEN_WEISS,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(FARBEN_WEISS,FARBEN_GRUEN,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_WEISS,FARBEN_GELB,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_WEISS,FARBEN_ROT,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(FARBEN_WEISS,FARBEN_BLAU,Constraint.NOT_EQUALS);

        // Zigaretten
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,ZIGARETTEN_MARLBORO,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,ZIGARETTEN_PALLMALL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,ZIGARETTEN_ROTHMANNS,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,ZIGARETTEN_WINFIELD,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,ZIGARETTEN_DUNHILL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,ZIGARETTEN_PALLMALL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,ZIGARETTEN_ROTHMANNS,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,ZIGARETTEN_WINFIELD,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(ZIGARETTEN_PALLMALL,ZIGARETTEN_MARLBORO,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_PALLMALL,ZIGARETTEN_DUNHILL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_PALLMALL,ZIGARETTEN_ROTHMANNS,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_PALLMALL,ZIGARETTEN_WINFIELD,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(ZIGARETTEN_ROTHMANNS,ZIGARETTEN_MARLBORO,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_ROTHMANNS,ZIGARETTEN_PALLMALL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_ROTHMANNS,ZIGARETTEN_DUNHILL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_ROTHMANNS,ZIGARETTEN_WINFIELD,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(ZIGARETTEN_WINFIELD,ZIGARETTEN_MARLBORO,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_WINFIELD,ZIGARETTEN_PALLMALL,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_WINFIELD,ZIGARETTEN_ROTHMANNS,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_WINFIELD,ZIGARETTEN_DUNHILL,Constraint.NOT_EQUALS);

        // Tiere
        ConstraintNetz.addConstraint(TIERE_FISCH,TIERE_HUND,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_FISCH,TIERE_KATZE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_FISCH,TIERE_PFERD,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_FISCH,TIERE_VOGEL,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(TIERE_HUND,TIERE_FISCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_HUND,TIERE_KATZE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_HUND,TIERE_PFERD,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_HUND,TIERE_VOGEL,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(TIERE_KATZE,TIERE_HUND,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_KATZE,TIERE_FISCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_KATZE,TIERE_PFERD,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_KATZE,TIERE_VOGEL,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(TIERE_PFERD,TIERE_HUND,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_PFERD,TIERE_KATZE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_PFERD,TIERE_FISCH,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_PFERD,TIERE_VOGEL,Constraint.NOT_EQUALS);

        ConstraintNetz.addConstraint(TIERE_VOGEL,TIERE_HUND,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_VOGEL,TIERE_KATZE,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_VOGEL,TIERE_PFERD,Constraint.NOT_EQUALS);
        ConstraintNetz.addConstraint(TIERE_VOGEL,TIERE_FISCH,Constraint.NOT_EQUALS);

        // 1. Der Brite lebt im roten Haus
        ConstraintNetz.addConstraint(NATIONALITAET_BRITE,FARBEN_ROT,Constraint.EQUALS);
        ConstraintNetz.addConstraint(FARBEN_ROT,NATIONALITAET_BRITE,Constraint.EQUALS);

        // 2. Der Schwede haelt sich einen Hund.
        ConstraintNetz.addConstraint(NATIONALITAET_SCHWEDE,TIERE_HUND,Constraint.EQUALS);
        ConstraintNetz.addConstraint(TIERE_HUND,NATIONALITAET_SCHWEDE,Constraint.EQUALS);

        // 3. Der Daene trinkt gern Tee.
        ConstraintNetz.addConstraint(NATIONALITAET_DAENE,GETRAENK_TEE,Constraint.EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_TEE,NATIONALITAET_DAENE,Constraint.EQUALS);

        // 4. Das gruene Haus steht links neben dem weissen Haus.
        ConstraintNetz.addConstraint(FARBEN_GRUEN,FARBEN_WEISS,Constraint.LEFT_NEIGHBAR);
        ConstraintNetz.addConstraint(FARBEN_WEISS,FARBEN_GRUEN,Constraint.RIGHT_NEIGHBAR);

        // 5. Der Besitzer des gruenen Hauses trinkt Kaffee.
        ConstraintNetz.addConstraint(FARBEN_GRUEN,GETRAENK_KAFFEE,Constraint.EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,FARBEN_GRUEN,Constraint.EQUALS);

        // 5. Der Besitzer des gruenen Hauses trinkt Kaffee.
        ConstraintNetz.addConstraint(FARBEN_GRUEN,GETRAENK_KAFFEE,Constraint.EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_KAFFEE,FARBEN_GRUEN,Constraint.EQUALS);

        // 6. Die Person, die Pall Mall raucht, hat einen Vogel.
        ConstraintNetz.addConstraint(ZIGARETTEN_PALLMALL,TIERE_VOGEL,Constraint.EQUALS);
        ConstraintNetz.addConstraint(TIERE_VOGEL,ZIGARETTEN_PALLMALL,Constraint.EQUALS);

        // 8. Der Bewohner des gelben Hauses raucht Dunhill.
        ConstraintNetz.addConstraint(FARBEN_GELB,ZIGARETTEN_DUNHILL,Constraint.EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,FARBEN_GELB,Constraint.EQUALS);

        // 10. Der Malboro-Raucher wohnt neben der Person mit der Katze.
        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,TIERE_KATZE,Constraint.NEIGHBARS);
        ConstraintNetz.addConstraint(TIERE_KATZE,ZIGARETTEN_MARLBORO,Constraint.NEIGHBARS);

        // 11. Der Mann mit dem Pferd lebt neben der Person, die Dunhill raucht.
        ConstraintNetz.addConstraint(TIERE_PFERD,ZIGARETTEN_DUNHILL,Constraint.NEIGHBARS);
        ConstraintNetz.addConstraint(ZIGARETTEN_DUNHILL,TIERE_PFERD,Constraint.NEIGHBARS);

        // 12. Der Winfield-Raucher trinkt gern Bier.
        ConstraintNetz.addConstraint(ZIGARETTEN_WINFIELD,GETRAENK_BIER,Constraint.EQUALS);
        ConstraintNetz.addConstraint(GETRAENK_BIER,ZIGARETTEN_WINFIELD,Constraint.EQUALS);

        // 13. Der Norweger wohnt neben dem blauen Haus.
        ConstraintNetz.addConstraint(NATIONALITAET_NORWEGE,FARBEN_BLAU,Constraint.NEIGHBARS);
        ConstraintNetz.addConstraint(FARBEN_BLAU,NATIONALITAET_NORWEGE,Constraint.NEIGHBARS);

        // 14. Der Deutsche raucht Rothmanns.
        ConstraintNetz.addConstraint(NATIONALITAET_DEUTSCHE,ZIGARETTEN_ROTHMANNS,Constraint.EQUALS);
        ConstraintNetz.addConstraint(ZIGARETTEN_ROTHMANNS,NATIONALITAET_DEUTSCHE,Constraint.EQUALS);

        // 15. Der Malboro-Raucher hat einen Nachbarn, der Wasser trinkt.
        ConstraintNetz.addConstraint(ZIGARETTEN_MARLBORO,GETRAENK_WASSER,Constraint.NEIGHBARS);
        ConstraintNetz.addConstraint(GETRAENK_WASSER,ZIGARETTEN_MARLBORO,Constraint.NEIGHBARS);

    }

    private static void createVertex() {
        // Position der Haeuser
        List<Integer> werteBereich = new ArrayList<>();
        werteBereich.add(1);
        werteBereich.add(2);
        werteBereich.add(3);
        werteBereich.add(4);
        werteBereich.add(5);

        ConstraintNetz.initValueRange(werteBereich);
        // Nationalitäten
        ConstraintNetz.addVertex(NATIONALITAET_NORWEGE, new ArrayList<Integer>(1));       // Norwege wohnt im ersten Haus!!!
        ConstraintNetz.addVertex(NATIONALITAET_BRITE);
        ConstraintNetz.addVertex(NATIONALITAET_DEUTSCHE);
        ConstraintNetz.addVertex(NATIONALITAET_SCHWEDE);
        ConstraintNetz.addVertex(NATIONALITAET_DAENE);
        // Getränke
        ConstraintNetz.addVertex(GETRAENK_MILCH, new ArrayList<Integer>(3));         // Person im 3ten Haus trinkt Milch
        ConstraintNetz.addVertex(GETRAENK_TEE);
        ConstraintNetz.addVertex(GETRAENK_KAFFEE);
        ConstraintNetz.addVertex(GETRAENK_WASSER);
        ConstraintNetz.addVertex(GETRAENK_BIER);
        // Farben
        ConstraintNetz.addVertex(FARBEN_ROT);
        ConstraintNetz.addVertex(FARBEN_BLAU);
        ConstraintNetz.addVertex(FARBEN_GELB);
        ConstraintNetz.addVertex(FARBEN_GRUEN);
        ConstraintNetz.addVertex(FARBEN_WEISS);
        // Zigaretten
        ConstraintNetz.addVertex(ZIGARETTEN_PALLMALL);
        ConstraintNetz.addVertex(ZIGARETTEN_MARLBORO);
        ConstraintNetz.addVertex(ZIGARETTEN_ROTHMANNS);
        ConstraintNetz.addVertex(ZIGARETTEN_DUNHILL);
        ConstraintNetz.addVertex(ZIGARETTEN_WINFIELD);
        // Tiere
        ConstraintNetz.addVertex(TIERE_HUND);
        ConstraintNetz.addVertex(TIERE_KATZE);
        ConstraintNetz.addVertex(TIERE_PFERD);
        ConstraintNetz.addVertex(TIERE_VOGEL);
        ConstraintNetz.addVertex(TIERE_FISCH);
    }

    private static void testConstraints() {

        System.out.println("EQUAL: 1 = 1 -> (true) " + Constraint.EQUALS.isConstant(1, 1));
        System.out.println("EQUAL: 1 = 2 -> (false) " + Constraint.EQUALS.isConstant(1, 2));
        System.out.println();
        System.out.println("NOT_EQUAL: 1 != 2 -> (true) " + Constraint.NOT_EQUALS.isConstant(1, 2));
        System.out.println("NOT_EQUAL: 1 != 1 -> (false) " + Constraint.NOT_EQUALS.isConstant(1, 1));
        System.out.println();
        System.out.println("NEIGHBARS: 1 neben 2 -> (true) " + Constraint.NEIGHBARS.isConstant(1, 2));
        System.out.println("NEIGHBARS: 2 neben 1 -> (true) " + Constraint.NEIGHBARS.isConstant(2, 1));
        System.out.println("NEIGHBARS: 3 neben 1 -> (false) " + Constraint.NEIGHBARS.isConstant(3, 1));
        System.out.println("NEIGHBARS: 1 neben 3 -> (false) " + Constraint.NEIGHBARS.isConstant(1, 3));
        System.out.println("NEIGHBARS: 1 neben 1 -> (false) " + Constraint.NEIGHBARS.isConstant(1, 1));
        System.out.println();
        System.out.println("LEFT_NEIGHBAR: 1 links neben 2 -> (true) " + Constraint.LEFT_NEIGHBAR.isConstant(1, 2));
        System.out.println("LEFT_NEIGHBAR: 2 links neben 1 -> (false) " + Constraint.LEFT_NEIGHBAR.isConstant(2, 1));
        System.out.println("LEFT_NEIGHBAR: 2 links neben 2 -> (false) " + Constraint.LEFT_NEIGHBAR.isConstant(2, 2));
        System.out.println("LEFT_NEIGHBAR: 1 links neben 3 -> (false) " + Constraint.LEFT_NEIGHBAR.isConstant(1, 3));
        System.out.println();
        System.out.println("RIGHT_NEIGHBAR: 2 rechts neben 1 -> (true) " + Constraint.RIGHT_NEIGHBAR.isConstant(2, 1));
        System.out.println("RIGHT_NEIGHBAR: 1 rechts neben 2 -> (false) " + Constraint.RIGHT_NEIGHBAR.isConstant(1, 2));
        System.out.println("RIGHT_NEIGHBAR: 2 rechts neben 2 -> (false) " + Constraint.RIGHT_NEIGHBAR.isConstant(2, 2));
        System.out.println("RIGHT_NEIGHBAR: 3 rechts neben 1 -> (false) " + Constraint.RIGHT_NEIGHBAR.isConstant(3, 1));

    }
}
