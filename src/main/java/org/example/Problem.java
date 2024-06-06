package org.example;

public class Problem {

    int value;
    int weight;
    boolean inside;
    double proportion;
    int id;

    Problem(int Id, int Weight, int Value)
    {
        id = Id;
        weight = Weight;
        value = Value;
        proportion = (double) value / weight;
    }


    @Override
    public String toString(){

        return "item " + id + ":   " + "v: " + value + "      w: " + weight + "      v/w: " +  String.format("%.02f", proportion) + "\n";

    }


}
