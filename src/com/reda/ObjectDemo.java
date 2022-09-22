package com.reda;

public class ObjectDemo {
    public static void main(String[] args) {
        Calc c = new Calc(3,4);
        System.out.println(c.getResult());
    }
}

class Calc{
    int num1,num2,result;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = this.num1+this.num2;
    }

    public int getResult() {
        return result;
    }
}
