package com.meli.javatest.Evento;

import java.util.Scanner;

public class Evento {

    Scanner myObj = new Scanner(System.in);

    public double getDouble(){
        return myObj.nextDouble();
    }

    public int getInt(){
        return myObj.nextInt();
    }

    public String getString(){
        return myObj.nextLine();
    }

}
