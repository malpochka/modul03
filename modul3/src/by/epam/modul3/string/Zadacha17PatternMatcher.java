package by.epam.modul3.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Дана строка содержащая текст. Напишите анализатор, позволяющий последовательно возвращать содержимое уздов XML-документа
 * и его тип(открывающий тег, закрывающий тег, содержимое тега тег без тела).Пользоваться готовыми парсерами XML нельзя. */

public class Zadacha17PatternMatcher {

	public static void main(String[] args) {
		String str="<notes>\r\n"+
	               "<note id=\"1\"> \r\n"+
				   "<to>Вася</to> \r\n"+
	               "<from>Света</from> \r\n"+
				   "<heading>Напоминание</heading> \r\n"+
	               "<body>Позвони мне завтра</body> \r\n"+
				   "</note> \r\n"+
	               "<note id=\"2\" \r\n"+
				   "<to>Петя</to> \r\n"+
	               "<from>Маша</from> \r\n"+
				   "<heading>Важное напоминание</heading> \r\n"+
	               "</body> \r\n"+
				   "</note> \r\n"+
	               "</notes>";


		String regex = "(<[^\\/].*?[^\\/]?>(?<contentTeg>[\\r\\n]?.+?[\\r\\n]?)<\\/.*?>)|"
				+ "(?<noBodyTag><.*?\\/>)|(?<openTeg><[A-Za-z]+.*?>)|(?<closeTeg><\\/.*?[^\\/]>)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
