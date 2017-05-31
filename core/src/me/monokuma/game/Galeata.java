package me.monokuma.game;

import com.badlogic.gdx.math.Rectangle;

public class Galeata extends Rectangle implements PosGal{

    public Galeata() {
        super();
        x = 800 / 2 - 64 / 2;
        y = 20;
        width = 64;
        height = 64;
    }

    @Override
    public Rectangle getGal() {
        return this;
    }
}
