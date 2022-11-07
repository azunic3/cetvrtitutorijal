package org.example;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        if(args[0].equals("sinus"))
        System.out.println(matematika.sinus(Double.parseDouble(args[1])));
 else if(args[0].equals("faktorijel")){
            System.out.println(matematika.faktorijel(Double.parseDouble(args[1])));
        }
        else {
            System.out.println("Greska");
        }
    }
}
