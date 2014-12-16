package v2;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class App {
    public static void main(String[] args){
        List<List<Integer>> gList = new ArrayList<List<Integer>>();

        List<Integer> v1 = new ArrayList<Integer>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        List<Integer> v2 = new ArrayList<Integer>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        List<Integer> v3 = new ArrayList<Integer>();
        v3.add(1);
        v3.add(2);
        v3.add(3);

        gList.add(v1);
        gList.add(v2);
        gList.add(v3);

        List<List<Integer>> res = fRek(gList);

        System.out.println(">>> "+res);
    }

    private static List<List<Integer>> fRek(List<List<Integer>> list) {
        if (list.isEmpty())
            return list;

        List<Integer> elem = list.get(0);
        List<List<Integer>> newList = new ArrayList<List<Integer>>();
        newList.add(elem);
        list.remove(0);
        newList.addAll(fRek(list));

        return newList;
    }
}
