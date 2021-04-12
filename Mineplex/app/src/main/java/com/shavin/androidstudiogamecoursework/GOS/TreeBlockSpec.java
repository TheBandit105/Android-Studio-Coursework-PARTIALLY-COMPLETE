package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class TreeBlockSpec extends GameObjectSpec {
    private static final String id = "Static Block";
    private static final String bmpNA = "tree";
    private static final int frmno = 1;
    private static final float v = 0f;
    private static final PointF param = new PointF(3f, 6f);
    private static final String[] units = new String [] {
            "InanimateBlockGraphicsComponent",
            "DecorativeBlockUpdateComponent"};

    public TreeBlockSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
