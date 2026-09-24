package Exercices.ScoreBoard;

import Exercices.ScoreBoard.service.PlayGame;
import Exercices.ScoreBoard.service.PlayGameImpl;

public class ScoreBoard {

    public static void main(String[] args) {

        PlayGame gameService = new PlayGameImpl();

        Player p1 = new Player("Nadal", 0, 0, 0, 0, PlayerState.Normal);
        Player p2 = new Player("Djokovic", 0, 0, 0, 0, PlayerState.Normal);

        GameScore game = new GameScore(StateScore.Normal, p1, p2);

        System.out.println("\n--- MATCH TEST ---");

        p1.setSets(1);
        p2.setSets(0);

        gameService.playerScoreSet(p1, p2); // match win if sets == 2
    }
}


