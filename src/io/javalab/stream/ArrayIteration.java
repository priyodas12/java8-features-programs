package io.javalab.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayIteration {
    public static void main(String[] args) {
        Integer [] arr={11,22,39,42,5,6};

        //doubling the array element
        List<Integer> li=Arrays.asList(arr).stream().map(i->i*2).collect(Collectors.toList());

        Integer [] arr2=new Integer[li.size()];
        arr2=li.toArray(arr2);

        System.out.println(Arrays.toString(arr2));

        //sorting or array in natural order
        Arrays.asList(arr).stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        //sorting an array in reverse order
        Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
