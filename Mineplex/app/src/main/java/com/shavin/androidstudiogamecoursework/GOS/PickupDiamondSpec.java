package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class PickupDiamondSpec extends GameObjectSpec {
    private static final String id = "Item";
    private static final String bmpNA = "diamond";
    private static final int frmno = 1;
    private static final float v = 0f;
    private static final PointF param = new PointF(1f, 1f);
    private static final String[] units = new String [] {
            "InanimateBlockGraphicsComponent",
            "InanimateBlockUpdateComponent"};

    public PickupDiamondSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
