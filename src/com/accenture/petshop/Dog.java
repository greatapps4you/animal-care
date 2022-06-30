package com.accenture.petshop;

import com.accenture.javajoggers.Animal;

public class Dog extends Animal {
  
  public Dog(String name) {
    this.name = name;
  }

  public String getLaut() {
     return "bellt";
  }

  public String getName() {
    return name;
  }

}
