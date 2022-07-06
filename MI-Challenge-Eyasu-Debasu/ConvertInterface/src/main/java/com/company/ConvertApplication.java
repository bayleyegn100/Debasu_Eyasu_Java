package com.company;

import java.util.Scanner;

public class ConvertApplication {
    public static void main(String[] args) {
        Converter ifConverter = new ConverterIf();
        Converter swithchConverter = new ConverterSwitch();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======            Converter by usingConverterif          =================");
        System.out.println("Enter a number I will let you know what day will relate with that number.");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("You entered number " + num + ": " + ifConverter.convertDay(num));
        System.out.println("Enter a number I will let you know what month will relate with that number.");
         num = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered number " + num +": " + ifConverter.convertMonth(num));
        System.out.println();
        System.out.println("=======             Converter by using ConverterSwitch               =================");
        System.out.println("Enter a number I will let you know what day will relate with that number.");
        num = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered number " + num + ": " + swithchConverter.convertDay(num));
        System.out.println("Enter a number I will let you know what month will relate with that number.");
        num = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered number " + num + ": " + swithchConverter.convertMonth(num));
        System.out.println("========   Thank you   =============");
//        if (num < 0 || num > 7) {
//            System.out.println("Enter an integer from 1 to 7.");
//            num = Integer.parseInt(scanner.nextLine());
//
//        } else {
//            System.out.println(ifConverter.convertDay(num));
//        }


    }
}

