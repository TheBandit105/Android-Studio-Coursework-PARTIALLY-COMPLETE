package com.shavin.androidstudiogamecoursework.GOS;


import android.graphics.PointF;

public class WoodLiftBlockSpec extends GameObjectSpec {
    private static final String id = "Non-static Block";
    private static final String bmpNA = "wood_lift";
    private static final int frmno = 1;
    private static final float v = 3f;
    private static final PointF param = new PointF(2f, 1f);
    private static final String[] units = new String [] {
            "InanimateBlockGraphicsComponent",
            "MovableBlockUpdateComponent"};

    public WoodLiftBlockSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
