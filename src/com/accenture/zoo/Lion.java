package com.accenture.zoo;

import com.accenture.javajoggers.Animal;

public class Lion extends Animal {

  public Lion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getLaut() {
    return "brüllt";
  } 

}
