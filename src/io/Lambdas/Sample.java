package io.Lambdas;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(23,32,34,45,65,53,89);

        numbers.stream()
               // .map(num->Integer.toString(num))
               // .map(String::valueOf)//static method
                .map(e->e.toString())//instance method
                .forEach(System.out::println);

        int sum=numbers.stream()
                //order of argument is important
                .reduce(0,(total,e)->Integer.sum(e,total));

        // using method reference
        sum=numbers.stream()
                .reduce(0,Integer::sum);

        System.out.println("sum:: "+sum);

        String concatVal=numbers.stream()
                .map(String::valueOf)
                //.reduce("",(carry,e)->carry.concat(e));
                .reduce("",String::concat);

        System.out.println(concatVal);
    }
}
