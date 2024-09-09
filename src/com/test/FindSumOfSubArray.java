package com.test;

public class FindSumOfSubArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        int k =3;
        int result =0;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length-1; j++) {
                sum = sum + k;
                if(sum == k)
                    result++;
            }

        }
        System.out.println("Number of Sum of Subarray upto "+k +" is "+result);
    }

}
