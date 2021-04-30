package com.company;

public class Main {

    public static void main(String[] args) {

        int[] a = {5, 15, 23, 12, 11};
        int bigger = 0;

//        for (int i = 0; i < a.length; i++) {
//            if (bigger < a[i]) {
//                bigger = a[i];
//            }
//        }
//        System.out.println(bigger);

        for (int number : a) {                       // java foreach
            if (number == 12) {
                continue;
            }
            if (bigger < number) {
                bigger = number;
            }
            System.out.println(number);
        }
        System.out.println(bigger);


        String[] text = {"Hi", "World", "L", "J"};
        String bigLength = "";
        for (int i = 0; i < text.length; i++) {
            String s = text[i];
            if (bigLength.length() < s.length()) {
                bigLength = s;
            }
        }
        System.out.println(bigLength);


        int[] c = {5, 13, 2, 4, 55, 3, 1, 8};
        int big = 0;
        int bigl = 0;
        int q = c.length / 2;
        System.out.println(q);
        for (int i = 0; i < q; i++) {
            if (big < c[i]) {
                big = c[i];
            }
        }
        for (int i = q; i < c.length; i++) {
            if (bigl < c[i]) {
                bigl = c[i];
            }
        }
        System.out.println(big);
        System.out.println(bigl);


        /////////////////////---->>>>>


        int[][] abcd = {{1, 6, 3}, {18, 24, 12}, {55, 101, 12}, {31, 12, 1}};
        int topBig = 0;
        for (int i = 0; i < abcd.length; i++) {
            int[] inner = abcd[i];
            int bigg = 0;
            for (int j = 0; j < inner.length; j++) {
                if (bigg < inner[j]) {
                    bigg = inner[j];
                }
            }
            if (topBig < bigg) {
                topBig = bigg;

            }
        }
        System.out.println(topBig);

    }
}
