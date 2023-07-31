package com.company;

public class EagerSingleton {
    //avoid problem in multi threading accessing instance method
    private static final EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
