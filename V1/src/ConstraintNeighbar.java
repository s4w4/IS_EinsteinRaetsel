public class ConstraintNeighbar extends Constraint{
    @Override
    public boolean isConsistent(int x, int y) { return Math.abs(x - y) == 1; }
}
