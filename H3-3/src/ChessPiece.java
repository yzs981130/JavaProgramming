/**
 * Created by yzs on 2017/4/10.
 */
public abstract class ChessPiece {
    private int col, row;
    private String color, name;

    protected void setCol(int _c){
        col = _c;
    }
    protected void setRow(int _r){
        row = _r;
    }
    protected int getCol(){
        return col;
    }
    protected int getRow(){
        return row;
    }
    protected String getColor(){
        return color;
    }

    ChessPiece(int _c, int _r, String _color, String _name){
        col = _c;
        row = _r;
        color = _color;
        name = _name;
    }
    abstract boolean movePiece(int c, int r, ChessPiece board[][]);
}
