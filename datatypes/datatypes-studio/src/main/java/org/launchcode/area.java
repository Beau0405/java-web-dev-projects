package org.launchcode;

import java.util.Scanner;

public class area {
    public static void main(String[] args){
    double radius;

    Scanner input;

    input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
    radius = input.nextDouble();
        input.close();

//    double pi= 3.14;
    double area= circle.getArea(radius);
    System.out.println("the area of a circle of radius "+ radius + " is: "+area);
}}
