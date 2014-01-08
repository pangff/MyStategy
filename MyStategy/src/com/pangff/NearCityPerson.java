package com.pangff;

public class NearCityPerson extends Person{

  public NearCityPerson(){
    setGoHomeBehavior(new ByTrain());
  }

}
