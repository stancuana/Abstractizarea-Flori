package com.company.model;

public class Trandafir extends Floare{

    private String tipTulpina;
    private String specieTrandafir;

    public Trandafir(String atribute){

        super(atribute);
        this.tipTulpina=atribute.split(",")[0];
        this.specieTrandafir=atribute.split(",")[1];
    }

    private Trandafir(int id,String culoare, int nrPetale, String tipMiros, String tipTulpina, String specieTrandafir){

        super(id,"Trandafir",culoare,nrPetale,tipMiros);
        this.tipTulpina=tipTulpina;
        this.specieTrandafir=specieTrandafir;
    }


    public String getTipTulpina() {
        return tipTulpina;
    }

    public void setTipTulpina(String tipTulpina) {
        this.tipTulpina = tipTulpina;
    }

    public String getSpecieTrandafir() {
        return specieTrandafir;
    }

    public void setSpecieTrandafir(String specieTrandafir) {
        this.specieTrandafir = specieTrandafir;
    }

    @Override
    public String formatToSave(){

        return super.formatToSave()+","+this.getTipTulpina()+","+this.getSpecieTrandafir();
    }

    @Override
    public String toString(){
        return super.toString()+
                "Tip tulpina: "+this.tipTulpina+"\n"+
                "Specie trandafir: "+this.specieTrandafir+"\n";
    }

    @Override
    public boolean equals(Object object){
        Trandafir trandafir=(Trandafir) object;

        return super.equals(trandafir);
    }

    @Override
    void numeFloare(){

        System.out.println("Numele florii este: "+this.getNume());
    }

    @Override
    Trandafir returnFloareById(Object object){

        Trandafir trandafir=(Trandafir) object;

        if(this.getId()==trandafir.getId()){

            return trandafir;
        }
        return null;
    }

    @Override
    String culoareFloare(){

        System.out.println("Culoarea florii este: ");
        return this.getCuloare();
    }
}
