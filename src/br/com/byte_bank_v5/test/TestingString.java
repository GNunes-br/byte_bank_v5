package br.com.byte_bank_v5.test;

public class TestingString {
	
	public static void main(String[] args) {
		
		int a = 3;
		String name = "AlurA"; // Literal Object
		// String other = new String("Alura");
		
		String replaceName = name.replace("A", "a");
						
		System.out.println(replaceName); // alura
		
		String nameToUpperCase = name.toUpperCase();
				
		System.out.println(nameToUpperCase); // ALURA
		
		char character = name.charAt(2);
		
		System.out.println(character); // u
		
		int index = name.indexOf("ur");
		
		System.out.println(index); // 2
		
		String substringOne = name.substring(2);
		
		System.out.println(substringOne); // urA
		
		String substringTwo = name.substring(1,3);
		
		System.out.println(substringTwo); // lu
		
		System.out.println(name.length()); // 5
		
		for (int i = 0; i < name.length(); i++  ) {
			System.out.println(name.charAt(i));
		}
		
		System.out.println(name.isEmpty()); // false
		
		System.out.println("".isEmpty()); // true
		
		System.out.println(" ".isEmpty()); // false
		
		System.out.println(" alura ".trim()); // alura
		
		System.out.println(" ".trim().isEmpty()); // true
		
		System.out.println(" ola mundo".contains("ola")); // true
		
		System.out.println(" ola mundo".contains("oLa")); // false
	}	
}
	