package io.reactive;

import java.util.Arrays;
import java.util.stream.Collectors;
//functional: declarative + higher order functions.
//reactive: elastic + message-driven + responsive + resilient
public class ReactiveTest {
    private static boolean isEven(int i){
        System.out.println(i);
        return i%2==0;
    }
    public static void main(String[] args) {
        var numbers= Arrays.asList(1,2,3,4,5,6);
        var doubledNumbers=numbers.parallelStream().filter(ReactiveTest::isEven).map(n->n*2).collect(Collectors.toList());
        System.out.println(doubledNumbers);
    }
}

