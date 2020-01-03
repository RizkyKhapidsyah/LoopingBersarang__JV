package com.rizkykhapidsyah.loopingbersarang;

public class Main {
    public static void main(String[] args) {
        int i, j;

        System.out.println("---------");
        System.out.println("CONTOH 1");
        System.out.println("---------");

        for (i = 0; i < 5; i++) {
            System.out.print("Perulangan ke : " + i + " >> ");

            for (j = 0; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }


        System.out.println("\n---------");
        System.out.println("CONTOH 2");
        System.out.println("---------");

        for (i = 0; i < 5; i++) {
            System.out.print("Perulangan ke : " + i + " >> ");

            for (j = 0; j < 5; j++) {
                System.out.print("* ");

                if (i == j) {
                    break;
                }
            }

            System.out.print("\n");
        }


        System.out.println("\n---------");
        System.out.println("CONTOH 3");
        System.out.println("---------");

        for (i = 0; i < 5; i++) {
            System.out.print("Perulangan ke : " + i + " >> ");

            for (j = 0; j < 5; j++) {
                System.out.print("* ");

                if ((i + j) == 4) {
                    break;
                }
            }

            System.out.print("\n");
        }


        System.out.println("\n---------");
        System.out.println("CONTOH 4");
        System.out.println("---------");

        for (i = 0; i < 9; i++) {
            System.out.print("Perulangan ke : " + i + " >> ");

            for (j = 0; j < 9; j++) {
                System.out.print("* ");

                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }

            System.out.print("\n");
        }
    }
}
