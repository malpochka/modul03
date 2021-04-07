package by.epam.modul3.string;

import java.util.Scanner;

//Проверить, является ли заданное слово палиндромом.

public class Zadacha8StringBuilder {

	public static void main(String[] args) {
		String one;
		String two;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово");
		one = sc.nextLine();

		StringBuilder str;
		StringBuilder str2;

		str2 = new StringBuilder();
		str = new StringBuilder();

		str.append(one);
		str2.append(str.reverse());

		System.out.print(str2);

		two = str2.toString();

		if (one.equals(two)) {
			System.out.println(" -Слово является палиндромом");
		} else {
			System.out.println(" -Слово НЕ является палиндромом");
		}
	}
}
