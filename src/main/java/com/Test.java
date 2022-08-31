package com;

public class Test {
    public static void main(String[] args) {
        int[] arr =  new int[]{0,1,2,3,5,8};
        int[] index = new int[]{1,4,0,1,0,3,5,4,0,1,2};
        String tell="";
        for (int i = 0; i < index.length; i++) {
            tell += arr[index[i]];
        }
        System.out.println(tell);
    }
}
