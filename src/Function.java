import java.util.ArrayList;

public abstract class Function {

    public abstract double value(double x);
    public double[] values(double x1, double x2, double step){
        int count=1 + (int) ((x2-x1)/step);
        double[] result=new double[count];
        for(int i=0;i<count;i++){
            result[i]=value(x1);
            x1+=step;
        }
        return result;
    }

    public Point point(double x){
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

    protected ArrayList<String> paramNames;
    protected ArrayList<Double> paramValues;
    protected String description;
}
