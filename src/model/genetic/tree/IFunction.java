package model.genetic.tree;

/**
 * Created by saruman on 2.07.2017.
 */
public interface IFunction {
    public double execute(double varA, double varB);
    public String getSymbol();
    public IFunction clone();
}
