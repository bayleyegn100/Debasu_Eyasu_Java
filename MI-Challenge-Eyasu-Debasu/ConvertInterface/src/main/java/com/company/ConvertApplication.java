package com.company;

import java.util.Scanner;

public class ConvertApplication {
    public static void main(String[] args) {
        Converter ifConverter = new ConverterIf();
        Converter swithchConverter = new ConverterSwitch();

        Scanner scanner = new Scanner(System.in);

        System.out.println("If you give me a number I will let you know what month will relate with that number.");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0 || num > 7) {
            System.out.println("Enter an integer from 1 to 7.");
            num = Integer.parseInt(scanner.nextLine());

        } else {
            System.out.println(ifConverter.convertDay(num));
        }
    }
}

