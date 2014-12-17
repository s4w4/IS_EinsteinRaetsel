package einsteinApp;

import entities.Definition;
import entities.Vertex;

import java.util.HashMap;
import java.util.Map;

public class AppTest2 {
    public static void main(String[] args){

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        System.out.println(map);
        map.put(1, "b");
        System.out.println(map);





        Definition def = new Definition();
        def.addValue(1);
        def.addValue(2);
        Definition def2 = new Definition();
        def2.addValue(3);
        def2.addValue(4);

        Definition def3 = new Definition();
        def3.addValue(1);
        def3.addValue(2);
        Definition def4 = new Definition();
        def4.addValue(3);
        def4.addValue(4);


        Vertex v1 = new Vertex("a", def);
        Vertex v2 = new Vertex("a", def2);
        //Vertex v3 = new Vertex("a", def3);
        //Vertex v4 = new Vertex("b", def4);

        System.out.println(v1.equals(v2));

/*
        Arc arcOriginal = new Arc(v1,v2, new ConstraintEqual());

        System.out.println(arcOriginal);

        Vertex source = arcOriginal.getSource();
        Vertex target = arcOriginal.getTarget();

        Vertex v3 = new Vertex(source.getName() , source.getDefinitionRange());
        Vertex v4 = new Vertex(target.getName() , target.getDefinitionRange());

        Arc newArc = new Arc(v3,v4, new ConstraintEqual());
        newArc.getSource().getDefinitionRange().getDefinitionList().remove(0);

        System.out.println("NEW: "+newArc);
        System.out.println("ORI: "+arcOriginal);

        System.out.println(newArc.equals(arcOriginal));*/
    }
}
