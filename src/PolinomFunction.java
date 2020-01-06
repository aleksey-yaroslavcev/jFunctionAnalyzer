public class PolinomFunction extends Function {

    PolinomFunction(int order){
        this.order=order;

        for (int i=0;i<=order;i++){
            setParam("a"+i,1);
        }

        description="Polinomial function of order " + order;
    }
    @Override
    public double value(double x) throws Exception {
        double res=0;
        double a;
        for(int i=0;i<=order;i++){
            res+=getParam("a"+i)*x;
        }
        return res;
    }

    protected final int order;
}
