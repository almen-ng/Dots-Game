/**
 * Author: Almen Ng 
 * Revised: April 6, 2020
 * 
 * Description: Testing DotsBoard Class
 */

import org.junit.*;
import static org.junit.Assert.*;
import src.DotsBoard;
import src.PointT;
import src.GridT;
import src.ColourT;
import java.util.ArrayList;
import java.util.Arrays;

public class TestDotsBoard {
    @Test
    public void testGetNumColumns()
    {
        //B, G, O, P, R
        ColourT[] rowOne    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};
        ColourT[] rowTwo    = {ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G};
        ColourT[] rowThree  = {ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O};
        ColourT[] rowFour   = {ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P};
        ColourT[] rowFive   = {ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R};
        ColourT[] rowSix    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};

        ArrayList<ArrayList<ColourT>> board = new ArrayList<ArrayList<ColourT>>();
        board.add(new ArrayList<ColourT>(Arrays.asList(rowOne)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowTwo)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowThree)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFour)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFive)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowSix)));
        
        DotsBoard dotsBoard = new DotsBoard(board);
        assertEquals(dotsBoard.getNumColumns(), 6);
    }

    @Test
    public void testGetNumRows()
    {
        //B, G, O, P, R
        ColourT[] rowOne    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};
        ColourT[] rowTwo    = {ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G};
        ColourT[] rowThree  = {ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O};
        ColourT[] rowFour   = {ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P};
        ColourT[] rowFive   = {ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R};
        ColourT[] rowSix    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};

        ArrayList<ArrayList<ColourT>> board = new ArrayList<ArrayList<ColourT>>();
        board.add(new ArrayList<ColourT>(Arrays.asList(rowOne)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowTwo)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowThree)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFour)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFive)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowSix)));
        
        DotsBoard dotsBoard = new DotsBoard(board);
        assertEquals(dotsBoard.getNumRows(), 6);
    }

    @Test
    public void testGet()
    {
        //B, G, O, P, R
        ColourT[] rowOne    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};
        ColourT[] rowTwo    = {ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G};
        ColourT[] rowThree  = {ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O};
        ColourT[] rowFour   = {ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P};
        ColourT[] rowFive   = {ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R};
        ColourT[] rowSix    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};

        ArrayList<ArrayList<ColourT>> board = new ArrayList<ArrayList<ColourT>>();
        board.add(new ArrayList<ColourT>(Arrays.asList(rowOne)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowTwo)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowThree)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFour)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFive)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowSix)));
        
        DotsBoard dotsBoard = new DotsBoard(board);
        PointT p = new PointT(0, 0);
        assertEquals(dotsBoard.get(p), ColourT.B);
    }

    @Test
    public void testSet()
    {
        //B, G, O, P, R
        ColourT[] rowOne    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};
        ColourT[] rowTwo    = {ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G, ColourT.G};
        ColourT[] rowThree  = {ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O, ColourT.O};
        ColourT[] rowFour   = {ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P, ColourT.P};
        ColourT[] rowFive   = {ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R, ColourT.R};
        ColourT[] rowSix    = {ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B, ColourT.B};

        ArrayList<ArrayList<ColourT>> board = new ArrayList<ArrayList<ColourT>>();
        board.add(new ArrayList<ColourT>(Arrays.asList(rowOne)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowTwo)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowThree)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFour)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowFive)));
        board.add(new ArrayList<ColourT>(Arrays.asList(rowSix)));
        
        DotsBoard dotsBoard = new DotsBoard(board);
        PointT p = new PointT(0, 0);
        dotsBoard.set(p, ColourT.O);
        assertEquals(dotsBoard.get(p), ColourT.O);
    }
}
