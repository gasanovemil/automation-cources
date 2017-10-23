package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	String mon="Понедельник", tue="Вторник", wen="Среда", thu="Четверг", fri="Пятница", sat="Суббота", sun = "Воскресенье";
	int day;
	Scanner sc = new Scanner(System.in);
    System.out.println("Введите номер дня недели: ");
    day=sc.nextInt();
    switch (day) {
        case 1: day=1;
            System.out.println(mon);
            break;
        case 2: day=2;
            System.out.println(tue);
            break;
        case 3: day=3;
            System.out.println(wen);
            break;
        case 4: day=4;
            System.out.println(thu);
            break;
        case 5: day=5;
            System.out.println(fri);
            break;
        case 6: day=6;
            System.out.println(sat);
            break;
        case 7: day=7;
            System.out.println(sun);
            break;
        default:
            System.out.println("Введите значение от 1 до 7 ");
    }
    }
}
