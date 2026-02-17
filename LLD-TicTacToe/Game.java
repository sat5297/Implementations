
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter board size : ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        Board board = new Board(size);

        Player playerShakti = new Player(new PlayingPieceX(), "Shakti");
        Player playerKrishna = new Player(new PlayingPieceO(), "Krishna");

        Deque <Player> playerDeq = new ArrayDeque<>();
        playerDeq.add(playerShakti);
        playerDeq.add(playerKrishna);

        boolean winning = false;

        while(!winning) {
            board.displayBoard();
            Player currPlayer = playerDeq.getFirst();
            playerDeq.removeFirst();
            System.out.println("Enter the position to insert");
            int posX = sc.nextInt();
            int posY = sc.nextInt();

            boolean addPiece = board.makeMove(posX, posY, currPlayer.playingPiece);

            boolean playerWon = board.gameOver(currPlayer.playingPiece);

            if (playerWon) {
                board.displayBoard();
                System.out.println("PLayer Won : " + currPlayer.playerName);
                break;
            }

            if (!board.isEmpty()) {
                System.out.println("Board Full.. Game over");
                break;
            }

            if (!addPiece) {
                playerDeq.addFirst(currPlayer);
            }
            else {
                playerDeq.addLast(currPlayer);
            }
        }
    }
}