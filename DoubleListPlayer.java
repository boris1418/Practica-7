package com.company;

import java.util.ArrayList;

public class DoubleListPlayer implements Player {

    private ArrayList<Integer> queue;

    public DoubleListPlayer(int []cards) {

        queue = new ArrayList<>();

        for (int i = cards.length - 1; i >= 0; --i) {
            queue.add(cards[i]);
        }

    }

    @Override
    public int getCard() {
        int result = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return result;
    }

    @Override
    public int getCardsCount() {
        return queue.size();
    }

    @Override
    public void pushCards(int first, int second) {
        queue.add(0, first);
        queue.add(0, second);
    }

}


