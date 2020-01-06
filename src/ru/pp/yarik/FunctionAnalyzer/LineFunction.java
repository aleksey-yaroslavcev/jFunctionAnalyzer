package ru.pp.yarik.FunctionAnalyzer;

public class LineFunction extends PolynomFunction {
    enum Parameter{
        A0,
        A1
    }
    static final String DESCRIPTION="Line function";
    static final int LINE_ORDER=1;

    public void setA1(double a1){
        setCoeff(Parameter.A1.ordinal(),a1);
    }
    public void setA0(double a0){
        setCoeff(Parameter.A0.ordinal(),a0);
    }
    public double getA1() throws Exception {
        return getCoeff(Parameter.A1.ordinal());
    }
    public double getA0() throws Exception {
        return getCoeff(Parameter.A0.ordinal());
    }

    LineFunction() {
        super(LINE_ORDER);
        setDescription(DESCRIPTION);
    }
}
