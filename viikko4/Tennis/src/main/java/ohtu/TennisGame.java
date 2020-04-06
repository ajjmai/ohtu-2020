package ohtu;

public class TennisGame {

    private int player1_score = 0;
    private int player2_score = 0;
    private String player1;
    private String player2;
    private String game_score = "Love-All";

    public TennisGame(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1)) {
            player1_score += 1;
        } else {
            player2_score += 1;
        }
        updateGameScore();
    }

    public boolean gameIsEven() {
        return (player1_score == player2_score) ? true : false;
    }

    public String numberScoreToString(int score) {
        if (score == 0)
            return "Love";
        else if (score == 1)
            return "Fifteen";
        else if (score == 2)
            return "Thirty";
        else
            return "Forty";
    }

    public boolean atLeastOnePlayerReachedFourPoints() {
        return (player1_score >= 4 || player2_score >= 4) ? true : false;
    }

    public String gameScoreToString() {
        int scoreDifference = player1_score - player2_score;

        if (scoreDifference > 0)
            return getAdvantageOrWinString(scoreDifference) + "player1";
        else
            return getAdvantageOrWinString(scoreDifference) + "player2";
    }

    public String getAdvantageOrWinString(int scoreDifference) {
        if (Math.abs(scoreDifference) == 1)
            return "Advantage ";
        else
            return "Win for ";
    }

    public void updateGameScore() {
        if (gameIsEven()) {
            if (atLeastOnePlayerReachedFourPoints())
                game_score = "Deuce";
            else
                game_score = numberScoreToString(player1_score) + "-All";
        } else if (atLeastOnePlayerReachedFourPoints()) {
            game_score = gameScoreToString();
        } else {
            game_score = numberScoreToString(player1_score) + "-" + numberScoreToString(player2_score);
        }
    }

    public String getScore() {
        return game_score;
    }
}
