package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class OtherworldSceneSpec extends GameObjectSpec {
    // This is all the specifications for the Otherworld Scene.
    private static final String id = "Scene";
    private static final String bmpNA = "otherworld";
    private static final int frmno = 1;
    private static final float v = 3f;
    private static final PointF param = new PointF(100, 70f);
    private static final String[] units = new String [] {
            "BackgroundGraphicsComponent",
            "BackgroundUpdateComponent"};

    public OtherworldSceneSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
