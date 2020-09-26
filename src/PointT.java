package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: PointT.java
 */

/**
 * @brief PointT Class
 */
public class PointT {
	private int x;
    private int y;

    /**
     * @brief PointT constructor
     * @param xc x-coordinate
     * @param yc y-coordinate 
     */
    public PointT(int xc, int yc){
        this.x = xc;
        this.y = yc;
    }

    /**
     * @brief Getter for x coordinate
     * @return X coordinate
     */
    public int x() {
        return this.x;
    }

    /**
     * @brief Getter for y coordinate
     * @return y coordinate
     */
    public int y() {
        return this.y;
    }

    /**
     * @brief Sets the x coordinate
     * @param xc Value to be set
     */
    public void setX(int xc){
        this.x = xc;
    }

    /**
     * @brief Sets the y coordinate
     * @param yc Value to be set
     */
    public void setY(int yc){
        this.y = yc;
    }
    
	/**
	 * @brief Checks to see if the point is next to each other 
	 * @param p A point to check
	 * @return True if they are next to each other. False otherwise.
	 */
	public boolean nextTo(PointT p) {
		if (p.y() == this.y && Math.abs(p.x() - this.x) == 1) {
			return true;
		}
		else if (p.x() == this.x && Math.abs(p.y() - this.y) == 1){
			return true;
		}
		else {
			return false;
		}
	}
}
