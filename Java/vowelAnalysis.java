package Test;
import java.util.Scanner;
public class vowelAnalysis {

	public static void main(String[] args) {
		inputSentence();
	}
	
	public static void inputSentence() {

        //Get the user to input a word
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //Run the letters function
        vowelchecker(word);
    }
	
	public static void vowelchecker(String word) {
		 
		int a=0,e=0,i=0,o=0,u=0, totalNumberOfVowels=0;
		
		//Split the word into an array of letters
		char[] letter;
		letter = word.toCharArray();
		
		//for each letter
		for(int j=0; j < letter.length; j++){
			//change all letters to lowercase
			letter[j] = Character.toLowerCase(letter[j]);
			//check if each letter is a vowel
			switch(letter[j]) {
				case 'a' : a++; break;
				case 'e' : e++; break;
				case 'i' : i++; break;
				case 'o' : o++; break;
				case 'u' : u++; break;				
			}
		}
		
		//Find the total number of vowels
		totalNumberOfVowels = a+e+i+u+o;
		
		//Print the number of vowels
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("Total number of vowels: " + totalNumberOfVowels + "\n\n");
		//Ask the user to input another word
		inputSentence();
	}
}
