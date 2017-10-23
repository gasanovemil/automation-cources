package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		int size;
		char star = '*';
		char space = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер ");
		size = sc.nextInt()-1;
		int size2 = size;
		int d=0;
		int size3= size;

		//задаем верхнюю точку
		for (int i = 0; i <= size2; i++) {
			System.out.print(space);
		}
		System.out.print(star);
		System.out.println();


		//задаем точки верхней части
		for (int m=0; m < size; m++) {
			for (int i = 0; i < size2; i++) {
				System.out.print(space);
			}
			System.out.print(star);

			for (int t=0; t<=d; t++) {
				System.out.print(space);
			}
			System.out.print(star);

			System.out.println();
			size2--;
			d=d+2;
			}

			//дошли до середины
			size2++;
		    d=d-4;

           //задаем точки нижней части
		    for (int b=0; b<size-1; b++) {
				for (int j = 0; j <= size2; j++) {
					System.out.print(space);
				}
				System.out.print(star);

				for (int q = 0; q <= d; q++) {
					System.out.print(space);
				}
				System.out.print(star);
				System.out.println();
				size2++;
				d=d-2;
			}

		//задаем нижнюю точку
		for (int i = 0; i <= size; i++) {
			System.out.print(space);
		}
		System.out.print(star);
		System.out.println();
			}
		}