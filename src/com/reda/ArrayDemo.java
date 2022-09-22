package com.reda;

public class ArrayDemo {
    public static void main(String[] args) {
        Calcs c= new Calcs();
        System.out.println(c.add(2,23,45,657,67,65));
    }

}
class  Calcs{
    public int add(int ...n){
        int somme=0;
        for(int i:n)
                somme+=i;
        return somme;
    }
}