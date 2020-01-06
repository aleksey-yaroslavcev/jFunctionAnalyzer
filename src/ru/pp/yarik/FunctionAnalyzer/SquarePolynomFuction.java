package ru.pp.yarik.FunctionAnalyzer;

public class SquarePolynomFuction extends PolynomFunction {
    static final String DESCRIPTION="Square polynomial function";
    static final int SQUARE_ORDER=2;

    SquarePolynomFuction() {
        super(SQUARE_ORDER);
        setDescription(DESCRIPTION);
    }
}
