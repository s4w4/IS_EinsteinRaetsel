public class ConstraintLeftNeighbar extends Constraint{
    @Override
    public boolean isConsistent(int x, int y) { return (x - y) == 1; }
}