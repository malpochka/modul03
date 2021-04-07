package by.epam.modul3.string;

import java.util.Scanner;

/*Вводится срока.Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".*/

public class Zadacha12StringBuilder {

	public static void main(String[] args) {
		String str;
		int idx;
		StringBuilder sb;
		
		sb= new StringBuilder();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку ");
		str = sc.nextLine();

		str = str.replaceAll(" +", "");
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			idx = str.indexOf(c, i + 1);
			if (idx == -1) {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}