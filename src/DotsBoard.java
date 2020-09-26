package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: DotsBoard.java
 */
import java.util.ArrayList;

/**
 * @brief DotsBoard
 * @details Extends the Grid Class with type DotT
 */
public class DotsBoard extends GridT<ColourT> {
	
	/**
	 * @brief DotsBoard Constructor
	 * @param G Grid of DotT elements
	 */
	public DotsBoard(ArrayList<ArrayList<ColourT>> G) {
		super(G);
	}
}
