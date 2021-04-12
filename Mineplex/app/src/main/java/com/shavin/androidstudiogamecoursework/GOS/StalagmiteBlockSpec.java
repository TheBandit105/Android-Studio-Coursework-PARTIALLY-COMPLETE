package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class StalagmiteBlockSpec extends GameObjectSpec {
    private static final String tag = "Static Block";
    private static final String bitmapName = "stalagmite";
    private static final int framesOfAnimation = 1;
    private static final float speed = 0f;
    private static final PointF size = new PointF(2f, 4f);
    private static final String[] components = new String [] {
            "InanimateBlockGraphicsComponent",
            "DecorativeBlockUpdateComponent"};

    public StalagmiteBlockSpec() {
        super(tag, bitmapName, speed, size,
                components, framesOfAnimation);
    }
}
