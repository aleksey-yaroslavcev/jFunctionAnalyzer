package ru.pp.yarik.FunctionAnalyzer;

public class LineFunction extends PolynomFunction {
    static final String DESCRIPTION="Line function";
    static final int LINE_ORDER=1;

    LineFunction() {
        super(LINE_ORDER);
        setDescription(DESCRIPTION);
    }
}
