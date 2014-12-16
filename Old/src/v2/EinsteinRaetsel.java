package v2;

import java.util.HashSet;
import java.util.Set;

public class EinsteinRaetsel {

    public EinsteinRaetsel(){
        init();
        start();
    }

    private void start() {

        Solution solution = new Solution();
        fRekursion(solution);
    }

    private void fRekursion(Solution solution) {

    }

    private void init() {
        ConstraintNetz constraintNetz = createGraph();
    }

    private ConstraintNetz createGraph() {
        return null;
    }


    public static void main(String[] args){
        //new v2.EinsteinRaetsel();

        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(4);
        s2.add(2);
        s2.add(3);

        System.out.println();

    }
}
