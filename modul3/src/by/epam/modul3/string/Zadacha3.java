package by.epam.modul3.string;

//В строке найти количество цифр.
public class Zadacha3 {

	public static void main(String[] args) {
		String s;
		int count;
		count = 0;

		s = "123,Hello Belarus,2021 year will be better then 2020";

		char[] mass = s.toCharArray();

		for (int j = 0; j < mass.length; j++) {
			if ((mass[j] >= '0') & (mass[j] <= '9')) {
				count++;
			}
		}
		System.out.print(count);

	}
}
