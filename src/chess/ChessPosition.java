package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 0 || row > 8) {
			throw new ChessException("Error instantiancing ChessPosition: "
					+ "Valid values are from a1 to h8.");
		}
		this.row = row;
		this.column = column;
	}

	public char getColumns() {
		return column;
	}

	public int getRows() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8-row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + row + column;
	}
}
