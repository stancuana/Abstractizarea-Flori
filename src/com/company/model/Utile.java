package com.company.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  abstract class Utile {

    public  static ArrayList<Object> load(String path , String className) {

        ArrayList<Object>flori= new ArrayList<>();
        try {

            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String text = scanner.nextLine();

                if (className == "Lalea") {

                    Lalea lalea=new Lalea(text);
                    flori.add(lalea);

                }
                if(className=="Trandafir"){

                    Trandafir trandafir=new Trandafir(text);
                    flori.add(trandafir);
                }
            }
            return  flori;

        } catch (Exception e){

            e.printStackTrace();
        }
        return null;
    }

    public static void addObject(Object object, ArrayList lista){

        ArrayList<Object> list=lista;

        list.add(object);
    }

    public static int pozCource(int id,ArrayList lista){

        int poz=-1;

        for(int i=0; i<lista.size();i++){

            if(lista.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    private static String toSave(ArrayList lista){
        String text="";
        for(Object object:lista){
            text+=object.formatToSave()+"\n";
        }
        return text;
    }

    public static void save(String path,ArrayList lista){

        try{

            File file=new File(path);

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(toSave(lista));

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public static void deleteObjectFromList(int id,ArrayList lista){
        int poz=pozCource(id,lista);
        if(poz!=-1){
            lista.remove(poz);
        }
    }

    public static int nextAvailableId(ArrayList lista){

        if(lista.size()>0){
            return lista.get(lista.size()+1).getId()+1;
        }

        return 0;
    }

    public static int nrObiecteInLista(ArrayList lista){

        int contor=0;

        for(int i=0; i<lista.size();i++){

            contor++;
        }

        return contor;
    }

    public static Object retrunCursById(int ObjectId, ArrayList lista){


        for(int i=0; i<lista.size();i++){

            if(lista.get(i).getId()==courceId){

                return  lista.get(i);
            }
        }
        return null;
    }




}
