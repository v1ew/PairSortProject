package ru.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.v1ew.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Shakhov on 09.08.2016.
 */
public class PairTest {
    @Test
    public void createPairCheck() {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("two", "three"));
        Assert.assertEquals("two", pairs.get(0).getFirst());
        Assert.assertEquals("three", pairs.get(0).getSecond());
    }

    @Test
    public void sortNullListCheck() {
        ArrayList<Pair> pairs = PairsSort.sort(null);
        assertNull(pairs);
    }

    @Test
    public void sortEmptyListCheck() {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs = PairsSort.sort(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void sortOnePairListCheck() {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("one", "two"));
        pairs = PairsSort.sort(pairs);
        assertEquals(1, pairs.size());
        assertEquals("one", pairs.get(0).getFirst());
    }

    @Test
    public void sortTwoPairsCheck() {
        ArrayList<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair("two", "three"));
        pairs.add(new Pair("one", "two"));
        pairs = PairsSort.sort(pairs);
        assertEquals("one", pairs.get(0).getFirst());
    }

    @Test
    public void sortPairsListCheck() {
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
        assertEquals("one", pairs.get(0).getFirst());
        assertEquals("21", pairs.get(pairs.size() - 1).getSecond());
        for (Pair pair: pairs) {
            System.out.println(pair);
        }
    }

    @Test
    public void arrayListCheck() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(0, i);
        }
        for (Integer i: list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}