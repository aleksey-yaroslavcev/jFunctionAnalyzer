package ru.pp.yarik.FunctionAnalyzer;

public class LogFunction extends Function {

    enum Parameter{
        A
    }

    public static final String DESCRIPTION="Logarifmic function";
    public static double DEFAULT_A=1;

    public LogFunction(){
        setA(DEFAULT_A);
        setDescription(DESCRIPTION);
    }

    public double getA() throws Exception {
        return getParam(Parameter.A.name());
    }

    public void setA(double  a){
        setParam(Parameter.A.name(),a);
    }

    @Override
    public double value(double x) throws Exception {
        return getA()*Math.log(x);
    }
}
