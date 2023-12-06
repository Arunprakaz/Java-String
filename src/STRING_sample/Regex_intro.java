package STRING_sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_intro {

	public static void main(String[] args) {

		//
		//		String str ="arunbaskaruar1095@gmail.com arun";
		//		Pattern p = Pattern.compile("aru"); //pattern only for to create filter
		//		Pattern p1 = Pattern.compile("@");
		//		Matcher n = p1.matcher(str); //match for to send string with pattern
		//		Matcher m=p.matcher(str);
		//		int count =0;
		//		while (m.find()) {
		//			System.out.println("match found--"+m.group()+" "+m.start()+" "+m.end());
		//			count++;
		//			break;
		//		}
		//		while (n.find()) {
		//			System.out.println("match found--"+n.group()+" "+n.start()+" "+n.end());
		//		}
		//		System.out.println("count= "+count);
		//


		//
		//		String str ="tamil is the oldest language"; 
		//		//NOTE: ^ symbol used to validate data in first //NOTE: $ symbol used to validate data in last
		//
		//		//Pattern p = Pattern.compile("^tamil"); // tamil in first sentence 
		//		Pattern p		= Pattern.compile("language$");//Language in last sentence 
		//		//Pattern p =		Pattern.compile("oldest$");//tamil not in last sentence 
		//		//Pattern p =		Pattern.compile("tamil$"); //tamil not in last sentence
		//		Matcher m=p.matcher(str); 
		//		if (m.find()) {
		//			System.out.println("match found--"+m.group()+" --start index--> "+m.start()
		//			+" --end index+1--> "+m.end()); 
		//		} 
		//		else
		//		{
		//			System.out.println("Not match found--"); }

		//		String str ="tamil is the oldest language"; 
		//		//Pattern p		= Pattern.compile("t|a"); // NOTE: no space, or(mulitple condition apply by this method)
		//		//Pattern p		= Pattern.compile("tamil|oldest"); 
		//		//Pattern p		= Pattern.compile("^tamil|oldest$");
		//		Matcher m=p.matcher(str); 
		//		while (m.find()) {
		//			System.out.println("match found--"+m.group()+" --start index--> "+m.start()
		//			+" --end index+1--> "+m.end()); 
		//		}}


		String str ="abcdjasdasabcd"; 
		//Pattern p= Pattern.compile("[abd]");// [] symbol-- consider either a or b or c (multiple character taken) is present will capture 
		 Pattern p= Pattern.compile("[^abd]");// except a,b,d all other cahracter will taken
		Matcher m=p.matcher(str); 
		//String group = m.group();
		while (m.find()) {
//			System.out.println("match found--"+m.group()+" --start index--> "+m.start()
//			+" --end index+1--> "+m.end()); 
		System.out.print(m.group());
		
		}}


}
