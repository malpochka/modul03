package by.epam.modul3.string;

/*Удалить в строке все лишние пробелы, т.е. серии идущих подря пробелов, заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить. */

public class Zadacha5 {

	public static void main(String[] args) {
		String s;

		s = " Hello Belarus,  2021   year will be   better then 2020! ";
		s = s.replaceAll(" +", " ");
		s = s.trim();

		System.out.println(s);

	}
}
