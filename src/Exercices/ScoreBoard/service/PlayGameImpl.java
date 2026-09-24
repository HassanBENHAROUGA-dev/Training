package Exercices.ScoreBoard.service;

import Exercices.ScoreBoard.GameScore;
import Exercices.ScoreBoard.Player;
import Exercices.ScoreBoard.PlayerState;
import Exercices.ScoreBoard.StateScore;

public class PlayGameImpl implements PlayGame {

    // ✅ Méthodes internes passées en private — plus dans l'interface
    private void clearPoints(Player player1, Player player2) {
        player1.setPoints(0);
        player2.setPoints(0);
    }

    private void resetStates(GameScore gameScore) {
        gameScore.setStateScore(StateScore.Normal);
        gameScore.getPlayer1().setState(PlayerState.Normal);
        gameScore.getPlayer2().setState(PlayerState.Normal);
    }

    private void playerSetAdvantage(Player player1, Player player2) {
        player1.setState(PlayerState.Advantage);
        player2.setState(PlayerState.Disadvantage);
    }

    private void playerStateEqual(Player player1, Player player2) {
        player1.setState(PlayerState.Equal);
        player2.setState(PlayerState.Equal);
    }

    private boolean checkPlayersEqual(Player player1, Player player2) {
        return player1.getPoints() == player2.getPoints();
    }

    private void checkPointsEquality(GameScore gameScore, Player player1, Player player2) {
        if (this.checkPlayersEqual(player1, player2) && player1.getPoints() == 40) {
            player1.setState(PlayerState.Equal);
            player2.setState(PlayerState.Equal);
            gameScore.setStateScore(StateScore.Deuce);
        }
    }

    private void checkGamesEquality(GameScore gameScore, Player player1, Player player2) {
        if (player1.getGame() == player2.getGame() && player1.getGame() == 6) {
            gameScore.setStateScore(StateScore.TieBreak);
            player1.setState(PlayerState.Equal);
            player2.setState(PlayerState.Equal);
        }
    }

    // ✅ Méthodes publiques — contrat de l'interface
    @Override
    public void playerScorePoints(GameScore gameScore, Player scoringPlayer, Player opponent) {
        if (scoringPlayer.getState() == PlayerState.Normal) {
            this.checkPointsEquality(gameScore, scoringPlayer, opponent);
        }

        // ✅ switch sur l'état du jeu au lieu de 3 if indépendants
        switch (gameScore.getStateScore()) {
            case Normal -> {
                System.out.println(scoringPlayer.getName() + " wins a point! Current score: "
                        + scoringPlayer.getPoints() + " - " + opponent.getPoints());
                switch (scoringPlayer.getPoints()) {
                    case 0  -> scoringPlayer.setPoints(15);
                    case 15 -> scoringPlayer.setPoints(30);
                    case 30 -> scoringPlayer.setPoints(40);
                    case 40 -> {
                        this.clearPoints(gameScore.getPlayer1(), gameScore.getPlayer2());
                        this.resetStates(gameScore);
                        this.playerScoreGame(gameScore, scoringPlayer, opponent);
                    }
                }
            }
            case TieBreak -> this.playerScoreTiebreak(gameScore, scoringPlayer, opponent);
            case Deuce -> {
                switch (scoringPlayer.getState()) {
                    case Equal -> {
                        this.playerSetAdvantage(scoringPlayer, opponent);
                        System.out.println(scoringPlayer.getName() + " wins a point in Deuce! State: "
                                + scoringPlayer.getState() + " - " + opponent.getState());
                    }
                    case Disadvantage -> {
                        this.playerStateEqual(scoringPlayer, opponent);
                        System.out.println(scoringPlayer.getName() + " equalizes in Deuce! State: "
                                + scoringPlayer.getState() + " - " + opponent.getState());
                    }
                    case Advantage -> {
                        System.out.println(scoringPlayer.getName() + " wins the Deuce!");
                        this.clearPoints(scoringPlayer, opponent);
                        this.resetStates(gameScore);
                        this.playerScoreGame(gameScore, scoringPlayer, opponent);
                    }
                }
            }
        }
    }

    @Override
    public void playerScoreMatch(Player player) {
        player.setMatch(1);
        System.out.println(player.getName() + " wins the match!");
    }

    @Override
    public void playerScoreGame(GameScore gameScore, Player scoringPlayer, Player opponent) {
        scoringPlayer.setGame(scoringPlayer.getGame() + 1);
        System.out.println(scoringPlayer.getName() + " wins a game! Current score: " + scoringPlayer.getGame() + " - " + opponent.getGame());

        switch (scoringPlayer.getGame()) {
            case 6 -> {
                if (opponent.getGame() < 5) {
                    this.playerScoreSet(scoringPlayer, opponent);
                } else if (scoringPlayer.getGame() == opponent.getGame()) {
                    System.out.println("Tie-break!");
                    this.checkGamesEquality(gameScore, scoringPlayer, opponent);
                }
            }
        }

        if (scoringPlayer.getGame() > 6 && scoringPlayer.getGame() - opponent.getGame() >= 2) {
            this.clearPoints(scoringPlayer, opponent);
            this.resetStates(gameScore);
            this.playerScoreSet(scoringPlayer, opponent);
        }
    }

    /*@Override
    public void playerScoreTiebreak(GameScore gameScore, Player scoringPlayer, Player opponent) {
        scoringPlayer.setPoints(scoringPlayer.getPoints() + 1);

        if (scoringPlayer.getPoints() >= 7 && scoringPlayer.getPoints() - opponent.getPoints() >= 2) {
            System.out.println(scoringPlayer.getName() + " wins the tie-break! Current score: " + scoringPlayer.getPoints() + " - " + opponent.getPoints());
            this.clearPoints(scoringPlayer, opponent);
            this.resetStates(gameScore);
            this.playerScoreGame(gameScore, scoringPlayer, opponent);
        }
    }*/
    @Override
    public void playerScoreTiebreak(GameScore gameScore, Player scoringPlayer, Player opponent) {
        scoringPlayer.setPoints(scoringPlayer.getPoints() + 1);
        System.out.println(scoringPlayer.getName() + " wins a tie-break point! Score: "
                + scoringPlayer.getPoints() + " - " + opponent.getPoints());

        if (scoringPlayer.getPoints() >= 7 && scoringPlayer.getPoints() - opponent.getPoints() >= 2) {
            System.out.println(scoringPlayer.getName() + " wins the tie-break!");
            // ✅ CORRIGÉ : on remet les jeux à 0 (étaient à 6-6)
            scoringPlayer.setGame(0);
            opponent.setGame(0);
            this.clearPoints(scoringPlayer, opponent);
            this.resetStates(gameScore);
            // ✅ CORRIGÉ : playerScoreSet et non playerScoreGame — le tie-break conclut le set
            this.playerScoreSet(scoringPlayer, opponent);
        }
    }

    @Override
    public void playerScoreSet(Player scoringPlayer, Player opponent) {
        scoringPlayer.setSets(scoringPlayer.getSets() + 1);
        System.out.println(scoringPlayer.getName() + " wins a set! Current score: " + scoringPlayer.getSets() + " - " + opponent.getSets());
        if (scoringPlayer.getSets() == 2) {
            this.playerScoreMatch(scoringPlayer);
        }
    }
}