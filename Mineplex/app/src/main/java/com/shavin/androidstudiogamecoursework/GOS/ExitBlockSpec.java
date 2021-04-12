package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class ExitBlockSpec extends GameObjectSpec {

    private static final String id = "Exit Block";
    private static final String bmpNA = "exit";
    private static final int frmno = 1;
    private static final float v = 0f;
    private static final PointF param = new PointF(3f, 3f);
    private static final String[] units = new String[]{
            "InanimateBlockGraphicsComponent",
            "InanimateBlockUpdateComponent"};

    public ExitBlockSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
