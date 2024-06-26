package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public  abstract class ChessPieces extends Piece{
    private Color color;
    private int moveCount;


    /**
     * Pega a posiçãoJogo ou seja no formato do xadrez A1 etc..;
     * @return ChessPosition
     */
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    public ChessPieces(Board board, Color color) {
        super(board);
        this.color = color;
    }

    /**
     * Metodo responsavel por verificar se existe a peça de um oponente na posição.
     * @param position .
     * @return boolean
     */
    protected boolean isThereOpponentPiece(Position position) {
        ChessPieces p = (ChessPieces) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    /**
     * incrementa o atributo moveCaunt
     */
    protected void increaseMove(){
        setMoveCount(+1);
    }

    /**
     * decrementa o atributo moveCaunt
     */
    protected void decreaseMove(){
        setMoveCount(-1);
    }

    // ==================
    //   Getter e setter
    // ==================

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }



}
