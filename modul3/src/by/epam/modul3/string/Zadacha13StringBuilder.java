package by.epam.modul3.string;

import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
 * Случай, когда длинных слов может быть несколько, не обрабатывать.
 */

public class Zadacha13StringBuilder {

	public static void main(String[] args) {
		String str1;
		String str2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку");
		str1 = sc.nextLine();

		String[] mass = str1.split(" ");
		str2 = mass[0];

		for (int i = 1; i < mass.length; i++) {
			if (str2.length() < mass[i].length()) {
				str2 = mass[i];
			}
		}
		System.out.println(str2);
	}
}