package model.genetic.tree.functions;

/**
 * Created by saruman on 2.07.2017.
 */
public class Mul extends ZeroFunc{

    @Override
    public double execute(double varA, double varB) {
        return varA * varB;
    }
}