package com.company;

import java.util.List;

public class Game {

    private List<Player> players;
    private int runToNumber;

    public Game(List<Player> players, int runToNumber) {
        this.players = players;
        this.runToNumber = runToNumber;
    }

    public void start() {
        int playerIndex = 0;
        for (int i = 1; i <= runToNumber; i++) {
            Player player = players.get(playerIndex++ % players.size());
            player.play(i);
        }
    }
}
