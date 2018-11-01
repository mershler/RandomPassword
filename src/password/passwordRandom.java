package password;

import java.util.Random;

public class passwordRandom {
	
	public static void main(String[] args) {

			int length = 8; 
			System.out.println(password(length));
		}
		
		static char[] password(int len) { 
			System.out.println("Generating password..."); 
			
			String capital = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
			String lower = "abcdefghijklmnopqrstuvxyz"; 
			String numbers = "0123456789"; 
			String symbols = "!@#$%^&*_=+-/.?<>";
			
			String value = capital + lower + numbers + symbols; 
			
			Random rand = new Random(); 
			char[] finalPass = new char[len]; 
			
			for (int i = 0; i < len; i++) { 
				finalPass[i] = value.charAt(rand.nextInt(value.length()));
			} 
			return finalPass;
		}
}

