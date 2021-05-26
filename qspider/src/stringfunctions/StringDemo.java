package stringfunctions;

public class StringDemo {

	public static void main(String[] args) {
		String str = " Hello ";
		System.out.println(str.length());
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.startsWith(" "));
		System.out.println(str.endsWith("o"));
		System.out.println(str.concat("Welcome"));
		System.out.println(str);//same location modification can't be done
		str= (str.concat("Welcome"));
		System.out.println(str);
		
		

	}

}
