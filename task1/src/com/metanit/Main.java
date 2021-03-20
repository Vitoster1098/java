package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите x1");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        System.out.println("Введите y1");
        double y1 = in.nextDouble();
        System.out.println("Введите x2");
        double x2 = in.nextDouble();
        System.out.println("Введите y2");
        double y2 = in.nextDouble();
        System.out.println("Расстояние между двумя точками = " + distance(x1,y1,x2,y2));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
    }
}
