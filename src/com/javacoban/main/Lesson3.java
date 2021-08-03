package com.javacoban.main;


import java.util.Scanner;

public class Lesson3 {
    public static void Condition( float a ,float b,float c){
        if (a==0){
            if (b!=0){
                System.out.println("Equation has solution X=:  "+ (-c/b) );
            }
            else if (c==0){
                //Lúc này b=0
                System.out.println("Equation countless solution");
            }
            else{
                //Lúc này b=0 c!=0
                System.out.println("Equation not solution ");
            }
        }
        else {
            float Dnt = b*b-4*a*c;
            if (Dnt<0){
                System.out.println("Equation not solution");
            }
            else if(Dnt==0){
                System.out.println("Equation has one solution is: " + (-b/2*a));
            }
            else{
                System.out.println("Equation has two solution is: " + ((-b-Math.sqrt(Dnt))/2*a) + "\n          and "+ ((-b+Math.sqrt(Dnt))/2*a) );
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a,b,c !");
        Scanner scanner=new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        Condition(a,b,c);
    }
}
