package boardgame;

public class Board {
 
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() { 
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int setRows(int rows) {
        return this.rows = rows;
    }
    public int setColumns(int columns) {
        return this.columns = columns;
    }
}
