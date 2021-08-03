package com.javacoban.main;

import java.util.Scanner;

public class Lesson2 {

        public static void main(String[] args) {
            //1
            System.out.println("HelloWorld");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length:");
            int length = scanner.nextInt();
            System.out.println("a = " + length);
            System.out.println("Enter width:");
            int width = scanner.nextInt();
            System.out.println("b = " + width);
            System.out.println("Enter height:");
            int height = scanner.nextInt();
            int V = calculateVolume(length, width, height);
            System.out.println("Volume is : " + V);
            //2
            int Ssr = calculateSurroundArea(length, width, height);
            System.out.println("SurroundArea is : " + Ssr);

        }

        public static int calculateVolume(int length, int width, int height) {
            return length * width * height;
        }

        public static int calculateSurroundArea(int length, int width, int height) {
            return 2 * height * (length + width);
        }
    }




