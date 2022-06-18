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

    public void addFloare(Floare floare){

        Utile.addObject(floare,listaFlori);
    }

    public int nrElemLista(){

        return Utile.nrObiecteInLista(listaFlori);
    }

    public int nextAvailableId(){

        return Utile.nextAvailableId(listaFlori);
    }


}
