package ru.pp.yarik.FunctionAnalyzer;

public class SinFunction extends Function {
    enum Parameter{
        MAGNITUDE,
        PHASE,
        FREQUENCY
    }

    static final double DEFAULT_MAGNITUDE=1;
    static final double DEFAULT_PHASE=0;
    static final double DEFAULT_FREQUENCY=1;
    static final String DESCRIPTION="Sine function";

    public SinFunction() {
        setMagnitude(DEFAULT_MAGNITUDE);
        setPhase(DEFAULT_PHASE);
        setFrequency(DEFAULT_FREQUENCY);
        setDescription(DESCRIPTION);
    }

    private double getParam(final Parameter parameter) throws Exception {
        return getParam(parameter.name());
    }
    private void setParam(final Parameter parameter, double value){
        setParam(parameter.name(),value);
    }

    public double getMagnitude() throws Exception {
        return getParam(Parameter.MAGNITUDE);
    }
    public double getPhase() throws Exception {
        return getParam(Parameter.PHASE);
    }
    public double getFrequency() throws Exception {
        return getParam(Parameter.FREQUENCY);
    }
    public void setMagnitude(double magnitude){
        setParam(Parameter.MAGNITUDE,magnitude);
    }
    public void setPhase(double phase){
        setParam(Parameter.PHASE,phase);
    }
    public void setFrequency(double frequency){
        setParam(Parameter.FREQUENCY,frequency);
    }

    @Override
    public double value(double x) throws Exception {
        return getMagnitude()*Math.sin(getFrequency()*x+getPhase());
    }
}
