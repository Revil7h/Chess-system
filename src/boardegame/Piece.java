package boardegame;

public class Piece {

	private int row;
	private int column;
	
	//construct
	public Piece() {
	}
	
	public Piece(int row, int column) {
		this.column = column;
		this.row = row;
	}
	
	//getters and setters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return ",";
	}
}
