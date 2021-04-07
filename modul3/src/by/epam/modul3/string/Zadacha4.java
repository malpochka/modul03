package by.epam.modul3.string;

//В строке найти количество чисел.
public class Zadacha4 {

	public static void main(String[] args) {
		String s;
		int count;
		count = 0;

		s = "I have 25 apples,12 tomatos,16 cucumbers";
		
		s = s.replaceAll("[^0-9]+", " ");
		count= s.trim().split(" ").length;
		System.out.println(count);
	}
}
