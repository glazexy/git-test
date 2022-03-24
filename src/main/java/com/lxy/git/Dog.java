package com.lxy.git;

public class Dog extends Animal{
     String color1 = "black";
    @Override
    public void eat() {
        System.out.println("dog   eat----");
    }

    public void dream(){
        System.out.println(111);
    }
}
