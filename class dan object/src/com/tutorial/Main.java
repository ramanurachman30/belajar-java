package com.tutorial;

// membuat class sebagai tamplate
class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    double IPK; 
    int umur;
}


public class Main {
   public static void main(String[] args) throws Exception {
        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "rama ganteng ga kuat";
        mahasiswa1.NIM = "123074903";
        mahasiswa1.Jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 9.6;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Kamu😁";
        mahasiswa2.NIM = "1685073253";
        mahasiswa2.Jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 5.6;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.Jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
   }
}
