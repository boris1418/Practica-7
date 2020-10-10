package com.company;

import java.util.ArrayDeque;

public class DequeuePlayer implements Player {

    private ArrayDeque<Integer> queue;

    public DequeuePlayer(int []cards) {

        queue = new ArrayDeque<>();

        for (int i = cards.length - 1; i >= 0; --i) {
            queue.add(cards[i]);
        }

    }

    @Override
    public int getCard() {
        return queue.poll();
    }

    @Override
    public int getCardsCount() {
        return queue.size();
    }

    @Override
    public void pushCards(int first, int second) {
        queue.push(second);
        queue.push(first);
    }

}

