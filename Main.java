package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        int [] firstCards = readCards(5);
        int [] secondsCards = readCards(5);

        new Game(
            new QueuePlayer(firstCards),
            new QueuePlayer(secondsCards)
        ).run();

        new Game(
            new DoubleListPlayer(firstCards),
            new DoubleListPlayer(secondsCards)
        ).run();

        new Game(
            new StackPlayer(firstCards),
            new StackPlayer(secondsCards)
        ).run();

        new Game(
            new DequeuePlayer(firstCards),
            new DequeuePlayer(secondsCards)
        ).run();

        new Game(
            new DequeuePlayer(firstCards),
            new QueuePlayer(secondsCards)
        ).run();

    }

    public static int[] readCards(int amount) {
        int[] cards = new int[amount];
        for (int i = 0; i < amount; ++i) {
            cards[i] = sc.nextInt();
        }
        return cards;
    }

}
