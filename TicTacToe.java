
/**
 * @author anhadbhasin
 *
 */
public class TicTacToe {

	public enum Cell {E, X, O};
	
	private Cell[][] board;
	
	public TicTacToe()
	{
		board = new Cell[3][3];
		for(int i = 0; i < board.length; i++)
			for(int j =0; j < board[i].length; j++)
			{
				board[i][j] = Cell.E;
			}
	}
	public String toString()
	{
		String result = "";
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				result += board[i][j];
			}
			result += "\n";
		}
		
		
		return result;
	}
	public void setX(int row, int col)
	{
		board[row][col] = Cell.X;
	}
	public void setO(int row, int col)
	{
		board[row][col] = Cell.O;
	}
	
	
	public static void main(String[] args) {
		
		TicTacToe board = new TicTacToe();
		System.out.println(board);
		board.setO(0, 0);
		board.setX(0, 1);
		board.setO(1, 1);
		board.setO(2, 2);
		
		System.out.println(board);
	}

}
