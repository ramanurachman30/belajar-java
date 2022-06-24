package com.tutorial;

// player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.deffence(attackPower);
    }

    void deffence(double attackPower){
        // akan mengambil damage nya
        double damage;
        if(this.armor.deffencePower < attackPower){
            damage = attackPower - this.armor.deffencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health+" hp");
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , power : " + this.attackPower);
    }
}

// armor
class Armor{
    double deffencePower;
    String name;

    Armor(String name, double deffencePower){
        this.name = name;
        this.deffencePower = deffencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , power : " + this.deffencePower);
    }
}

public class Main{
    
    public static void main(String[] args) {
        
        // membuat object player
        Player player1 = new Player("Ramsky", 200);
        Player player2 = new Player("Dimas", 50);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang",999);
        Weapon bolaKertas = new Weapon("Bola Kertas", 2);

        // membuat object armor
        Armor diamond = new Armor("Diamond",999);
        Armor kulitSendiri = new Armor("Kulit Sendiri", 50);

        // equip senjata dan armor
        // player1
        player1.equipWeapon(pedang);
        player1.equipArmor(diamond);
        player1.display();

        // player3
        player2.equipWeapon(bolaKertas);
        player2.equipArmor(kulitSendiri);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEPISODE 1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEPISODE 2");
        player2.attack(player1);
        player1.display();
        player2.display();
        // player1.deffence(player2);
    }
}