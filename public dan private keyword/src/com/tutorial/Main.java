package com.tutorial;

class Player{
    String name; //default, dia akan bisa di baca dan ditulis dari luar class
    public int exp; //public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; //private, hanya akan bisa di baca dan ditulis di dalam class saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier
    void display(){
        tambahExp();// contoh mengakses private methods
        System.out.println("\nName\t :" + this.name);
        System.out.println("Exp\t :" + this.exp);
        System.out.println("Health\t :" + this.health); // membaca, tapi hanya bisa di dalam class
    }

    // public 
    public void newName(String newName) {
        this.name = newName;
    }

    private void tambahExp() {
        this.exp += 200;
    }
}

public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Rama",0,200);

        // default
        System.out.println(player1.name); // membaca data
        player1.name = "Nurachman"; // menulis data
        System.out.println(player1.name); // membaca data

        //public
        System.out.println(player1.exp); // membaca data
        player1.exp = 200; // menulis data
        System.out.println(player1.exp); // membaca data

        // private [tidak bisa di akses]
        // System.out.println(player1.health); // membaca data
        // player1.health = 200; // menulis data
        // System.out.println(player1.health); // membaca data

        // methods

        // default
        player1.display();

        // public
        player1.newName("suripjo");
        player1.display();

        //private tidak bisa di akses
        // player1.tambahExp();
    }
}