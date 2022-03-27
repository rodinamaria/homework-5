package com.company;

public class Main {

    public static void main(String[] args) {
        // write   int value = 10;
        //        int [] values = {1, 5, 6, 8, 9};
        //        System.out.println(values[2]);
        //        values[3] = 18;
        //        System.out.println(values[3]);your code here

        // public static void main(String[] args) {
        //        int[] values = {1, 5, 7, 9, 11};
        //        printArray(values);
        //        printArrayReverse(values);
        //    }
        //
        //    public static void printArrayReverse(int[] values){
        //        for (int i = values.length - 1; i >= 0 ; i--) {
        //            System.out.print(values[i] + " ");
        //        }
        //        System.out.println();
        //    }
        //    public static void printArray(int[] values) {
        //        for (int i = 0; i < values.length; i++) {
        //            System.out.print(values[i] + " ");
        //        }
        //        System.out.println();
        //    }

//
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();

        int y = numbers[numbers.length - 1];
        for (; y > 0; y--) {
            if (numbers.length - 1 > y) {
                System.out.print(y + " ");
            } else {
                System.out.print(y + ", ");
            }
        }
        System.out.println();
//
        double[] doubles = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < doubles.length; i++) {
            if (i < doubles.length - 1) {
                System.out.print(doubles[i] + ", ");
            } else {
                System.out.print(doubles[i]);
            }
            System.out.println();
        }

            double d = doubles[doubles.length - 1];
            for (; d > 0; d--) {
                if (doubles.length - 1 > d) {
                    System.out.print(d + " ");
                } else {
                    System.out.print(d + ", ");
                }
                System.out.println();
            }

//
            String[] seasons = new String[]{"winter", "spring", "summer", "autumn"};
           for (int i = 0; i < seasons.length; i++) {
                System.out.print(seasons[i] + ", ");
            }
            System.out.println();

           for (int i = seasons.length - 1; i >= 0; i--) {
                System.out.print(seasons[i] + ", ");
            }
            System.out.println();
        }


    }



