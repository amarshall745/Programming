package Test;
import java.util.Scanner;
public class SentenceTester {

	public static void main(String[] args) {
		inputSentence();
    }
	
	public static void inputSentence() {
		
		//Get the user to input a sentence
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = input.nextLine();
		
		//Run the letters function
		letters(sentence);
	}


    public static void letters(String s){

        String longestWordPosition = "";
        String shortestWordPosition = "aaaaaaaaaaa";
        int amountOfLetters = 0;

        int counter =0;
        int amountOfL =0;
        int amountOfLPosition =0;

        //Split the sentence into an array 
        String[] sentenceArray ;
        sentenceArray =  s.split(" ");

        //For each word in the array
        for(int i=0; i<sentenceArray.length; i++) {

            //add the amount of letters in the word to the total sentence letter count
            amountOfLetters += sentenceArray[i].length();

            //check if the word has more letters than the previous words
            if(sentenceArray[i].length() > longestWordPosition.length()) {
                //Set the word to be the new longest word
                longestWordPosition = sentenceArray[i];
            }

            //check if the word has less letters than the previous words
            if(sentenceArray[i].length() < shortestWordPosition.length()) {
                //Set the word to be the new shortest word
                shortestWordPosition = sentenceArray[i];
            }

            //Check how many times the letter l appears in the word
            for(int j = 0; j < sentenceArray[i].length(); j++) {
                //check each letter in the word to see if it is a letter 'l'
                if(sentenceArray[i].charAt(j) == 'l') {
                    //count how many times the letter 'l' appears
                    counter++;
                }
            }

            //if the letter 'l' appears more times in this word, then set this word
            if(counter > amountOfL) {
                amountOfL = counter;
                amountOfLPosition = i;
            }
            //Clear the counter
            counter =0;
        }

        //Print out sentence information
        System.out.println("The sentence is '" + s + "'");
        System.out.println("There is " + sentenceArray.length + " words in the sentence");
        System.out.println("There is " + amountOfLetters + " letters in the sentence");
        System.out.println("The longest word is '" + longestWordPosition + "' with " + longestWordPosition.length() + " letters");
        System.out.println("The shortest word is '" + shortestWordPosition + "' with " + shortestWordPosition.length() + " letters");
        System.out.println("The word with the most ls is '" + sentenceArray[amountOfLPosition] + "' which occurs " + amountOfL + " times\n\n");
        inputSentence();  
	    //hui 
    }
	
}
