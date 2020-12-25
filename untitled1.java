package org.example;

public class untitled1 {
    public static void main(String[] args) {
        oneTask();
        System.out.println("a * (b + (c / d)) = " + twoTask(1.2f, 2.4f, 3.34f, 4.21f));
        System.out.println(threeTask(4, 6));
        fourTask(3);
        System.out.println(fiveTask(4));
        sixTask("Таня");
        sevenTask(2020);
    }

    static void oneTask() {
        System.out.println("Задание 1.");
        boolean b = false;
        byte r = 0;
        char c = '*';
        short s = 2222;
        int i = 5;
        long l = 400000000L;
        float f = 23.455f;
        double d = 567.775;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + r);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

    static float twoTask(float a, float b, float c, float d) {
        System.out.println("\nЗадание 2.");
        return a * (b + (c / d));
    }

    static boolean threeTask(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void fourTask(int a) {
        System.out.println("\nЗадание 4.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");

    }

    static boolean fiveTask(int a) {
        System.out.println("\nЗадание 5.");
        if (a > 10 && a < 20) return true;
        else return false;

    }

    static void sixTask(String name){
        System.out.println("\nЗадание 6.");
        System.out.println("Привет" + name +"");
    }

    static void sevenTask(int year) {
        System.out.println("\nЗадание 7.");
        if (! (year/ 4 == 0) || ((year/ 100 == 0) && !(year/ 400 == 0))) System.out.println(year + "год не високосный");
        else System.out.println(year + "год високосный");
    }
}