package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class StalactiteBlockSpec extends GameObjectSpec {
    private static final String tag = "Static Block";
    private static final String bitmapName = "stalactite";
    private static final int framesOfAnimation = 1;
    private static final float speed = 0f;
    private static final PointF size = new PointF(2f, 4f);
    private static final String[] components = new String [] {
            "InanimateBlockGraphicsComponent",
            "DecorativeBlockUpdateComponent"};

    public StalactiteBlockSpec() {
        super(tag, bitmapName, speed, size,
                components, framesOfAnimation);
    }
}
