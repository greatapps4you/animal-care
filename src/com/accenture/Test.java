package com.accenture;

import com.accenture.petshop.Dog;
import com.accenture.javajoggers.Animal;
import com.accenture.zoo.Lion;
import com.accenture.savanna.Zebra;

class Test {
  public static void main(String[] args){
    System.out.println("======================================");
    System.out.println("|      WELCOME TO ANIMAL CARE         |");
    System.out.println("======================================");

    Animal animal = new Dog("Dog");
    System.out.println(animal.getName());
    System.out.println(animal.getLaut());

    animal = new Lion("Lion");
    System.out.println(animal.getName());
    System.out.println(animal.getLaut());

    animal = new Zebra("Zebra");
    System.out.println(animal.getName());
    System.out.println(animal.getLaut());
  }
}
