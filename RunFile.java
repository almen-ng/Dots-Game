/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: RunFile.java
 */

import src.ColourT;
import src.Controller;
import src.DotsBoard;
import src.GridT;
import src.Model;
import src.PointT;
import src.View;

public class RunFile {
    public static void main(String[] args){
        Model dotsGame = new Model();
		dotsGame.runGame();
    }
}