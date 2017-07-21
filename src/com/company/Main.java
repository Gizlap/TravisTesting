package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(String.format("Hallo user {0}", Main.number()));
    }

    private static int number() {
        return 1+2;
    }


}
