package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: Controller.java
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @brief Controller class
 */
public class Controller {
	private static Scanner input;
	
	/**
	 * Reads the input from the User 
	 * @param db the Dots Board
	 * @return Return a list of points. Null if there are invalid.
	 */
	public static ArrayList<PointT> readInput(DotsBoard db){
		input = new Scanner(System.in);
		String string = input.nextLine();
		
		if (!inputValidation(string)) {
			View.display("Wrong Input Format");
			return null;
		}
		else {
			String[] inputSequence = string.split(" ");
			ArrayList<PointT> inputPoints = new ArrayList<PointT>();
			
			for (String i : inputSequence) {
				inputPoints.add(new PointT(Integer.parseInt(String.valueOf(i.charAt(0))), Integer.parseInt(String.valueOf(i.charAt(2)))));
			}
			
			if (!sequenceValidation(inputPoints, db)) {
				return null;
			}
			return inputPoints;
		}
	}
	
	/**
	 * @brief Checks if the sequence is valid (more than one point, they are next to each other, and they are of the same type
	 * @param inputPoints The inputted points 
	 * @param db The DotsBoard
	 * @return True if they are valid, false otherwise
	 */
	public static boolean sequenceValidation(ArrayList<PointT> inputPoints, DotsBoard db) {
		if (inputPoints.size () == 1) {
			View.display("More than one point!");
			return false;
		}
		
		ColourT firstDot = db.get(inputPoints.get(0));
		
		for (int i = 1; i < inputPoints.size(); i++) {
			if (!inputPoints.get(i).nextTo(inputPoints.get(i-1))) {
				View.display("Points are not next to one another\n");
				return false;
			} else if (db.get(inputPoints.get(i)) != firstDot) {
				View.display("Not the same type!");
				return false;
			}
		}
		return true;
	}

	/**
	 * @brief Checks to see if they are of the proper format 
	 * @param string A string to check if its the proper format
	 * @return True if it is the right format, otherwise false.
	 */
	public static boolean inputValidation(String string) {		
		for (int i = 0; i < string.length(); i++) {
			if (i % 4 == 0 || i % 4 == 2) {
				if (!Character.isDigit(string.charAt(i))) {
					return false;
				}
			}
			if (i % 4 == 1 && (string.charAt(i) != ',')) {
					return false;
			}
			if (i % 4 == 3 && string.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}
}
