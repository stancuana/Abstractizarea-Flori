package com.company.model;

public class Lalea extends Floare {


    private String stadiuDeDezvoltare;


    public Lalea(String atribute){

        super(atribute);
        this.stadiuDeDezvoltare=atribute.split(",")[0];
    }

    public Lalea(int id, String culoare, int nrPetale, String tipMiros,String stadiuDeDezvoltare){

        super(id,"Lalea",culoare,nrPetale,tipMiros);
        this.stadiuDeDezvoltare=stadiuDeDezvoltare;
    }


    public String getStadiuDeDezvoltare() {
        return stadiuDeDezvoltare;
    }

    public void setStadiuDeDezvoltare(String stadiuDeDezvoltare) {
        this.stadiuDeDezvoltare = stadiuDeDezvoltare;
    }


    @Override
    public String toString(){

        return super.toString()+
                "Stadiu de dezvoltare: "+this.stadiuDeDezvoltare;
    }

    @Override
    public boolean equals(Object object){
        Lalea lalea=(Lalea) object;

        return super.equals(lalea);
    }

    @Override
    void numeFloare(){

        System.out.println("Numele florii este: "+this.getNume());
    }

    @Override
    Lalea returnFloareById(Object object){

        Lalea lalea=(Lalea) object;

        if(this.getId()==lalea.getId()){

            return lalea;
        }
        return null;
    }

    @Override
    String culoareFloare(){

        System.out.println("Culoarea florii este: ");
        return this.getCuloare();
    }
}
