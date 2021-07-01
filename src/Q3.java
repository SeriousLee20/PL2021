/*
 * Author: Hui Xin
 * 07 May 2021
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        String [] numList = num.split(" ");

        //int number =0;
        //while(number <= Integer.parseInt(numList[0])){
        String MEOW = br.;
        //}

        int [] row = new int[Integer.parseInt(numList[1])];

        String s = "ME";

        for (int i = 0; i < row.length; i++) {

            int begin = br.nextInt();
            int last = br.nextInt();

            String sub = MEOW.substring(begin -1, last);
            int lastIndex = 0;
            int count = 0;
            while(lastIndex != -1){

                lastIndex = sub.indexOf(s,lastIndex);

                if(lastIndex != -1){
                    count ++;
                    lastIndex += s.length();
                }
            }
            System.out.println(count);

        }
    }
}
