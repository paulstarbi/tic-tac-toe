package com.tymek;

/**
 * Created by Mateusz on 29.06.2017.
 */
public class Main {
    public static void main(String[] args) {

//        GameEnum.Instance.start();

        Game game = new HumansGame();
        game.createBoards();
        System.out.println(game.getBoards().getBoards().get(0).getBoard());

    }
}
