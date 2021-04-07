package by.epam.modul3.string;

//В строке вставить после каждого символа 'a' символ 'b'.
public class Zadacha7StringBuilder {

	public static void main(String[] args) {
		StringBuilder str;
		int cd;
		cd = 0;
		str = new StringBuilder();
		str.append("I like Java");

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				cd = i;
				str.insert(cd + 1, 'b');
			}
		}
		System.out.print(str);
	}
}
