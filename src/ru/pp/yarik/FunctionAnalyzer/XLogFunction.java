package ru.pp.yarik.FunctionAnalyzer;

public class XLogFunction extends Function {

    private LineFunction line;
    private LogFunction log;

    public static String DESCRIPTION="x*log(x) function";
    public static double DEFAULT_LINE_A1=1;
    public static double DEFAULT_LINE_A0=0;
    public static double DEFAULT_LOG_A=1;

    public XLogFunction(){
        setDescription(DESCRIPTION);
        log.setA(DEFAULT_LOG_A);
        line.setA0(DEFAULT_LINE_A0);
        line.setA1(DEFAULT_LINE_A1);
    }

    @Override
    public double value(double x) throws Exception {
        return line.value(x)*log.value(x);
    }
}
