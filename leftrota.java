package com.apsucodes.datastructures;

import java.util.Arrays;

public class leftrota {
    public static void main(String[] args) {
        int d = 3;
        int num [] = {1,2,3,4,5,6,7,8,9};
        rotate(num,d);


    }

    static  int [] rotate(int num [], int d){

        int [] newrotate = new int [num.length];

      for(int i = 0; i< num.length; i++){
          int j = (i + num.length - d) % num.length;
          newrotate[j] = num[i];

      }
        System.out.println(Arrays.toString(newrotate));
      return newrotate;


    }
}
