package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] oper = {"+", "-", "/", "*"};
        int num1 = 1;
        int num2 = 1;
        int otvet = 0;
        String rimotvet;
        int sluch = 0;
        String[] nums = {};
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();

        if (ex.contains("+")) {
            nums = ex.split("\\+");
        } else if (ex.contains("-")) {
            nums = ex.split("\\-");
        } else if (ex.contains("/")) {
            nums = ex.split("\\/");
        } else if (ex.contains("*")) {
            nums = ex.split("\\*");
        }

        String[] roman = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        for (int n = 0; n < roman.length; n++)
            if (Arrays.asList(roman).contains(nums[0]) && Arrays.asList(roman).contains(nums[1])){
                sluch = 1;
            }else if ((Arrays.asList(roman).contains(nums[0]) || Arrays.asList(roman).contains(nums[1]))){
                sluch = 2;
            } else {
                num1 = Integer.parseInt(nums[0]);
                num2 = Integer.parseInt(nums[1]);
                sluch = 3;
            }
        if (sluch == 1){
            if (nums[0].equals("I")) {
            num1 = 1;
        } else if (nums[0].equals("II")) {
            num1 = 2;
        } else if (nums[0].equals("III")) {
            num1 = 3;
        } else if (nums[0].equals("IV")) {
            num1 = 4;
        } else if (nums[0].equals("V")) {
            num1 = 5;
        } else if (nums[0].equals("VI")) {
            num1 = 6;
        } else if (nums[0].equals("VII")) {
            num1 = 7;
        } else if (nums[0].equals("VIII")) {
            num1 = 8;
        } else if (nums[0].equals("IX")) {
            num1 = 9;
        } else if (nums[0].equals("X")) {
            num1 = 10;
        } else{
            sluch = 2;
        }
        if (nums[1].equals("I")) {
            num2 = 1;
        } else if (nums[1].equals("II")) {
            num2 = 2;
        } else if (nums[1].equals("III")) {
            num2 = 3;
        } else if (nums[1].equals("IV")) {
            num2 = 4;
        } else if (nums[1].equals("V")) {
            num2 = 5;
        } else if (nums[1].equals("VI")) {
            num2 = 6;
        } else if (nums[1].equals("VII")) {
            num2 = 7;
        } else if (nums[1].equals("VIII")) {
            num2 = 8;
        } else if (nums[1].equals("IX")) {
            num2 = 9;
        } else if (nums[1].equals("X")) {
            num2 = 10;
        }else{
            sluch = 2;
        }
        } else if (sluch == 3){
            if (num1 > 10){
                sluch = 4;
            }else if(num2 > 10){
                sluch = 2;
            }
        }

        int operIndex = 0;
        for (int i = 0; i < oper.length; i++) {
            if (ex.contains(oper[i])) {
                operIndex = i;
            }
            switch (operIndex) {
                case 0:
                    otvet = num1 + num2;
                    break;
                case 1:
                    otvet = num1 - num2;
                    break;
                case 2:
                    otvet = num1 / num2;
                    break;
                case 3:
                    otvet = num1 * num2;
                    break;
            }

            int num3= Integer.parseInt(nums[2]);
            if (num3<1000000) {
                sluch=2;
            }
            if (otvet<0){
                sluch = 2;
            }
        }if (sluch == 1){
            if (otvet == 0){
                sluch=2;
            }
        }
        if (sluch == 1){
            rimotvet =(roman[otvet]);
        System.out.println(rimotvet);
        }else if(sluch == 2){
             throw new IOException();
        }else if(sluch == 3){
         System.out.println(otvet);
    }else if(sluch == 4){
            System.out.println("Введите числа меньше 11");
        }
    }
}














