package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class OvergroundSceneSpec extends GameObjectSpec {
    // This is all the unique specifications for the Overground scene.
    private static final String id = "Scene";
    private static final String bmpNA = "overground";
    private static final int frmno = 1;
    private static final float v = 3f;
    private static final PointF param = new PointF(100, 70);
    private static final String[] units = new String [] {
            "BackgroundGraphicsComponent","BackgroundUpdateComponent"};

    public OvergroundSceneSpec() {
        super(id, bmpNA, v, param, units, frmno);
    }
}
