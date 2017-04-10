/**
 * Created by yzs on 2017/4/10.
 */
public class ChessPieceKnight extends ChessPiece{
    public ChessPieceKnight(int _r, int _c, String _color, String _name){
        super(_r, _c, _color, _name);
    }
    @Override
    boolean movePiece(int c, int r, ChessPiece board[][]){
        if (r < 0 || r > 7 || c < 0 || c > 7)
            return false;
        int nr = getRow();
        int nc = getCol();
        int[] deltaRow = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] deltaCol = {1, 2, 2, 1, -1, -2, -2, -1};
        boolean flag = false;
        for (int i = 0; i < 8; i++) {
            if (nr + deltaRow[i] == r && nc + deltaCol[i] == c) {
                flag = true;
                break;
            }
        }
        if (flag) {
            if (board[r][c] != null) {
                if (board[r][c].getColor() == getColor())
                    return false;
                else {
                    board[r][c].setRow(-1);
                    board[r][c].setCol(-1);
                }
            }
            board[r][c] = this;
            board[nr][nc] = null;
            setCol(c);
            setRow(r);
        }
        return flag;
    }
}
