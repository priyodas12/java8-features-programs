package io.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        //Map<Integer,Integer> numberMap=new HashMap<>();
        HashMap<Integer,Integer> numberMap=new HashMap<>();
        numberMap.put(1,10);
        numberMap.put(6,65);
        numberMap.put(2,11);
        numberMap.put(3,12);
        numberMap.put(null,13);
        numberMap.put(4,null);
        numberMap.put(5,null);
        numberMap.forEach((k,v)-> System.out.println(k+"=>"+v));
    }
}
