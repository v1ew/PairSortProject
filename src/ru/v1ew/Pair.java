package ru.v1ew;

/**
 * Created by Shakhov on 09.08.2016.
 */
public class Pair {
    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getSecond() {
        return second;
    }

    public String getFirst() {
        return first;
    }

    public String toString() {
        return first + " " + second;
    }

    private String first;
    private String second;
}
