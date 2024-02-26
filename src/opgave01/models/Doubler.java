package opgave01.models;

public class Doubler implements IntFunction {
    @Override
    public int apply(int a) {
        return a * 2;
    }
}
