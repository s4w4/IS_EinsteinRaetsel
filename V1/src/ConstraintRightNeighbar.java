public class ConstraintRightNeighbar extends Constraint{
    @Override
    public boolean isConsistent(int x, int y) { return (y - x) == 1; }
}