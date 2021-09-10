package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 10000; i++) {
            d++;
            if (d == 9){
                d = 0;
                c++;
                if (c == 9){
                    c = 0;
                    b++;
                    if (b == 9){
                        b = 0;
                        a++;
                        if (a == 9){
                            a = 0;
                        }
                    }
                }
            }
            System.out.print(a);
            System.out.print(b);
            System.out.print(c);
            System.out.print(d);
            System.out.println("");
        }
        System.out.println("");
    }
}
