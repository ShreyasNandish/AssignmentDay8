package com.bridgelabz.AssignmentDay8;

import java.util.Scanner;

public class LineComparsion {

    double x1,x2,y1,y2;

    public double length()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for x1 :");
        x1=sc.nextInt();
        System.out.println("Enter the value for y1 :");
        y1=sc.nextInt();
        System.out.println("Enter the value for x2 :");
        x2=sc.nextInt();
        System.out.println("Enter the value for y2 :");
        y2=sc.nextInt();

        return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison program ");

        LineComparsion length=new LineComparsion();
        double len=length.length();
        System.out.println("The Length of Line is :"+len);

    }
}
