package by.epam.modul3.string;


//Подсчитать сколько раз среди символов заданной строки встречается буква 'a'.

public class Zadacha10StringBuilder {

	public static void main(String[] args) {
		int count;
		count = 0;
		
		String str = new String("I have apple, apple is very tasty");

		char[] mass = str.toCharArray();

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] == 'a') {
				count++;
			}
		}
		System.out.print(count);

	}
}
