package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class JaggedRockFloorBlockSpec extends GameObjectSpec {
    private static final String id = "Static Block";
    private static final String bmpNA = "jagged_rock_floor";
    private static final int frmno = 1;
    private static final float v = 0f;
    private static final PointF param = new PointF(2f, 4f);
    private static final String[] units = new String [] {
            "InanimateBlockGraphicsComponent",
            "DecorativeBlockUpdateComponent"};

    public JaggedRockFloorBlockSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
