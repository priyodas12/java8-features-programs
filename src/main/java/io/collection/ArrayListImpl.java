package io.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListImpl {
    public static void main(String[] args) {
        List<Integer> failFastNumbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> failSafeNumbers=new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> itr= failFastNumbers.iterator();
        for(Iterator<Integer> itr1= failFastNumbers.iterator(); itr1.hasNext();){
            Integer i=itr1.next();
            if(i==3){
                failFastNumbers.remove(i);
            }
            System.out.println(i);
        }
    }
}
