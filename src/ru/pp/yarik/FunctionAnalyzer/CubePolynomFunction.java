package ru.pp.yarik.FunctionAnalyzer;

public class CubePolynomFunction extends PolynomFunction{
    static final String DESCRIPTION="Cube polynomial function";
    static final int CUBE_ORDER=3;

    CubePolynomFunction() {
        super(CUBE_ORDER);
        setDescription(DESCRIPTION);
    }
}
