package com.company.java;

public class Main {
    static int a=3;
    static int b;
    static {
        b=a*4;
    }
    static void math(int x){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);

    }

    public static void main(String[] args) {
	// write your code here
        math(42);

    }
}
