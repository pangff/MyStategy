package com.pangff;

public class BeijingPerson extends Person{

  public BeijingPerson(){
    setGoHomeBehavior(new ByCar());
  }

}
