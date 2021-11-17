package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int i , j , n , c;
//        System.out.println("Enter the number till which you want prime numbers");
//        n=sc.nextInt();
//        System.out.println("Prime numbers are :-");
//
//        for(i=2;i<=n;i++)
//        {
//            c=0;
//            for(j=1;j<=i;j++)
//            {
//                if(i%j==0)
//                {
//                    c++;
//                }
//            }
//
//            if(c==2)
//            {
//                System.out.print(i+" ");
//            }
//        }

        // ============

//        int space;        // The location of the space in the input.
//        String firstName; // The first name, extracted from the input.
//        String lastName;  // The last name, extracted from the input.
//
//        System.out.println();
//        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
//        System.out.println("Please enter your first name and last name, separated by a space.");
//        System.out.print("? ");
//        String str = sc.nextLine();
//
//        space = str.indexOf(' ');
//        firstName = str.substring(0, space);
//        lastName = str.substring(space + 1);
//
//        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));

        // =============

//        System.out.println("Enter a word");
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//
//        System.out.println("Enter anagram for previous word");
//        String anagram = sc.nextLine();
//
//        String s1 = word.replaceAll("\\s", "");
//        String s2 = anagram.replaceAll("\\s", "");
//
//        boolean status = true;
//        if (s1.length() != s2.length()) {
//            status = false;
//        } else {
//            char[] ArrayS1 = s1.toLowerCase().toCharArray();
//            char[] ArrayS2 = s2.toLowerCase().toCharArray();
//            Arrays.sort(ArrayS1);
//            Arrays.sort(ArrayS2);
//            status = Arrays.equals(ArrayS1, ArrayS2);
//        }
//        if (status) {
//            System.out.println(s1 + " and " + s2 + " are anagrams");
//        } else {
//            System.out.println(s1 + " and " + s2 + " are not anagrams");
//        }



//        List<Integer> number = new ArrayList<>(
//                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
//
//        System.out.println(
//                "Reverse order of given List :- ");
//
//        // the number list will be reversed using this method
//        Collections.reverse(number);
//
//        System.out.println(number);
//
//        new ReverseItems();



    }

    public static List<Integer> sortAndRemoveDuplicates(Integer[] arr) {

        Arrays.stream(arr).distinct().toArray();
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> sortedArr = new ArrayList<Integer>();

        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }

        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        return sortedArr;
    }

}



