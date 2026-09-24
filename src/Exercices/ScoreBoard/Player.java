package Exercices.ScoreBoard;

public class Player {
    private String name;
    private int  points;
    private int game;
    private int sets;
    private int match;
    private PlayerState state;

    public Player(String name, int points, int game, int sets, int match, PlayerState state) {
        this.name = name;
        this.points = points;
        this.game = game;
        this.sets = sets;
        this.match = match;
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
