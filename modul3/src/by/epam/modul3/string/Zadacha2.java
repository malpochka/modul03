package by.epam.modul3.string;

//Замените в строке все вхождения 'word' на 'letter'.
public class Zadacha2 {

	public static void main(String[] args) {
		String s;
		s = "Send me word,please! Send word!";
		String s2 = s.replace("word", "letter");
		System.out.println(s + ";");
		System.out.println(s2 + ";");

	}

}
