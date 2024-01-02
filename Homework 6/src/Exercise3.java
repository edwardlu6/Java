//This homework is completed by Karla Murueta and Edward Lu


import java.io.*;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		String fileName = "state capitals.txt"; //create a String variable to store the file name.
		
		String line = null; // initializing a reader for each line.
		
		try {
			
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String[][] wordsMatrix = new String[50][2]; // Create a word matrix with 50 rows of states and 2 columns of state and its capital.
			String[] word; // create a String array to store states and their capitals in loop.
			
			int index = 0;//initializing the index for the loop.
			while ((line = bufferedReader.readLine())!=null && index < 50) {
				
				word = line.split("\\."); // split each line by '.' to separate states and capitals.
				
				wordsMatrix[index][0]=word[0]; // store the state into the matrix.
				wordsMatrix[index][1]=word[1]; //store its capital into the matrix.
				
				index++; //increment index.
				
				
			}
			
			int correct = 0; // set a variable to count the correct answer.
			Scanner sc = new Scanner(System.in);
			String answer;
			
			for (int i=0; i<50; i++) {
				System.out.println("What is the capital of " + wordsMatrix[i][0] + "?"); // asking capital.
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase(wordsMatrix[i][1])) { //check the answer.
					System.out.println("Your answer is correct");
					System.out.println();
					correct ++;
				} else {
					System.out.println();
					System.out.println("The correct answer should be " + wordsMatrix[i][1]);
					System.out.println();
				}
			}
			System.out.println("The correct count is " + correct);
			
			


		}catch(FileNotFoundException ex){
			System.out.println("file not found");
		}catch(IOException ex){
		
			System.out.println("IO Exception");
			ex.printStackTrace();
		}
	}

	private static Scanner nextLine() {
		// TODO Auto-generated method stub
		return null;
	}


}
