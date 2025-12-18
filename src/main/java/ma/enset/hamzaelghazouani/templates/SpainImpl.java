package ma.enset.hamzaelghazouani.templates;

public class SpainImpl extends Template {
    @Override
    protected int param1() {
        return 9;
    }

    @Override
    protected double compute(int a, int b) {
        return a*b;
    }
}
