package v2;

public class ConstraintNotEqual extends Constraint {

    @Override
    public boolean isConsistent(int x, int y) {
        /* TODO REVISE
        List<Integer> dTarget = target.getDefinitionRange();


        boolean consistentFlag = false;
        for(int sourceElem : source.getDefinitionRange()){
            int i = 0;
            while(!consistentFlag && i < dTarget.size()){
                consistentFlag = sourceElem != dTarget.get(i);
                i++;
            }
            if (!consistentFlag)
        }*/

        return x != y;
    }
}
