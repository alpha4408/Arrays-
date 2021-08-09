package com.apsucodes.datastructures;


import java.util.Arrays;

public class binarySerch {

    public static void main(String[] args) {
        int [] numbers = {1,3,5,9,4,1,2,5,6};
       int target = 20;
       biSerch(numbers,target);


    }
     static int biSerch( int [] numbers, int target) {

         Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length-1;

        while(left < right){

            int middle = left + (right-1) /2;

            if(numbers[middle]== target){
                return middle;

            }
            if (numbers[middle] < target){
                left = middle+ 1;
            }
            else{
                 right = middle- 1;
            }
        }

        throw new ArithmeticException(" Target Number not found");

    }

}
