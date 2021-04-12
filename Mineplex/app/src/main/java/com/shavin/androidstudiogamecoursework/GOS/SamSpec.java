package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class SamSpec extends GameObjectSpec {
    // This is all the unique specifications for the main character of the game, Sam.
    private static final String id = "Sam";
    private static final String bmpNA = "sam";
    private static final int frmno = 5;
    private static final float v = 10f;
    private static final PointF param = new PointF(1f, 2f);
    private static final String[] units = new String [] {
            "PlayerInputComponent",
            "AnimatedGraphicsComponent",
            "PlayerUpdateComponent"};

    public SamSpec() {
        super(id, bmpNA, v,
                param, units, frmno);
    }
}
