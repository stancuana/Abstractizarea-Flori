package com.company;

import com.company.model.ControlFlori;
import com.company.model.Lalea;

public class Main {

    public static void main(String[] args) {

        Lalea lalea=new Lalea(4,"rosie",4,"dulce","bulb");
        ControlFlori controlFlori=new ControlFlori();
        controlFlori.addFloare(lalea);
        System.out.println(controlFlori.nrElemLista());
    }
}
