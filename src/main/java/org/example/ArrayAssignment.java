package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAssignment {
    public static void main(String[] args) {
        double[] exmapleArray = {1,5,6,5,4,1};
        double summ = 0;
        double maximum = exmapleArray[0];
        int index = 0;
        for (int i = 0; i < exmapleArray.length; i++) {
            summ += exmapleArray[i];
            if( exmapleArray[i] > maximum){
                maximum = exmapleArray[i];
                index = i;
            }
        }
        System.out.println("Sum of all the values in given Array is: " + summ); // 22
        System.out.println(index); // 2

        System.out.println(Arrays.toString(toPower(4, 2))); // [0,1,4,9]
        System.out.println(Arrays.toString(toPower(5, 2))); // [0,1,4,9]
    }

    public static int[] toPower(int size, int power){
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            int value = (int)Math.pow(i,power);
            res[i] = value;
        }
        return res;
    }
}
