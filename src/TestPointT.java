/**
 * Author: Almen Ng 
 * Revised: April 6, 2020
 * 
 * Description: Testing PointT Class
 */

import org.junit.*;
import static org.junit.Assert.*;
import src.PointT;

public class TestPointT
{

    @Test
    public void testX()
    {
      PointT p = new PointT(5, 6);
      assertEquals(p.x(), 5);
    }
 
    @Test
    public void testY()
    {
      PointT p = new PointT(5, 6);
      assertEquals(p.y(), 6);
    }
 
    @Test
    public void testSetX()
    {
      PointT p = new PointT(0, 0);
      p.setX(5);
      assertEquals(p.x(), 5);
    }

    @Test
    public void testSetY()
    {
      PointT p = new PointT(0, 0);
      p.setY(5);
      assertEquals(p.y(), 5);
    }

    @Test
    public void testNextTo()
    {
      PointT p1 = new PointT(0, 0);
      PointT p2 = new PointT(0, 1);
      assertTrue(p1.nextTo(p2));
    }
}