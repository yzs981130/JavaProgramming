/**
 * Created by yzs on 2017/4/10.
 */
public class ChessPieceBishop extends ChessPiece {
    public ChessPieceBishop(int _r, int _c, String _color, String _name){
        super(_r, _c, _color, _name);
    }
    @Override
    boolean movePiece(int c, int r, ChessPiece board[][]){
        if (r < 0 || r > 7 || c < 0 || c > 7)
            return false;
        int nr = getRow();
        int nc = getCol();
        if(nr == r && nc == c)
            return false;
        if((nr + nc != r + c) && (nr - nc != r - c))
            return false;

        if (nr + nc == r  + c) {
            if (nr < r) {
                for (int i = nr + 1; i < r; i++)
                    if (board[i][r + c - i] != null)
                        return false;
                if (board[r][c] != null) {
                    if (board[r][c].getColor() == getColor())
                        return false;
                    else {
                        board[r][c].setCol(c);
                        board[r][c].setRow(r);
                    }
                }
                board[r][c] = this;
                board[nr][nc] = null;
                setRow(r);
                setCol(c);
            }
            else {
                for (int i = nr - 1; i > r; i--)
                    if (board[i][r + c - i] != null)
                        return false;
                if (board[r][c] != null) {
                    if (board[r][c].getColor() == getColor())
                        return false;
                    else {
                        board[r][c].setCol(c);
                        board[r][c].setRow(r);
                    }
                }
                board[r][c] = this;
                board[nr][nc] = null;
                setRow(r);
                setCol(c);
            }
        }
        else {
            if (nr < r) {
                for (int i = nr + 1; i < r; i++)
                    if (board[i][c - r + i] != null)
                        return false;
                if (board[r][c] != null) {
                    if (board[r][c].getColor() == getColor())
                        return false;
                    else {
                        board[r][c].setCol(c);
                        board[r][c].setRow(r);
                    }
                }
                board[r][c] = this;
                board[nr][nc] = null;
                setRow(r);
                setCol(c);
            }
            else {
                for (int i = nr - 1; i > r; i--)
                    if (board[i][c - r + i] != null)
                        return false;
                if (board[r][c] != null) {
                    if (board[r][c].getColor() == getColor())
                        return false;
                    else {
                        board[r][c].setCol(c);
                        board[r][c].setRow(r);
                    }
                }
                board[r][c] = this;
                board[nr][nc] = null;
                setRow(r);
                setCol(c);
            }
        }
        return true;
    }
}
