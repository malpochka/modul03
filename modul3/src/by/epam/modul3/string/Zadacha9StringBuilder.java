package by.epam.modul3.string;

//C помощью функции коприования и операции конкатенации составить из частей слова "информатика" слово "торт"
public class Zadacha9StringBuilder {

	public static void main(String[] args) {
		
		String str1 = new String("информатика");

		char[] str2 = new char[1];
		char[] str3 = new char[2];

		str1.getChars(7, 8, str2, 0);
		str1.getChars(3, 5, str3, 0);

		String s = new String(str2);
		String s2 = new String(str3);

		System.out.println(s + s2 + s);

	}
}
