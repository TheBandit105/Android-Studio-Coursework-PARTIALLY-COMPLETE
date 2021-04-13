package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class LavaBlockSpec extends GameObjectSpec {
    private static final String id = "Death Block";
    private static final String bmpNA = "lava";
    private static final int frmno = 3;
    private static final float v = 0f;
    private static final PointF param = new PointF(1f, 1f);
    private static final String[] units = new String[]{
            "AnimatedGraphicsComponent",
            "InanimateBlockUpdateComponent"};

    public LavaBlockSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
