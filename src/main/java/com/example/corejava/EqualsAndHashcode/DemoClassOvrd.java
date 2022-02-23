package com.example.corejava.EqualsAndHashcode;

public class DemoClassOvrd {

    private int a_,b_;

    public DemoClassOvrd(int a, int b) {
        a_ = a;
        b_ = b;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this){
            return true;
        }
        if(!(o instanceof DemoClassOvrd)){
            return false;
        }

        DemoClassOvrd instance = (DemoClassOvrd)o;

        return Integer.compare(a_,instance.a_) == 0 && Integer.compare(b_,instance.b_) == 0;
    }

    @Override
	public int hashCode() {
		int result = Integer.hashCode(b_);
		result = 31*result + Integer.hashCode(a_);
		return result;
	}
}
