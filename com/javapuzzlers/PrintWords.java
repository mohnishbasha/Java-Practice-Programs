package com.javapuzzlers;

public class PrintWords {

    public static void main(String[] args) {
        System.out.println(Words.FIRST + " " + Words.SECOND + " " + Words.THIRD);
    }
}

class Words {

    private Words() {}; // not initializable

    // public static final String FIRST = "the";
    // public static final String SECOND = null;
    // public static final String THIRD = "set";

    public static final String FIRST = "physics";
    public static final String SECOND = "chemistry";
    public static final String THIRD = "biology";

}
