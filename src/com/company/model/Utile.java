package com.company.model;

import java.io.File;
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


}
