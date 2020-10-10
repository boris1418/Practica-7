package com.company;

import java.util.Stack;

public class StackPlayer implements Player {

    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public StackPlayer(int []cards) {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
        for (int i = cards.length - 1; i >= 0; --i) {
           firstStack.push(cards[i]);
        }
    }

    @Override
    public int getCard() {
        if (firstStack.empty()) {
            while (!secondStack.empty()) {
                firstStack.push(secondStack.pop());
            }
        }
        return firstStack.pop();
    }

    @Override
    public int getCardsCount() {
        return firstStack.size() + secondStack.size();
    }

    @Override
    public void pushCards(int first, int second) {
        secondStack.push(second);
        secondStack.push(first);
    }

}
