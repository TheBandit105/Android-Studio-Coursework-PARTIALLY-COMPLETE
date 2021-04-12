package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public class GravelMoundBlock extends GameObjectSpec {
        private static final String id = "Inert Tile";
        private static final String bmpNA = "gravel_mound";
        private static final int frmno = 1;
        private static final float v = 0f;
        private static final PointF param = new PointF(2f, 1f);
        private static final String[] units = new String [] {
                "InanimateBlockGraphicsComponent",
                "InanimateBlockUpdateComponent"};

        public GravelMoundBlock() {
            super(id, bmpNA, v, param,
                    units, frmno);
        }
}
