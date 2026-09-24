package Exercices.ScoreBoard.service;

import Exercices.ScoreBoard.GameScore;
import Exercices.ScoreBoard.Player;

public interface PlayGame {
    void playerScorePoints(GameScore gameScore, Player scoringPlayer, Player opponent);
    void playerScoreGame(GameScore gameScore, Player scoringPlayer, Player opponent);
    void playerScoreSet(Player scoringPlayer, Player opponent);
    void playerScoreMatch(Player player);
    void playerScoreTiebreak(GameScore gameScore, Player scoringPlayer, Player opponent);
}
