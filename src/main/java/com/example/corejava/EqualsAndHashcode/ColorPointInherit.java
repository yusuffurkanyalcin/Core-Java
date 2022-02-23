package com.example.corejava.EqualsAndHashcode;


import java.awt.*;
import java.util.Objects;

public class ColorPointInherit extends Point{

    private final Color color_;

    public ColorPointInherit(int x , int y, Color color){
        super(x,y);
        color_=color;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof ColorPointInherit)){
            return false;
        }
        return super.equals(o) && ((ColorPointInherit)o).color_ == color_;
    }

}
