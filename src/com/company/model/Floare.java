package com.company.model;

public abstract class Floare {

    private int id;
    private String nume;
    private String culoare;
    private int nrPetale;
    private String tipMiros;


    public Floare(String atribute){

        this.id=Integer.parseInt(atribute.split(",")[0]);
        this.nume=atribute.split(",")[1];
        this.culoare=atribute.split(",")[2];
        this.nrPetale=Integer.parseInt(atribute.split(",")[3]);
        this.tipMiros=atribute.split(",")[4];
    }

    public Floare(int id, String nume, String culoare, int nrPetale, String tipMiros){

        this.id=id;
        this.nume=nume;
        this.culoare=culoare;
        this.nrPetale=nrPetale;
        this.tipMiros=tipMiros;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getNrPetale() {
        return nrPetale;
    }

    public void setNrPetale(int nrPetale) {
        this.nrPetale = nrPetale;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getTipMiros() {
        return tipMiros;
    }

    public void setTipMiros(String tipMiros) {
        this.tipMiros = tipMiros;
    }


    @Override
    public String toString(){
        return "Id: "+this.id+"\n"+
                "Nume: "+this.nume+"\n"+
                "Culoare: "+this.culoare+"\n"+
                "Numar petale: "+this.nrPetale+"\n"+
                "Tip miros: "+this.tipMiros+"\n";
    }

    @Override
    public boolean equals(Object object){

        Floare floare=(Floare) object;
        return (this.id==floare.id && this.nume.equals(floare.nume));

    }

    abstract void numeFloare();
    abstract Object returnFloareById(Object object);
    abstract String culoareFloare();
}
