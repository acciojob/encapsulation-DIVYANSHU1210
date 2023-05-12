package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        try {
//            obj.name = "tom";
//        }
//        catch (Exception e){
//            System.out.print("you might seen some error, please not it down in commnets");
//        }

        obj.setname("tom");
        System.out.print(obj.getname());
    }
}