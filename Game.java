package com.company;

public class Game {

    public Game(Player first, Player second) {
        firstPlayer = first;
        secondPlayer = second;
    }

    boolean compare (int first, int second) {
        if (first == 0 && second == 9) {
            return true;
        }
        if (first == 9 && second == 0) {
            return false;
        }
        if (first > second) {
            return true;
        }
        return false;
    }
    public void run() {
        while (!check()) {
            int first = firstPlayer.getCard();
            int second = secondPlayer.getCard();

            if (compare(first, second)) {
                firstPlayer.pushCards(second, first);
            } else {
                secondPlayer.pushCards(first, second);
            }

            steps += 1;

        }
    }

    public boolean check() {

        if (steps > 106) {
            System.out.println("botva");
            return true;
        }

        if (firstPlayer.getCardsCount() == 0) {
            System.out.println("second " + steps);
        }

        if (secondPlayer.getCardsCount() == 0) {
            System.out.println("first " + steps);
        }

        return !(firstPlayer.getCardsCount() != 0 && secondPlayer.getCardsCount() != 0);

    }

    private Player firstPlayer;
    private Player secondPlayer;
    private int steps;

}
