import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Vertex> vertexList;
    private boolean finish;

    public Solution(){
        this.finish = false;
        this.vertexList = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex vertex){
        vertexList.add(vertex);
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }
}
