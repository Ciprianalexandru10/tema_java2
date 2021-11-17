package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//5. Scrieti un program care sa inverseze elementele dintr-o lista.
//Examplu: list 25->40->63->81, reversed list 81->63->40->25

public class ReverseItems {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList( 25, 40, 63, 81 ));
        System.out.println(
                "Reverse order of given List : ");

        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
