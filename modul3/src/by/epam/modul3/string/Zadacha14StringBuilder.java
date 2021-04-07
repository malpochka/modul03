package by.epam.modul3.string;

import java.util.Scanner;

/*Псчитать количество строчных(маленьких) и прописных(больших) букв в веденной строке.Учитывать только 
 * английские буквы.*/

public class Zadacha14StringBuilder {

	public static void main(String[] args) {
		StringBuilder str2;
		String str;
		int count;
		int count2;

		count = 0;
		count2 = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку, состоящую из английских букв");
		str = sc.nextLine();

		str2 = new StringBuilder();
		str2.append(str);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a') & (ch <= 'z')) {
				count++;
			} else if ((ch >= 'A') & (ch <= 'Z')) {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);

	}
}
