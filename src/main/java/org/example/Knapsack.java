package org.example;

import java.awt.*;
import java.sql.Array;
import java.util.*;

public class Knapsack
{
    int n;                      // number of items
    int seed;
    int lower_limit = 1;
    int upper_limit = 10;
    int capacity;
    ArrayList<Problem> problemList = new ArrayList<Problem>();
    Random random = new Random();
    ArrayList <Problem> temp = new ArrayList<Problem>();

    Knapsack(int N, int Seed, int Capacity){
        n = N;
        seed = Seed;
        capacity = Capacity;
    }

    int nextInt(int lower_limit, int upper_limit){
        return random.nextInt((upper_limit+1) -lower_limit) + lower_limit;
    }

    public void Generate(){
        for(int i = 0; i < n; i++){
            problemList.add(new Problem(i+1,
                    nextInt(lower_limit, upper_limit), nextInt(lower_limit, upper_limit)));
        }
    }

    public void Show()
    {
        for (int i = 0; i < problemList.size(); i++)		// nr albo items.Length()
        {
            problemList.toString();
        }
    }

    public String Show2(){
        return problemList.toString();
    }

    public void Sorting(){
        problemList.sort((s1, s2) ->
                Double.compare(s2.proportion, s1.proportion));
    }

    public String Fit(){
        Sorting();
        int weight_sum = 0;
        int i = 0;

        while(i < n)
        {
            if (weight_sum + problemList.get(i).weight <= capacity) {
                problemList.get(i).inside = true;
                temp.add(problemList.get(i));
                weight_sum += problemList.get(i).weight;
            }
            else {
                i++;
            }
        }

        return temp.toString();
    }

    public String Result(){
        var value_sum = 0;
        var weight_sum = 0;

        for (int i=0; i<temp.size(); i++) {
            value_sum += temp.get(i).value;
            weight_sum += temp.get(i).weight;
        }
        return "total weight: " + weight_sum + "\ntotal value: " + value_sum;
    }

}
