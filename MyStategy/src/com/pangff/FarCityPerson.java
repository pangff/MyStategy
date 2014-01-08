package com.pangff;

public class FarCityPerson extends Person{

  public FarCityPerson(){
    setGoHomeBehavior(new ByAir());
  }
}
