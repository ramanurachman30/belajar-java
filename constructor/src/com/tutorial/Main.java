package com.tutorial;

// membuat class sebagai tamplate
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("Ini adalah constructor");
    // }

    //constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}


public class Main {
   public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rama","123423228","Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Anisah","1231238940","Perikanan");
   }
}
