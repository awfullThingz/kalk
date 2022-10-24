package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String ex = scanner.nextLine();
        System.out.println(calc(ex));
    }

    public static String calc(String ex)  {
        String[] oper = {"+", "-", "/", "*"};
        int num1 = 1;
        int num2 = 1;
        int otvet = 0;
        int sluch = 0;
        String[] nums = {};
        String itogtvet = null;

            if (ex.contains("+")) {
                nums = ex.split("\\+");
            } else if (ex.contains("-")) {
                nums = ex.split("\\-");
            } else if (ex.contains("/")) {
                nums = ex.split("\\/");
            } else if (ex.contains("*")) {
                nums = ex.split("\\*");
            }

            String[] roman = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

            for (int n = 0; n < roman.length; n++)
                if (Arrays.asList(roman).contains(nums[0]) && Arrays.asList(roman).contains(nums[1])) {
                    sluch = 1;
                } else if ((Arrays.asList(roman).contains(nums[0]) || Arrays.asList(roman).contains(nums[1]))) {
                    sluch = 2;
                } else {
                    num1 = Integer.parseInt(nums[0]);
                    num2 = Integer.parseInt(nums[1]);
                    sluch = 3;
                }
            if (sluch == 1) {
                switch (nums[0]){
                    case "I":
                        num1 = 1;
                    break;
                    case "II":
                        num1 = 2;
                    break;
                    case "III":
                        num1 =3;
                        break;
                    case "IV":
                        num1 = 4;
                        break;
                    case "V":
                        num1 = 5;
                        break;
                    case "VI":
                        num1 = 6;
                        break;
                    case "VII":
                        num1 = 7;
                        break;
                    case "VIII":
                        num1 = 8;
                        break;
                    case "IX":
                        num1 = 9;
                        break;
                    case "X":
                        num1 =10;
                        break;
                    default:
                        sluch =2;
                }switch (nums[1]){
                    case "I":
                        num2 = 1;
                        break;
                    case "II":
                        num2 = 2;
                        break;
                    case "III":
                        num2 =3;
                        break;
                    case "IV":
                        num2 = 4;
                        break;
                    case "V":
                        num2 = 5;
                        break;
                    case "VI":
                        num2 = 6;
                        break;
                    case "VII":
                        num2 = 7;
                        break;
                    case "VIII":
                        num2 = 8;
                        break;
                    case "IX":
                        num2 = 9;
                        break;
                    case "X":
                        num2 =10;
                        break;
                    default:
                        sluch =2;
                }

            } else if (sluch == 3) {
                if (num1 > 10) {
                    sluch = 2;
                } else if (num2 > 10) {
                    sluch = 2;
                }
            }

            int operIndex = 0;
            for (int i = 0; i < oper.length; i++) {
                if (ex.contains(oper[i])) {
                    operIndex = i;
                }
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

            if (nums.length > 2) {
                sluch = 2;
            }
            if (otvet < 0) {
                sluch = 2;
            }
            if (sluch == 1) {
                if (otvet == 0) {
                    sluch = 2;
                }
            }
            if (sluch == 1) {
                itogtvet = (roman[otvet]);
            } else if (sluch == 2) {
                throw new IllegalArgumentException("");
            } else if (sluch == 3) {
                itogtvet = String.valueOf(otvet);
            }
            return itogtvet;
        }
    }















