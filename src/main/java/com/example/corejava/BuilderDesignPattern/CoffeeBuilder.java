package com.example.corejava.BuilderDesignPattern;

public class CoffeeBuilder {

    // definite
    private String size;

    // optional
    private boolean withMilk;
    private boolean light;
    private boolean black;

    public CoffeeBuilder(Builder builder){

        size = builder.size;
        withMilk = builder.withMilk;
        light = builder.light;
        black = builder.black;

    }

    public static class Builder{

        // definite
        private String size;

        // optional
        private boolean withMilk;
        private boolean light;
        private boolean black;


        public Builder(String size){
            this.size=size;
        }


        public Builder lightCoffe(boolean light){

            this.light=light;

            return this;
        }


        public Builder blackCoffe(boolean black){

            this.black=black;

            return this;
        }


        public Builder coffeWithMilk(boolean withMilk){

            this.withMilk=withMilk;

            return this;
        }


        public CoffeeBuilder build(){

            return new CoffeeBuilder(this);
        }

    }

}

