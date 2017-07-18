package com.mwqdev.projectTwo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        GamePiece pieceOne = new GamePiece();

        int randomX;
        int randomY;

        if (!pieceOne.frozen) {
            pieceOne.freeze();
        }

        System.out.println(pieceOne.frozen);

        if (pieceOne.frozen) {
            pieceOne.unfreeze();
        }

        System.out.println(pieceOne.frozen);

        if (!pieceOne.frozen) {
            randomX = random.nextInt(50) + 1;
            randomY = random.nextInt(50) + 1;
            pieceOne.move(randomX, randomY);
        }

        System.out.println(pieceOne.getPositionX());
        System.out.println(pieceOne.getPositionY());
    }
}
