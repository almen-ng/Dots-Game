package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: View.java
 */

/**
 * @brief View Class 
 */
public class View {
	
	/**
	 * @brief Displays the title screen
	 */
	public static void displayTitleScreen() {
		View.display("Two Dots");
		View.display("Enter a sequence of coordinates on the board");
		View.display("Format: column,row");
		View.display("0,0 at bottom left, 5,5 at top right");
		View.display("Input the sequence like: 0,0 0,1 0,2 0,3 \n");
	}
	
	/**
	 * @brief Displays a string 
	 * @param string String to be displayed
	 */
	public static void display(String string) {
		System.out.println(string);
	}
	
	/**
	 * @brief Displays the dot board
	 * @param db The dot board
	 */
	public static void displayDotsBoard(DotsBoard db) {
		for (int y = 5; y >= -2; y--) {
			if (y > -1) {
				for (int x = -1; x < 6; x++) {
					if (x == 5){
						PointT p = new PointT(x, y);
						System.out.print(db.get(p).toString() + "\n");
					}
					else if (x > -1) {
						PointT p = new PointT(x, y);
						System.out.print(db.get(p).toString() + "  ");
					}
					else {
						System.out.print(y + " | ");
					}
				}
			}
			else if (y == -2){
				for (int x = -1; x < 6; x++) {
					if (x > - 1) {
						System.out.print(x + "  ");
					}
					else {
						System.out.print("    ");
					}
				}
				System.out.print("\n");
			}
			else {
				System.out.print("   ------------------\n");
			}
		}

	}
	
	/**
	 * @brief Displays the score 
	 * @param score The score 
	 */
	public static void displayScore(int score) {
		System.out.println("Score: " + score);
	}
	
	/**
	 * @brief Displays the number of turns left 
	 * @param numberOfTurns Number of turns left 
	 */
	public static void displayNumberOfTurns(int numberOfTurns) {
		System.out.println("Number of Turns: " + numberOfTurns);
	}
}
