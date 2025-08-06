package com.java.ArrayF;

public class sort {
    public static void main(String[] args) {
        int [] arr = {6,7,8,9,90};
        boolean issort = true;

        for(int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                issort=false;
                break;
            }
        }
        if(issort){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }

        }
    }

