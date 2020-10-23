package io.javalab0;

public class TestFunInterface {

    public static void main(String[] args) {

        FunInterface f1=i -> {
            return i*i;
        };

        System.out.println(f1.m1(10));
    }
}
