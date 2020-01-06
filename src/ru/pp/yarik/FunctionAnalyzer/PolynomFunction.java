package ru.pp.yarik.FunctionAnalyzer;

public class PolynomFunction extends Function {

    static final String POLYNOM_DESCRIPTION_PREFIX="Polinomial function of order ";
    static final String COEFF_PREFIX="a";
    static final double DEFAULT_COEFF=1;

    PolynomFunction(int order){
        this.order=order;

        for (int i=0;i<=order;i++){
            setCoeff(i,DEFAULT_COEFF);
        }

        setDescription(POLYNOM_DESCRIPTION_PREFIX + order);
    }

    public void setCoeff(int index, double coeff){
        setParam(COEFF_PREFIX+index,coeff);
    }
    public double getCoeff(int index) throws Exception {
        return getParam(COEFF_PREFIX+index);
    }

    @Override
    public double value(double x) throws Exception {
        double res=0;
        double a;
        for(int i=0;i<=order;i++){
            res+=getCoeff(i)*x;
        }
        return res;
    }

    protected final int order;
}
