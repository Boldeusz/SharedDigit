package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(32,27));
    }
    public static boolean hasSharedDigit(int one, int two){
        if ((one < 10) || (one > 99) || (two < 10) || (two > 99)){
            return false;
        }
        for (int i = one; i > 0; i /= 10){
            for (int j = two; j > 0; j /= 10){
                if (i % 10 == j % 10){
                    return true;
                }
            }
        }return false;
    }
}
