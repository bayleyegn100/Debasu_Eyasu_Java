package com.company;

public class Operators {
    public int addition(int x, int y){
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        return  sum;
    }
    public int subtract(int x, int y){
        int dif = x - y;
        System.out.println(x + "-" + y + " = " + dif);
        return  dif;
    }
    public int multiply(int x, int y){
        int pro = x * y;
        System.out.println(x + " * " + y + " = " + pro);
        return  pro;
    }
    public int divide(int x, int y){
        int res = x / y;
        System.out.println(x + " / " + y + " = " + res);
        return  res;
    }
    public double addition(double x, double y){
        double sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
        return  sum;
    }
    public double subtract(double x, double y){
        double dif = x - y;
        System.out.println(x + "-" + y + " = " + dif);
        return  dif;
    }
    public double multiply(double x, double y){
        double pro = x * y;
        System.out.println(x + " * " + y + " = " + pro);
        return  pro;
    }
    public double divide(double x, double y){
        double res = x / y;
        System.out.println(x + " / " + y + " = " + res);
        return  res;
    }

    public static void main(String[] args) {
        Operators calculate = new Operators();
        calculate.addition(1, 1);
        calculate.subtract(23, 52);
        calculate.multiply(34, 2);
        calculate.divide(12, 3);
        calculate.divide(12, 7);
        calculate.addition(3.4, 2.3);
        calculate.multiply(6.7, 4.4);
        calculate.subtract(5.5, 0.5);
        calculate.divide(10.8, 2.2);
    }
}
