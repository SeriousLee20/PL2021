/*
 * Author: Hui Xin
 * 07 May 2021
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner meow = new Scanner(System.in);

        int n = meow.nextInt();

        meow.nextLine();
        String numbers = meow.nextLine();

        String[] numArray = numbers.split(" ");

        ArrayList <Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String x = numArray[i];
           numList.add(Integer.parseInt(x));
        }

        Collections.sort(numList);

        //second smallest
        System.out.print(numList.get(1) + " ");

        //median
        //even = n/2
        //odd = (n+1)/2

        double median = 0;

        if (n % 2 != 0) {
            median =  numList.get(n/2);
        }else{

            median = (numList.get((n-1)/2) + numList.get((n+1)/2))/2.0;
        }

        if(median - Math.floor(median) != 0)
            System.out.print(median + " ");
        else
            System.out.print((int) median + " ");

        //second largest

        System.out.println(numList.get(n - 2));
    }
}
