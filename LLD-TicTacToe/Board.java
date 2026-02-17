public class Board {
    int size;
    boolean playerWon = false;
    PlayingPiece[][] board;

    public Board(int size) {
        board = new PlayingPiece[size][size];
        this.size = size;
    }

    public boolean makeMove(int posX, int posY, PlayingPiece playingPiece) {

        if (posX < 0 || posX >= size || posY < 0 || posY >= size) {
            System.out.println("Incorrect position.");
            return false;
        }
        if (board[posX][posY] != null) {
            System.out.println("Position already occupied.");
            return false;
        }

        board[posX][posY] = playingPiece;
        return true;
    }

    public boolean isEmpty() {
        boolean empty = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    empty = true;
                }
            }
        }
        return empty;
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null)
                    System.out.print(board[i][j].pieceType + " ");
                else
                    System.out.print(" $ ");
            }
            System.out.println();
        }
    }

    public boolean gameOver(PlayingPiece playingPiece) {
        int ctrInRow = 0, ctrInCol = 0;
        boolean won = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == playingPiece) {
                    ctrInRow += 1;
                }
            }
            if (ctrInRow == size) {
                won = true;
            }
            ctrInRow = 0;
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (board[i][j] == playingPiece) {
                    ctrInCol += 1;
                }
            }
            if (ctrInCol == size) {
                won = true;
            }
            ctrInCol = 0;
        }

        int leftDiag = 0, rightDiag = size - 1;
        int ctrLeftDiag = 0, ctrRightDiag = 0;

        while (leftDiag < size && rightDiag >= 0) {
            if (board[leftDiag][leftDiag] == playingPiece) {
                ctrLeftDiag += 1;
            } 
            else if (board[rightDiag][rightDiag] == playingPiece) {
                ctrRightDiag += 1;
            }
            leftDiag += 1;
            rightDiag -= 1;
        }

        System.out.println(size + " " + ctrInCol + " " + ctrInRow + " " + ctrLeftDiag + " " + ctrRightDiag);

        if ( won || (ctrLeftDiag == size) || (ctrRightDiag == size)) {
            playerWon = true;
        }

        return playerWon;
    }
}