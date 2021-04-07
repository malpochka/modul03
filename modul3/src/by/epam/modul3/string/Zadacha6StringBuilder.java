package by.epam.modul3.string;

//Дан текст(строка).Найти наибольшее количество подряд идущих пробелов в нем.
public class Zadacha6StringBuilder {

	public static void main(String[] args) {
		String str;
		int max;
		int count;

		max = 0;
		count = 0;

		str = "  I have  learnt English for    3 month. ";

		char[] mass = str.toCharArray();

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == ' ') {
				count++;
			    } else {
				    count = 0;
			    }
			         if (count > max) {
				          max = count;
			}
		}
		System.out.print("Наибольшее количество идущих подряд пробелов: "+max);

	}
}
