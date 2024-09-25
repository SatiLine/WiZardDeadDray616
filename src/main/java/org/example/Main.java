package org.example;


import java.util.Scanner;

public class Main {

    public static String TaskOne(int n){
        if (n % 35 == 0) {
            return "fizzbuzz";
        } else if (n % 7 == 0) {
            return "buzz";
        } else if (n % 5 == 0) {
            return "fizz";
        } else {
            return Integer.toString(n);
        }
    }

    public static String TaskTwo(String n){
        String result = "";

        for(int i = n.length()-1; i >= 0; i--){
            result = result + n.charAt(i);
        }
        return result;
    }

    public static String TaskThree(int a, int b, int c){
        float eps = 1e-6f;

        if (Math.abs(a) < eps){
            if (Math.abs(b) < eps){
                if (Math.abs(c) < eps){
                    return "R"; // множество R
                }
                return "Нет корней уравнения";
            }
            return String.valueOf(-c/b);
        }
        float d = b * b - 4 * a * c; // дискриминант

        if (d >= eps){

            String x = (-b - Math.sqrt(d)) / (2 * a) + " " + (-b + Math.sqrt(d)) / (2 * a); // корни уравнения
            return x;
        }
        else
            return "Нет корней уравнения";
    }

    public static double TaskFour(double n, double m){
        double x = 1000; // член ряда
        double s = 0; // сумма ряда


        while(x > m){
            x = 1 / (Math.pow(n,2) + n -2);
            s += x;
            n++;
        }
        return s;
    }

    public static boolean TaskFive(String palindrom){

        for(int i = 0; i<= palindrom.length()/2; i++){
            if(palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Введите номер задания от 1 до 5:");
        Scanner scanner = new Scanner(System.in);
        int flag = scanner.nextInt();
        switch (flag ){
            case 1:
                System.out.println("TaskOne\nAnswer:");
                int number = 500;
                for (int i = 0; i <= number; i++) {
                    System.out.println(TaskOne(i));
                }
                break;
            case 2:
                System.out.println("TaskTwo\nAnswer:");
                String res2 = TaskTwo("make install");
                System.out.println(res2);
                break;
            case 3:
                System.out.println("TaskThree\nAnswer:");
                String res3 = TaskThree(2, -4, 1);
                System.out.println(res3);
                break;
            case 4:
                System.out.println("TaskFour\nAnswer:");
                double n = 2;
                double m = Math.pow(10,-6);
                double res4 = TaskFour(n,m);
                System.out.println(res4);
                break;
            case 5:
                System.out.println("Введите строку: ");
                boolean res5 = TaskFive("янеженя");
                System.out.println(res5);
                break;
            default:
                System.out.println("The task is missing");
        }

    }
}