package com.tutorial;

class Mahasiswa{
    //data member
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    //method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " Juga, " + "Hai perkenalkan nama saya " + this.nama;
    }
}

public class Main{
     public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("rama","74623811");
        // Mahasiswa mahasiswa2 = new Mahasiswa("slebew","11921038");
        mahasiswa1.show();
        // mahasiswa2.show();
        mahasiswa1.setNama("ucup");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}