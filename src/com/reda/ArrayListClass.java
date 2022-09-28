package com.reda;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> allProduct = new ArrayList<>();
//
//        ArrayList<String> fruitList = new ArrayList<>();
//        fruitList.add("Banane");
//        fruitList.add("Appl");
//        fruitList.add("Ananas");
//        System.out.println(fruitList);
//
//        ArrayList<String> cakeList = new ArrayList<>();
//        cakeList.add("Cake");
//        cakeList.add("donuts");
//        cakeList.add("biscuit");
//        System.out.println(cakeList);
//
//        allProduct.add(fruitList);
//        allProduct.add(cakeList);
//
//        System.out.println(allProduct);
//        System.out.println(allProduct.get(0).get(2));

//        declare an array
//        ArrayList<String> animals = new ArrayList<>();
//        animals.add("cats");
//        animals.add("dogs");
//        animals.add("lions");
//        animals.add("birds");
//        for(String i:animals)
//            System.out.println(i);
        System.out.println(add(1,3,4,5,3,45,56,5,57));

    }

    static int add(int... a){
       int sum=0;
        for(int i:a)
            sum+=i;
        return sum;
    }

}
