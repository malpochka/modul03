package by.epam.modul3.string;

import java.util.regex.Pattern;

/*Создать приложение, разбирающее текст (текст хранится в строке) и позовляющее выполнять с текстом три различные
 * операции:
 * 1)отсортировать абзацы по количеству предложений;
 * 2)в каждом предложении отсортировать слова по длине;
 * 3)отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства-
 * по алфавиту. */

public class Zadacha16PattrenMatcher {

	public static void main(String[] args) {
		String str = new String("In 1605 King James the First was on the throne."
				+ "Some catholics planned to blow up the Houses of Parliament. "
				+ "Gunpowder was to be exploded by a man called Guy Fawkes. "
				+ "But he was discovered, arrested and later hanged. "
				+ "Since that day the British celebrate the 5th of November by burning a dummy.\r\n"
				+ "Christmas Day is on the 25th of December."
				+ "Families decorate their houses with brightly coloured paper or holly, and they usually have a Christmas tree."
				+ " Family members leave gifts at the bottom a Christmas tree on Christmas Eve, 24th of December be found in the morning.\r\n"
				+ "January has a nice holiday New Year's Day. "
				+ "The most famous celebration is in Piccadilly Circus and Trafalgar Square in London. "
				+ "It is not widely celebrated in England; it is most popular in Scotland.");

		int count;
		int cd;
		cd = 0;
		count = 0;

		String regex = "\r\n";
		String regex2 = "\\.";
		String regex3 = " ";

		Pattern pattern = Pattern.compile(regex);
		Pattern pattern2 = Pattern.compile(regex2);
		Pattern pattern3 = Pattern.compile(regex3);

		// 1)
		String[] paragraph = pattern.split(str);
		for (int j = 0; j < paragraph.length; j++) {
			count++;
		}

		String[][] str2 = new String[count][];                 // создали двумерный массив предложений в абзацах
		for (int i = 0; i < str2.length; i++) {
			str2[i] = pattern2.split(paragraph[i]);
		}

		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.print(" " + str2[i][j] + "; ");
			}
			System.out.println();
		}

		for (int i = 0; i < str2.length; i++) {                      // Отсортировали абзацы по кол-ву предл.
			for (int j = 0; j < str2.length - 1 - i; j++) {
				if (str2[j].length > str2[j + 1].length) {
					String[] s = str2[j];
					str2[j] = str2[j + 1];
					str2[j + 1] = s;

				}
			}
		}
		System.out.println();
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.print(" " + str2[i][j] + "; ");
			}
			System.out.println();
		}
		// 2)

		String[] sentence = pattern2.split(str);
		for (int i = 0; i < sentence.length; i++) {
			cd++;
		}

		String[][] str3 = new String[cd][];                   // создали двумерный массив слова в предложении
		for (int i = 0; i < str3.length; i++) {
			str3[i] = pattern3.split(sentence[i]);
		}

		for (int i = 0; i < str3.length; i++) {                        // Отсортировали предложения по длине слов.
			for (int c = 0; c < str3[i].length; c++) {
				for (int j = c + 1; j < str3[i].length; j++) {
					if (str3[i][c].length() > str3[i][j].length()) {
						String s = str3[i][c];
						str3[i][c] = str3[i][j];
						str3[i][j] = s;

					}
				}
			}
		}
		System.out.println();

		for (int i = 0; i < str3.length; i++) {
			for (int j = 0; j < str3[i].length; j++) {
				System.out.print(str3[i][j] + "; ");
			}
			System.out.println();
		}
		// 3)
		
		for (int i = 0; i < str3.length; i++) {                         // Отсортировали слова по лексемам .
			for (int c = 0; c < str3[i].length; c++) {
				for (int j = c + 1; j < str3[i].length; j++) {
					if (str3[i][c].compareToIgnoreCase(str3[i][j]) > 0) {
						String s = str3[i][c];
						str3[i][c] = str3[i][j];
						str3[i][j] = s;

					}
				}
			}
		}

		System.out.println();

		for (int i = 0; i < str3.length; i++) {
			for (int j = 0; j < str3[i].length; j++) {
				System.out.print(str3[i][j] + "; ");
			}
			System.out.println();
		}

	}
}