public class Multiplication implements CalcOp{
    private float flt1 = 0, flt2 = 0;

    public Multiplication() {}

    public float getFlt1() {
        return this.flt1;
    }

    public float getFlt2() {
        return flt2;
    }

    public void setFlt1(float flt1) {
        this.flt1 = flt1;
    }

    public void setFlt2(float flt2) {
        this.flt2 = flt2;
    }

    @Override
    public float math(float flt1, float flt2) {
        return (flt1 * flt2);
    }

    @Override
    public String toString () {
        return ("First number is " + getFlt1() + ". Second number is " + getFlt2() + ". " + getFlt1() + " * " + getFlt2() + " equals " + math(getFlt1(), getFlt2()) + ".");
    }
}