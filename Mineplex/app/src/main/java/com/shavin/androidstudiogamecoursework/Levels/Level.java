package com.shavin.androidstudiogamecoursework.Levels;

import java.util.ArrayList;

public abstract class Level {
    // If you want to build a new level then extend this class
    ArrayList<String> blocks;
    public ArrayList<String> getBlocks(){
        return blocks;
    }
}
