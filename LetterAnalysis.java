package Test;
import java.util.Scanner;
public class LetterAnalysis {

	public static void main(String[] args) {
        inputSentence();
    }

    public static void inputSentence() {

        //Get the user to input a sentence
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String sentence = input.nextLine();

        //Run the letters function
        letters(sentence);
    }
    public static void letters(String s){

        int amountOfLetters = 0;
        int A=0,E=0, I=0, O=0, U=0;
        
        String initials = "";

        //Split the sentence into an array 
        String[] sentenceArray ;
        sentenceArray =  s.split(" ");

        //Check how many names have been entered and print them in the terminal as the first, middle and last naems
        switch(sentenceArray.length) {
        case 1: System.out.println("First name: " + sentenceArray[0]); break;
        case 2: System.out.println("First name: " + sentenceArray[0] + "\nSecond name: " + sentenceArray[1]); break;
        case 3: System.out.println("First name: " + sentenceArray[0] + "\nMiddle name: "+ sentenceArray[1] + "\nSecond name: " + sentenceArray[2]); break;
        case 4: System.out.println("First name: " + sentenceArray[0] + "\nMiddle names: "+ sentenceArray[1] + " " + sentenceArray[2] + "\nSecond name: " + sentenceArray[3]); break;
        default: return;
        }
    //For each name in the array
        for(int i=0; i<sentenceArray.length; i++) {

            //Count the total number of letters 
            amountOfLetters += sentenceArray[i].length();

            //For each letter in the name
            for(int j = 0; j < sentenceArray[i].length(); j++) {
            	
            	//Check for vowels
            	switch(sentenceArray[i].toLowerCase().charAt(j)) {
				case 'a' : A++; break;
				case 'e' : E++; break;
				case 'i' : I++; break;
				case 'o' : O++; break;
				case 'u' : U++; break;				
			}	
            	
            	//Find the initials
                //check if it is the first or last name
                if(i == 0 || i==(sentenceArray.length-1)) {
                    //Check if it is the first letter in the name
                    if(j == 0){
                        //Add the first letter to the initials string
                        initials = initials + sentenceArray[i].charAt(j);
                    }    }    
            }
        }

        //Print out sentence information
        System.out.println("Full name: " + s);
    //    System.out.println("There is " + amountOfLetters + " letters in the sentence");
    //    System.out.println("The word with the most ls is " + sentenceArray[amountOfLPosition] + " which occurs " + amountOfL + " times\n\n");
        System.out.println("Name initials: " + initials.toUpperCase() + "\n");
        
        System.out.println("Total number of vowels:");
		System.out.println("a: " + A);
		System.out.println("e: " + E);
		System.out.println("i: " + I);
		System.out.println("o: " + O);
		System.out.println("u: " + U + "\n\n");
		
        inputSentence();
    }
}
