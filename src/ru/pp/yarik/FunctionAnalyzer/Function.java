package ru.pp.yarik.FunctionAnalyzer;

import java.util.ArrayList;

public abstract class Function {

    static final String NO_SUCH_PARAM_MESSAGE="No such parameter";

    public abstract double value(double x) throws Exception;
    public double[] values(double x1, double x2, double step) throws Exception {
        int count=1 + (int) ((x2-x1)/step);
        double[] result=new double[count];
        for(int i=0;i<count;i++){
            result[i]=value(x1);
            x1+=step;
        }
        return result;
    }

    public Point point(double x) throws Exception {
        return new Point(x,value(x));
    }

    public String[] getParamNames() {
        String[] strings = new String[paramNames.size()];
        paramNames.toArray(strings);
        return strings;
    }

    public String getDescription() {
        return description;
    }
    protected void setDescription(String description) {
        this.description = description;
    }

    public void setParam(final String name, double value){
        for (String paramName:paramNames){
            if (paramName.equals(name)){
                paramValues.set(paramNames.indexOf(name), value);
                return;
            }
        }
        paramNames.add(name);
        paramValues.add(value);
    }
    public double getParam(final String name) throws Exception {
        for (int i=0;i<paramNames.size();i++){
            if (paramNames.get(i).equals(name)){
                return paramValues.get(i).doubleValue();
            }
        }
        throw new Exception(NO_SUCH_PARAM_MESSAGE);
    }

    private ArrayList<String> paramNames;
    private ArrayList<Double> paramValues;
    private String description;
}
