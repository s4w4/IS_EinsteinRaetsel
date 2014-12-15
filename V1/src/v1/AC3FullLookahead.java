package v1;

import java.util.ArrayList;
import java.util.List;

public class AC3FullLookahead {
 
    private static boolean revise(Vertex vi, Vertex vj  ){
        boolean delete = false;
        List<Integer> deleteList = new ArrayList<>();
        for (int x : vi.getValueRange()){
            boolean consistent = false;
            for (int y : vj.getValueRange()){
                if(ConstraintNetz.getConstraint(vi,vj ).isConstant(x, y))
                    consistent = true;
            }
            if (!consistent) {
                delete = true;
                deleteList.add(x);
            }
        }
        vi.getValueRange().removeAll(deleteList);
        return delete;
    }

    public static boolean start(Vertex cv){
        List<Arc> q = ConstraintNetz.getAllArcsFromTarget(cv);
        boolean consistent = true;
        while (!q.isEmpty() && consistent){
            Arc vk_vm = selectAndDeleteArc(q);
            Vertex vk = vk_vm.getSource();
            Vertex vm = vk_vm.getTarget();
            if (revise(vk,vm )){
                q.addAll(ConstraintNetz.getAllArcsFromTarget(vk, q));
                consistent = !vk.getValueRange().isEmpty();
            }
        }
        return consistent;
    }

    private static Arc selectAndDeleteArc(List<Arc> q) {
        Arc arc = q.get(0);
        q.remove(0);
        return arc;
    }

}
