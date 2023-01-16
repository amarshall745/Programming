package Test;

public class Testscores {

	public static void main(String[] args) {		
		addScores();
	}
	
	
	public static void addScores() {
		String[] students = {"Dan","Jack","Beth","Dav","Conor","Megan","Fin","Eva","Sophie","James","Kate","Jim","Mike"};
		int[] score1 = {42,95,48,55,24,52,95,54,21,01,25,49,12};
		int[] score2 = {95,89,22,33,11,54,58,34,21,48,75,92,45};
		int[] addedScore = new int[students.length];
		int[] averageScore = new int[students.length];
		String[] averageGrade = new String[students.length];
		//Position value is to work out who is in the highest position
		int position = 0;
		
		//For each student in the class
		for(int i=0; i<students.length; i++) {
			//Work out both scores added together
			addedScore[i] = score1[i] + score2[i];
			
			//Check if the added score is higher than the previous students
			if(addedScore[i] > addedScore[position]) {
				position = i;
			}
			
			//Work out the average score across the 2 tests
			averageScore[i] = (score1[i] + score2[i])/2;
			
			//Work out the average grade based on the average score
			if(averageScore[i] <= 49) {
				averageGrade[i] = "D";
			}else if(averageScore[i]>=50 && averageScore[i]<=59){
				averageGrade[i] = "C";
			}else if(averageScore[i]>=60 && averageScore[i]<=69) {
				averageGrade[i] = "B";
			}else if(averageScore[i]>=70 && averageScore[i]<=100) {
				averageGrade[i] = "A";				
			}
			
			//Print out information about each student
			System.out.println(students[i]);
			System.out.println("Average score is " + averageScore[i]);
			System.out.println("Average grade is " + averageGrade[i] + "\n");
		}		
		System.out.println("\n" + students[position] + " had the highest average score of " + averageScore[position]);;
	}
}