package constraintSolver;

import java.util.List;

import entities.Arc;
import entities.SelfLoop;
import entities.Vertex;

public class ConstraintNet {
    private List<Arc> arcList;
    private List<Vertex> vertexList;
    private List<SelfLoop> selfLoopList;

    public ConstraintNet(List<Vertex> vertexList, List<Arc> arcList, List<SelfLoop> selfLoopList) {
        this.vertexList = vertexList;
        this.arcList = arcList;
        this.selfLoopList = selfLoopList;
    }

    public List<Arc> getArcList() {
        return arcList;
    }

    public void setArcList(List<Arc> arcList) {
        this.arcList = arcList;
    }

    public List<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public List<SelfLoop> getSelfLoopList() {
        return selfLoopList;
    }

    public void setSelfLoopList(List<SelfLoop> selfLoopList) {
        this.selfLoopList = selfLoopList;
    }
}
