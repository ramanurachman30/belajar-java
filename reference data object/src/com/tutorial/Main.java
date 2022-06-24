package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }      

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }

}

public class Main{
    public static void main(String[] args) {
        Buku buku = new Buku("Bung Karno", "Tere Liye");
        buku.display();

        String addressBuku = Integer.toHexString(System.identityHashCode(buku));
        System.out.println(addressBuku);

        // assignment object
        Buku buku2 = buku;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku dan buku2 berada pada address atau referensi yang sama
        buku2.judul = "aku sayang kamu";
        buku.display();
        buku2.display();

        // kita akan memasukkan object kedalam methods
        fungsi(buku2);
        buku.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address Dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Tere liyer";
    }
}