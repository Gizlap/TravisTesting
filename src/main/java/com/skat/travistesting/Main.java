package com.skat.travistesting;

public class Main {

    public static void main(String[] args) {
        TraMath math = new TraMath();

        System.out.println(String.format("Hallo user - {0} and {1}", math.firstNumber(), math.secondNumber()));
    }
}