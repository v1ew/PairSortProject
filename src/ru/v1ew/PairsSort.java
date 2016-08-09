package ru.v1ew;

import java.util.ArrayList;

/**
 * Created by Shakhov on 09.08.2016.
 */
public class PairsSort {
    public static ArrayList<Pair> sort(ArrayList<Pair> pairs) {
        if (pairs == null) return null; // В данном случае можно было бы вернуть пустой список или сген. исключение
        if (pairs.size() < 2) return pairs;

        ArrayList<Pair> newPairs = new ArrayList<>();
        newPairs.add(pairs.get(0));
        pairs.remove(0);
        boolean pairMoved;
        do {
            pairMoved = false;
            for (int i = 0; i < pairs.size(); ++i) {
                if (newPairs.get(0).getFirst().equals(pairs.get(i).getSecond())) {
                    newPairs.add(0, pairs.get(i));
                    pairMoved = true;
                } else if (newPairs.get(newPairs.size() - 1).getSecond().equals(pairs.get(i).getFirst())) {
                    newPairs.add(pairs.get(i));
                    pairMoved = true;
                }

                if (pairMoved) {
                    pairs.remove(i);
                    break;
                }
            }
        } while (pairs.size() > 0 && pairMoved);

        return newPairs;
    }
}
