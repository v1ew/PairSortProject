package ru.v1ew;

import java.util.ArrayList;

/**
 * Created by Shakhov on 09.08.2016.
 */
public class PairsSortTest {
    public static void main (String[] args) {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("one", "two"));
        pairs.add(new Pair("four", "five"));
        pairs.add(new Pair("seven", "8"));
        pairs.add(new Pair("five", "six"));
        pairs.add(new Pair("three", "four"));
        pairs.add(new Pair("two", "three"));
        pairs.add(new Pair("12", "13"));
        pairs.add(new Pair("19", "20"));
        pairs.add(new Pair("15", "16"));
        pairs.add(new Pair("18", "19"));
        pairs.add(new Pair("20", "21"));
        pairs.add(new Pair("9", "10"));
        pairs.add(new Pair("six", "seven"));
        pairs.add(new Pair("13", "14"));
        pairs.add(new Pair("11", "12"));
        pairs.add(new Pair("17", "18"));
        pairs.add(new Pair("10", "11"));
        pairs.add(new Pair("14", "15"));
        pairs.add(new Pair("8", "9"));
        pairs.add(new Pair("16", "17"));
        pairs = PairsSort.sort(pairs);
        for (Pair pair: pairs) {
            System.out.println(pair);
        }
    }
}
