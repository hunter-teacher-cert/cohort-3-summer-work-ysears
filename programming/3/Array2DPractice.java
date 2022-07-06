import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Yanique Sears
 * collaborators: Kiana Herr, Jenna Lin, Nicole Cojuangco
 */

/*
This file also contains stubs (empty methods) for the followingmethods (split into 3 levels):

   Basic level (complete all):
   - printBoard *
   - copyBoard *

Intermediate level (complete Basic methods plus this method):
   - explodeSquare *

Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString

The routines with the * will be particularly helpful for the Conway's Game of Life project that you'll work on after this one.
**********************************************/


/**
creates and returns a 2D array of size rowsxcols chars. All elements in the 2D array will be set to the char value.

Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx

Use this completed method as an example to help you with some of the other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    for (int i = 0; i < board.length; i++) //traverses rows
    {
      for (int j = 0; j < board[i].length; j++) //traverses columns
      {
        System.out.print(board[i][j] + " ");//prints elements with space
      }
      System.out.println(); //at the end of each row, go to the next line.
    }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row

     Returns:
     Nothing

     Change the 2D array board so that all the elements in the
     specified row are set to value.

     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx

     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    for (int i = 0; i < board[row].length; i++)
    {
      board[row][i] = value;
    }
  }

  /**
     copyBoard-creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {char [][] duplicateBoard = new char[original.length][original[0].length];// set size of new board in rows and columns

    for (int i = 0; i < original.length; i++)
    {for (int j = 0; j < original[i].length; j++)
        {duplicateBoard[i][j] = original[i][j];
        }
    }
    return duplicateBoard;
  }


  /**
    explodeSquare- changes all elements around a given value (neighbor cells) to 'X'. When putting into the main, you need to sprecify the array,row and column.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, board.length - 1); i++) 
/*start at index 0 or row - 1, whichever is larger; end at index row + 1 or length - 1, whichever is smaller. (Avoid out of bounds error)*/
    {for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, board[i].length); j++)
      {if (! (i == row && j == col))
          {board[i][j] = 'X';
          }
      }
    } 
      
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array
     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     explodeAllchar(board,'z') will change board to:

     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    /**
Go through each row starting at row 0.
  Go through each column starting at 0. 
    If the element in this location is equal to c
      use explodeSquare method
*/

  for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == c) {
          explodeSquare (board, i, j);
        }
      }
    }
   }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.

     This will insert the parameter word into board in the downward
     direction. See examples below

     Example:

     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx

     downString(board,1,1,"Hello") will change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx

     Given the above array, downString(board,4,3,"World") will
     change board to:

     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx

     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,10,'z');
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
    System.out.println("Original board:");
    printBoard(b);
    System.out.println();
    
    System.out.println("Copy board and change line 2 elements to \'a\':");
    char[][] newBoard = copyBoard(b);
    setRow(newBoard, 2, 'a');
    printBoard(newBoard);
    System.out.println();
    
    System.out.println("Explode (1,2) and (4,8):");
    explodeSquare(newBoard, 1, 2);
    explodeSquare(newBoard, 4, 8);
    printBoard(newBoard);
  }
}