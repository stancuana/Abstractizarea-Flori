package com.company.model;

import java.util.ArrayList;

public class ControlFlori{

    ArrayList<Object> listaFlori;

    public ControlFlori(){

        this.listaFlori=new ArrayList<>();
        load();
    }

    public void load(){

        this.listaFlori=Utile.load("c:\\mycode\\JavaBasics\\OOP\\Abstractizarea\\Flori\\src\\com\\company\\resources\\File.txt","Trandafir");
    }

    public void afisare(){

        for(int i=0; i<listaFlori.size();i++){

            System.out.println(listaFlori.get(i).toString());
        }
    }


}
