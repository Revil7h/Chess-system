package boardegame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructs
	public Board() {
	}
	
	public Board(int rows, int columns) {
		this.setRows(rows);
		this.setColumns(columns);
		pieces = new Piece[rows][columns];
	}

	//getters and setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//retorna a matriz pieces na linha [row] e coluna [column]
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//retorna a peça na posição
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
