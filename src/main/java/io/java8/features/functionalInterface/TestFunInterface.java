/*
 *  Created by - Priyobrato.Das {priyo91@outlook.com}
 *  Date: 01/06/24, 10:18 pm
 *  Project: java8-features-programs
 */

package io.java8.features.functionalInterface;

public class TestFunInterface {

    public static void main(String[] args) {
        FunInterface f1=i -> {
            return i*i*10;
        };

        System.out.println(f1.m1(10));
    }
}
