package com.example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MyClass {
    /**
     * */

    public static void main(String  [] arg0){
    boolean flag=true;
        System.out.println("dddddddddddd");

        Set<Integer> set = new HashSet<Integer>();

        Random random = new Random();
        while(flag){
            int number =random.nextInt(999);
            if(!(number+"").contains("0")) break ;
//               char [] chars=new char[number];
//            for (int i=0;i<chars.length;i++){
//                int number1 =random.nextInt(number);
//            }
//            int number1 =random.nextInt(number);
//            char [] chars=new char[number-2];

            set.add(number);
        }

        System.out.println("dddddddddddd"+set);
     int arr [] =new int[]{1,2,3,4,5,6,7,8,9};

        for (int i=0;i<3;i++){
            int number =random.nextInt(999);
            if(!(number+"").contains("0")) break ;
        }


    }
}
