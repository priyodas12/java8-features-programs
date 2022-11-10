package io.javalab1.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//flattening is referred to as merging multiple collections/arrays into one.
public class FlatMapImpl {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfAll=Arrays.asList(list1,list2,list3);

        listOfAll.stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
