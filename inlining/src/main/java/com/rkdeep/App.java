package com.rkdeep;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        long upto = Long.parseLong(args[0]);

        for(int i = 0; i < upto; i++) {
            int x = inline1();
        }
    }

    public static int inline1() {
        return inline2();
    }

    public static int inline2() {
        int x = 3;
        int y = inline3() + x;
        return y;
    }

    public static int inline3() {
        return inline4();
    }

    public static int inline4() {
        return 3;
    }
}
