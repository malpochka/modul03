package by.epam.modul3.string;

import java.util.Scanner;

/*Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком.Определить количество предложений в строке. */

public class Zadacha15StringBuilder {

	public static void main(String[] args) {
		String str;
		int count;

		count = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку");
		str = sc.nextLine();

		String[] proposition = str.split("[.\\!\\?]");
		for (int i = 0; i < proposition.length; i++) {
			count++;

			System.out.println(proposition[i]);
		}
		System.out.println(count);
	}
}
