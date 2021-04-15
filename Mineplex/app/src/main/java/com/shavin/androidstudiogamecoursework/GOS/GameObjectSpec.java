package com.shavin.androidstudiogamecoursework.GOS;

import android.graphics.PointF;

public abstract class GameObjectSpec {
    private String ID;
    private String BmpNA;
    private float Velocity;
    private PointF Dimnson;
    private String[] Units;
    private int FPS;

    GameObjectSpec(String id,
                   String bmpNA,
                   float ms,
                   PointF dmsn,
                   String[] units,
                   int fps ){

        ID = id;
        BmpNA = bmpNA;
        Velocity = ms;
        Dimnson = dmsn;
        Units = units;
        FPS = fps;
    }

    public int getNumFrames(){
        return FPS;
    }

    public String getID(){
        return ID;
    }

    public String getBmpNa(){
        return BmpNA;
    }

    public float getVelocity(){
        return Velocity;
    }

    public PointF getDimnson(){
        return Dimnson;
    }

    public String[] getUnits(){
        return Units;
    }
}
