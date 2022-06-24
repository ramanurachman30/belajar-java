package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter 
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // SETTER
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // GETTER
    public double getJari2(){
        return this.diameter/2;
    }

    // getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}


public class Main{
    public static void main(String[] args) {
        Data object = new Data();

        // read and write dengan menggunakan public
        object.intPublic = 5; // Write
        System.out.println("Public : " + object.intPublic); // Read

        // read only (kita bisa menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        // write only (kita hanya bisa menulis saja menggunakan SETTER)
        object.setDoublePrivate(0.005);
        object.display();

        // Gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(10);
        System.out.println("Jari-jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari-jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());
    }
}