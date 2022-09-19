package com.reda;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String replay = "oui";
        Scanner scan = new Scanner(System.in);
        while (replay.contains("oui")){
            System.out.println("Donner Un numero");
            int number =Integer.parseInt(scan.nextLine());
            //String result = ;
            System.out.println((number % 2 == 0)?"le nombre est paire": "le nombre est impair");
           //12 scan.close();
            System.out.println("Voulez-vous rejouer ? si oui TAPER 'oui' sinon taper n'importe quel boutton .");
            replay = scan.nextLine();
        }
        System.out.println("Aurevoir !!!");
    }

}
