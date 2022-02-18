package com.example.corejava.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    Thread.sleep(1);

                }catch (Exception e){

                    System.out.println(e.getMessage());
                }

                System.out.println("Hashcode of Lazy : "+ LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager : "+ EagerCache.getInstance().hashCode());
                // ENUM is preferred approach
                System.out.println("Hashcode of Enum : "+ CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Hashcode of Lazy 1: "+ LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager 1: "+ EagerCache.getInstance().hashCode());
                // ENUM is preferred approach
                System.out.println("Hashcode of Enum 1: "+ CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

    }
}
