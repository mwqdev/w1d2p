package com.mwqdev.projectTwo;

public class GamePiece {

    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;
    String powerLevel;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(String powerLevel) {
        this.powerLevel = powerLevel;
    }

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }

    public void move(int posX, int posY) {
        if (this.frozen) {
            System.out.println("Can't move. You're frozen!");
        } else {
            this.positionX = posX;
            this.positionY = posY;
        }
    }

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }

}
