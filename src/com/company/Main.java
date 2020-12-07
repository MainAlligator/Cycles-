package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите любое предложение:");
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String[] word = str.split(" ");
        System.out.println("Количество слов в строке: " + word.length);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }


    }
}





