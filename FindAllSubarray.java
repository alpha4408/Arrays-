package com.apsucodes.datastructures;

public class FindAllSubarray {


    public  void subbarrays(int arr []){


        int sum_subarrays = 0;
        for(int i =0; i< arr.length; i++){
            for(int j = i; j< arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.println(arr[k] +"");
                    sum_subarrays +=arr[k];

                }

                System.out.println("--------");

            }
        }
        System.out.println(sum_subarrays);
    }

    public static void main(String[] args)  {
        int arr [] = {1,2,3,4};
        //subbarrays(arr);
        new FindAllSubarray().subbarrays(arr);

    }
}
