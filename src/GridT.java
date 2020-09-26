package src;
/**
 * Author: Almen Ng
 * Revised: April 2, 2020
 * Description: GridT.java
 */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @brief Grid Class
 * @param <T> Generic type T
 */
public class GridT<T> {

	private int numCols;
	private int numRows;
	private ArrayList<ArrayList<T>> grid;
	
	/**
	 * @brief Grid Constructor 
	 * @param G
	 */
	public GridT(ArrayList<ArrayList<T>> G) {
		this.numCols = G.get(0).size();
		this.numRows = G.size();
		this.grid = G;
	}
	
	/**
	 * @brief Get the number of rows in the grid
	 * @return Number of columns
	 */
	public int getNumColumns() {
		return this.numCols;
	}
	
	/**
	 * @brief Get the number of columns in the grid
	 * @return Number of rows
	 */
	public int getNumRows() {
		return this.numRows;
	}
	
	/**
	 * @brief Get the type T in the coordiantes
	 * @param p PointT object 
	 * @return
	 */
	public T get(PointT p) {
		return this.grid.get(p.y()).get(p.x());
	}
	
	/**
	 * @brief Set a certain point in the graph to a value of type T
	 * @param p PointT object
	 * @param t Data type T
	 */
	public void set(PointT p, T t) {
		this.grid.get(p.y()).set(p.x(), t);
	}
	
	/**
	 * @brief Remove a line from the grid and have values stacked on top of DataType T
	 * @param line ArrayList of points in a line 
	 * @param e Array of data type T elements to stack back on top 
	 */
	public void lineRemoval(ArrayList<PointT> line, T[] e) {
		for (int column = 0; column < 6; column++) {
			ArrayList<PointT> currentColumn = new ArrayList<PointT>();
			
			for (PointT point : line) {
				if (point.x() == column) {
					currentColumn.add(point);
				}
			}
			
			currentColumn.sort((point1, point2) -> {
				return point1.y() < point2.y() ? 1:-1;
			});
			
			for (PointT point : currentColumn) {
				for (int i = point.y(); i < 6; i++) {
					PointT p1 = new PointT(column, i);
					if (i != 5) {
						PointT p2 = new PointT(column, i + 1);
						this.set(p1, this.get(p2));
					}
					else {
						this.set(p1, e[ThreadLocalRandom.current().nextInt(0, 5)]);
					}
				}
			}
		}
	}
}
