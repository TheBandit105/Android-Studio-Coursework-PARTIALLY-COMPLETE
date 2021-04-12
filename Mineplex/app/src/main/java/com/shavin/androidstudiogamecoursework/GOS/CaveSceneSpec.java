package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class CaveSceneSpec extends GameObjectSpec {
    // This is all the specifications for the cave scene.
    private static final String id = "Scene";
    private static final String bmpNA = "cave";
    private static final int frmno = 1;
    private static final float v = 3f;
    private static final PointF param = new PointF(100, 70);
    private static final String[] units = new String [] {
            "BackgroundGraphicsComponent",
            "BackgroundUpdateComponent"};

    public CaveSceneSpec() {
        super(id, bmpNA, v, param,
                units, frmno);
    }
}
