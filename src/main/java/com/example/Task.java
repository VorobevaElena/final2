package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите уравнение");
           String str=scan.nextLine();
           String[] strings=str.split("");
           int x=0;
           for (int i=0; i<strings.length;i++) {
               if (strings[i].equals("x")) {
                   if (i == 2) {
                       if (strings[1].equals("+")) {
                           x = -Integer.parseInt(strings[i - 2]) + Integer.parseInt(strings[i + 2]);
                       } else if (strings[1].equals("-")) {
                           x = Integer.parseInt(strings[i - 2]) - Integer.parseInt(strings[i + 2]);
                       }
                   } else if (i == 0) {
                       if (strings[1].equals("+")) {
                           x = Integer.parseInt(strings[i + 4]) - Integer.parseInt(strings[i + 2]);
                       } else if (strings[1].equals("-")) {
                           x = -Integer.parseInt(strings[i + 4]) - Integer.parseInt(strings[i + 2]);
                       }
                   }
                   else {
                       if (strings[1].equals("+")) {
                           x = Integer.parseInt(strings[i - 4]) + Integer.parseInt(strings[i - 2]);
                       } else if (strings[1].equals("-")) {
                           x = Integer.parseInt(strings[i - 4]) - Integer.parseInt(strings[i - 2]);
                       }
               }
               }
           }
            System.out.println("Результат x = " + x);
        }
        }
