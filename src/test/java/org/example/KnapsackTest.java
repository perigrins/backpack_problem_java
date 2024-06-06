package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KnapsackTest {


    @org.junit.Test
    @Test
    public void testCorrectN() {
        Knapsack kp = new Knapsack(10,7,13);
        kp.Generate();
        Assert.assertEquals(10, kp.problemList.size());
    }

    @org.junit.Test
    @Test
    public void testBlankResult() {
        Knapsack kp = new Knapsack(0,7,13);
        kp.Generate();
        Assert.assertEquals(kp.problemList.size(), 0);
    }

    @org.junit.Test
    @Test
    public void testWeightInRange() {
        Knapsack kp = new Knapsack(5,7,8);
        kp.Generate();
        //kp.Show();
        kp.Sorting();
        kp.Fit();
        for(int i=0;i<5;i++){
            Assert.assertTrue(kp.problemList.get(i).weight >= 1);
            Assert.assertTrue(kp.problemList.get(i).weight <= 10);
        }
    }

    @org.junit.Test
    @Test
    public void testValueInRange() {
        Knapsack kp = new Knapsack(5,7,8);
        kp.Generate();
        //kp.Show();
        kp.Sorting();
        kp.Fit();
        for(int i=0;i<5;i++){
            Assert.assertTrue(kp.problemList.get(i).value >= 1);
            Assert.assertTrue(kp.problemList.get(i).value <= 10);
        }
    }

    @org.junit.Test
    @Test
    public void testWeigthSum() {
        Knapsack kp = new Knapsack(9,7,8);
        kp.Generate();
        kp.Sorting();
        kp.Fit();
        var weight_sum = 0;

        for (int i=0;i<kp.problemList.size();i++) {
            if (kp.problemList.get(i).inside) {
                weight_sum += kp.problemList.get(i).weight;
            }
        }
        Assert.assertTrue(weight_sum <= 8);
    }

}