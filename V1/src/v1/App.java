package v1;

import java.util.ArrayList;
import java.util.List;
import static v1.VariablenCommon.*;

public class App {

    private static final List<String> nationalitaetenList = new ArrayList<>();
    private static final List<String> getraenkeList = new ArrayList<>();
    private static final List<String> farbenList = new ArrayList<>();
    private static final List<String> zigarettenList = new ArrayList<>();
    private static final List<String> tiereList = new ArrayList<>();
    private static final List<String> variablenList = new ArrayList<>();

    public static void main(String[] args) {
        createVariable();
        createVertex();
        createConstraints();
        // TODO: sortieren Vertex!!!

    }

    private static void createVariable() {
        nationalitaetenList.add(NATIONALITAET_NORWEGE);
        nationalitaetenList.add(NATIONALITAET_BRITE);
        nationalitaetenList.add(NATIONALITAET_DEUTSCHE);
        nationalitaetenList.add(NATIONALITAET_SCHWEDE);
        nationalitaetenList.add(NATIONALITAET_DAENE);
        variablenList.addAll(nationalitaetenList);

        getraenkeList.add(GETRAENK_MILCH);
        getraenkeList.add(GETRAENK_TEE);
        getraenkeList.add(GETRAENK_KAFFEE);
        getraenkeList.add(GETRAENK_WASSER);
        getraenkeList.add(GETRAENK_BIER);
        variablenList.addAll(getraenkeList);

        farbenList.add(FARBEN_ROT);
        farbenList.add(FARBEN_BLAU);
        farbenList.add(FARBEN_GELB);
        farbenList.add(FARBEN_GRUEN);
        farbenList.add(FARBEN_WEISS);
        variablenList.addAll(farbenList);

        zigarettenList.add(ZIGARETTEN_PALLMALL);
        zigarettenList.add(ZIGARETTEN_MARLBORO);
        zigarettenList.add(ZIGARETTEN_ROTHMANNS);
        zigarettenList.add(ZIGARETTEN_DUNHILL);
        zigarettenList.add(ZIGARETTEN_WINFIELD);
        variablenList.addAll(zigarettenList);

        tiereList.add(TIERE_HUND);
        tiereList.add(TIERE_KATZE);
        tiereList.add(TIERE_PFERD);
        tiereList.add(TIERE_VOGEL);
        tiereList.add(TIERE_FISCH);
        variablenList.addAll(tiereList);
    }

    private static void addConstraints(List<String> list, Constraint constraint){
        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j){
                    ConstraintNetz.addConstraint(list.get(i),list.get(j),constraint);
                }
            }
        }
    }

    private static void createConstraints() {

        // ALL-Different
        addConstraints(nationalitaetenList, Constraint.NOT_EQUALS);
        addConstraints(getraenkeList, Constraint.NOT_EQUALS);
        addConstraints(farbenList, Constraint.NOT_EQUALS);
        addConstraints(zigarettenList, Constraint.NOT_EQUALS);
        addConstraints(tiereList, Constraint.NOT_EQUALS);

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

        for(String elem : variablenList){
            if (elem.equals(NATIONALITAET_NORWEGE)) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(1);
                ConstraintNetz.addVertex(elem, l1); // 9. Der Norweger lebt im ersten Haus.
            }
            else if (elem.equals(GETRAENK_MILCH)) {
                List<Integer> l2 = new ArrayList<>();
                l2.add(3);
                ConstraintNetz.addVertex(elem, l2); // 7. Der Mann im mittleren Haus trinkt Milch.
            }
            else ConstraintNetz.addVertex(elem);
        }

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
