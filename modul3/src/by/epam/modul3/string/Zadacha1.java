package by.epam.modul3.string;

//Дан массив названий переменных в camelCase.Преобразовать названия в snake_case.
public class Zadacha1 {

	public static void main(String[] args) {
		String[] word;
		String[] word2;
		int numer1;
		int numer2;
		int numer3;

		word = new String[] { "newDog", "oldCat", "youngMouse" };

		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + "; ");
		}

		numer1 = number(word[0]);
		numer2 = number(word[1]);
		numer3 = number(word[2]);

		word2 = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			word2[i] = word[i].toLowerCase();

		}
		System.out.println();
		System.out.println();

		StringBuffer sb1;
		StringBuffer sb2;
		StringBuffer sb3;

		sb1 = new StringBuffer(word2[0]);
		System.out.print(sb1.insert(numer1, "_") + "; ");

		sb2 = new StringBuffer(word2[1]);
		System.out.print(sb2.insert(numer2, "_") + "; ");

		sb3 = new StringBuffer(word2[2]);
		System.out.print(sb3.insert(numer3, "_") + "; ");
	}

	public static int number(String mass1) {
		int cd;
		int count;

		cd = 0;
		count = 0;

		char[] helloArray = mass1.toCharArray();

		for (int j = 0; j < helloArray.length; j++) {

			if ((helloArray[j] >= 'a') & (helloArray[j] <= 'z')) {
				count++;

			} else {
				break;
			}
		}
		cd = count;
		count = 0;

		return cd;
	}
}
