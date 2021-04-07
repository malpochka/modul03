package by.epam.modul3.string;

//Из заданной строки получить новую повторив каждый символ дважды.
public class Zadacha11StringBuilder {

	public static void main(String[] args) {
		int j = 0;
		StringBuffer str = new StringBuffer("I like Java");
		System.out.println(str);

		char[] mass = new char[str.length()];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = str.charAt(i);
		}
		     for (int i = 0; i < mass.length; i++) {
			    str.insert(j + 1, mass[i]);
			     j = j + 2;
		      }
		System.out.println(str.toString());
	}
}
