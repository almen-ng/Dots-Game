package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: Model.java
 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @brief Model Class
 */
public class Model {

	public static DotsBoard dotsGameBoard;
	
	private ArrayList<ArrayList<ColourT>> gameBoard;
	ColourT[] dots;
	
	/**
	 * @brief Model constructor
	 */
	public Model() {
		gameBoard = new ArrayList<ArrayList<ColourT>>();
		dots = ColourT.values();

		for (int y = 0; y < 6; y++) {
			gameBoard.add(new ArrayList<ColourT>());
			for (int x = 0; x < 6; x++) {
				gameBoard.get(y).add(dots[ThreadLocalRandom.current().nextInt(0, 5)]);
			}
		}
		
		dotsGameBoard = new DotsBoard(gameBoard);
	}
	
	/**
	 * @brief Sequence of steps to run the game  
	 */
	public void runGame() {
		View.displayTitleScreen();
		int numberOfTurns = 30;
		int score = 0;
		ArrayList<PointT> inputPoints;
		while (numberOfTurns > 0) {
			View.displayScore(score);
			View.displayNumberOfTurns(numberOfTurns);
			View.displayDotsBoard(dotsGameBoard);
			
			inputPoints = Controller.readInput(dotsGameBoard);
			
			while (inputPoints == null) {
				inputPoints = Controller.readInput(dotsGameBoard);
			}
			
			score += inputPoints.size();
			dotsGameBoard.lineRemoval(inputPoints, dots);
			 
			numberOfTurns--;
		}
	}
}
