
package com.company;
        import java.util.*;
        import java.lang.*;
        import java.io.*;


public class Main {

    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton",
                "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
                "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };


int[] timerun = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

     //сортировка
        for (int i = timerun.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (timerun[j] > timerun[j + 1]) {
                    int t = timerun[j];
                    timerun[j] = timerun[j + 1];
                    timerun[j + 1] = t;

                    String l= names[j];
                    names[j] = names [j+1];
                    names[j+1]=l;

                }
            }

        }

      //вывод списка всех бегунов и их времени
        for (int u=0; u<timerun.length; u++ )
        {
            System.out.println(names[u] + " - " + timerun[u]);
        }


        //Вывод бегуна и его времени по указанному месту
        int place;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите место бегуна ");
        place=sc.nextInt();

        System.out.println(timerun[place-1]+ "-" + names[place-1]);

        // Прибежал вторым
        System.out.println("Прибежал вторым :"+ names[1] + "-"+ timerun[1]);

        //Победитель марафона
        int timeofwinner=timerun[10];

        for (int i=0; i<timerun.length; i++){
            if (timerun[i]<timeofwinner)
                timeofwinner=timerun[i];

        }
        System.out.println("Победитель марафона: " + timeofwinner);
        }
    }




