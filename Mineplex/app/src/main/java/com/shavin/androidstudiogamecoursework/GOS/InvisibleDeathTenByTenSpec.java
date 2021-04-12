package com.shavin.androidstudiogamecoursework.GOS;
import android.graphics.PointF;

public class InvisibleDeathTenByTenSpec extends GameObjectSpec {
    private static final String id = "Death";
    private static final String bmpNA = "death_invisible";
    private static final int frmno = 1;
    private static final float v = 0f;
    private static final PointF param = new PointF(10f, 10f);
    private static final String[] units = new String[]{"InanimateBlockGraphicsComponent", "InanimateBlockUpdateComponent"};

    public InvisibleDeathTenByTenSpec() {
        super(id, bmpNA, v, param, units, frmno);
    }
}
