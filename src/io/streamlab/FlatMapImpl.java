package io.streamlab;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapImpl {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("ABC","ACB","BCA","BAC","CAB","CBA");
        System.out.println(Arrays.toString("ABC".split("")));
        System.out.println("-----------------");
        names.stream().map(word->word.split("")).forEach(name-> System.out.println(Arrays.toString(name)));
        System.out.println("-----------------");
        List<String> chs=names.stream().map(word->word.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        chs.forEach(System.out::println);
    }
}
