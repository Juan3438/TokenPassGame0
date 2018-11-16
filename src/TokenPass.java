public class TokenPass {

    private int playerCount;
    private int currentPlayer;
    int winner = 0;
    int[] board;

    public TokenPass(int x){
        this.playerCount = x;

        board = new int[playerCount];

        for(int i = 0; i < playerCount; i++)
        {
            board[i] = (int) (Math.random()*10);
        }
        currentPlayer = (int) (playerCount * Math.random());
    }
    public void distributeCurrentPlayerTokens()
    {
        if(board[currentPlayer] > 0) {
            for(int i = 0; i < board[currentPlayer];i++) {
                if(currentPlayer != board.length) {
                    board[currentPlayer + i]++;
                    currentPlayer++;
                }
                else {
                    currentPlayer = 0;
                }
            }
        }
        else
        {
            winner = currentPlayer;
        }
    }
    public void printBoard()
    {
        String str = "";
        for(int i = 0; i<board.length;i++){
            str = str + board[i];
        }
        System.out.println(str);
    }
    public void nextPlayer()
    {
        currentPlayer++;
    }
    public int gameOver()
    {
        if(winner >= 0) {
            return winner;
        }
        else {
            return -1;
        }
    }
}
