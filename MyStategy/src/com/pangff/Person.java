package com.pangff;

public abstract class Person {
  private GoHomeBehavior goHomeBehavior;
  
  protected void setGoHomeBehavior(GoHomeBehavior goHomeBehavior){
    this.goHomeBehavior = goHomeBehavior;
  }
  public void goHome(){
    goHomeBehavior.go();
  }
}
