public class TokenPass {

    private int playerCount;
    private int currentPlayer;
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
        if(board[currentPlayer] > 0)
        {
            int tokens = board[currentPlayer];
            for(int i = 0; i < tokens;i++)
            {

            }
        }
    }

}
