package org.example;

import java.sql.SQLOutput;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        int total = 0;
        for(int i = 0; i <= n; i++){
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int total = 0;
        int i = 1;
        do{
            total += i;
            i++;
        } while(i <= n && total % 2 != 0);
        return total;
    }
}
