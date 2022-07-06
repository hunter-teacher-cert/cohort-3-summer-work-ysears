import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life Team AreWeSentientYet?
 * Yanique Sears
 * collaborators: Adam Driggs, Jing Xue, Tanya Wardally
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  { char[][] board = new char[rows][cols];
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
      }
    }
    return board;
  }

  //print the board to the terminal with all dead cells
  public static void printBoard( char[][] board )
  {for(int row =0; row< board.length; row++)
    {for(int col=0; col < board[row].length; col++)
      {System.out.print(board[row][col]+ " ");
      }
      System.out.println(); 
    }

  }
  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {board[r][c] = val;
    }


  //return number of living neigbours of board[r][c]
  //public static int countNeighbours( char[][] board, int r, int c )
  {

  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
 public static char getNextGenCell( char[][] board,int r, int c )
  {
 char nextGenCell = board[r][c]; //current value
    int count = countNeighbours(board, r, c);

    if(board[r][c]== 'X'){ //If it's alive
      if(count < 2 || count > 3){ //too lonely/too crowded
        board [r][c] = '-'; //DIE
      }
    } else if (board [r][c] == 'X'){ // If it's dead
      if (count == 3) {              //magical friends
        board [r][c] = 'X';         //ALIVE
      }
    }
    nextGen = board [r][c];
    return nextGen;
  }


  //generate and return a new board representing next generation
 // public static char[][] generateNextBoard( char[][] board )
  {

  }


  public static void main( String[] args )
  { char[][] board;
   board = createNewBoard(25,25);
   printBoard(board);
   setCell(3,5,7);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board;
    board = createNewBoard(25,25);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class