package com.example.corejava.EqualsAndHashcode;

import java.util.Objects;

public class DemoClass {

    private int a_ , b_;
    public DemoClass( int a , int b){
        a_=a;
        b_=b;
    }

        /*

            reflexive  : an object must equal itself -> x.equals(x)
            symmetric  : x.equals(y) must return the same result as y.equals(x)
            transitive : If x.equals(y) and y.equals(z) then also x.equals(z)
            consistent : the value of equals() should change only if a property that is contained in equals() changes
            null       : control x.equals(null)

         */

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof DemoClass)){
            return false;
        }

        DemoClass instance = (DemoClass)o;

        return Integer.compare(a_,instance.a_) == 0 && Integer.compare(b_,instance.b_) == 0;
    }


}
