package v1;

public enum Constraint {
    EQUALS,
    NOT_EQUALS,
    NEIGHBARS,
    LEFT_NEIGHBAR,
    RIGHT_NEIGHBAR;

    private Constraint constraint;

    private Constraint(){
        this.constraint = this;
    }

    public boolean isConstant(int value1, int value2){
        switch (this){
            case EQUALS:
                // wenn value1 und value2 gleiche Position haben -> true
                // sonst false
                return value1 == value2;
            case NOT_EQUALS:
                // wenn value1 und value2 ungleiche Position haben -> true
                // sonst false
                return value1 != value2;
            case NEIGHBARS:
                // wenn value1 und value2 Nachbarn sind -> true
                // sonst false
                return Math.abs(value1-value2) == 1;
            case LEFT_NEIGHBAR:
                // wenn value1 linker Nachbar von value2 ist -> true
                // sonst false
                return value2 - value1 == 1;
            case RIGHT_NEIGHBAR:
                // wenn value1 rechter Nachbar von value2 ist -> true
                // sonst false
                return value1 - value2 == 1;
            default:
                return false;
        }
    }
}
