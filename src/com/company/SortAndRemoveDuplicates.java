package com.company;

import java.util.*;


public class SortAndRemoveDuplicates {

    public static void main(String[] args) {

        Integer[] arr = new Integer[] { 1, 5, 2, 7, 8, 3, 4, 5, 6, 7, 7 };
        Arrays.stream(arr).distinct().toArray();
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
