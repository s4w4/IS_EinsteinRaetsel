package heuristik;
import entities.Vertex;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public QuickSort(){

    }

    public List<Vertex> quicksort(List<Vertex> vertexList){
        if(vertexList.size() <= 1){
            return vertexList;
        }

        int middle = (int) Math.ceil((double)vertexList.size() / 2);
        Vertex pivot = vertexList.get(middle);

        List<Vertex> less = new ArrayList<Vertex>();
        List<Vertex> greater = new ArrayList<Vertex>();

        for (int i = 0; i < vertexList.size(); i++) {
            if(vertexList.get(i).getDefinitionRange().getDefinitionList().size() <= pivot.getDefinitionRange().getDefinitionList().size()){
                if(i == middle){
                    continue;
                }
                less.add(vertexList.get(i));
            }
            else{
                greater.add(vertexList.get(i));
            }
        }

        return concatenate(quicksort(less), pivot, quicksort(greater));
    }

    private List<Vertex> concatenate(List<Vertex> less, Vertex pivot, List<Vertex> greater){

        List<Vertex> list = new ArrayList<Vertex>();

        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }

        list.add(pivot);

        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }

        return list;
    }

}
