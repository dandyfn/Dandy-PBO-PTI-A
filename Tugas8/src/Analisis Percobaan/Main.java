package cek.dpraktek8;

import dparaktek4.hero;

public class Main {
    public static void main(String[] args) {
       
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    //upcasting
    Hero heroUp = (Hero)hero1;
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100);
    heroReg.display();
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    //heroUp dikembalikan ke hero1
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting 
  //  HeroAgility hero3 = (HeroAgility) heroup;
    //hero3.display();
    HeroAgility hero4 = new HeroAgility(null, 0);
    System.out.println(hero1.type);
    System.out.println(hero4.type);
    HeroMagic hero5 = new HeroMagic(null, 0, null);
    Hero hero6 = (Hero) hero5;
    HeroMagic hero7 = (HeroMagic) heroUp;
    
    
    }
    }