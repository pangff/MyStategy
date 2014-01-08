package com.pangff;

public class GoHome {

  public static void main(String[] args) {
    /**
     * 北京人回家
     */
    System.out.println("－－－－－－北京人回家－－－－－－－－－－－－");
    Person beijingPerson = new BeijingPerson();
    beijingPerson.goHome();
    
    /**
     * 近处人回家
     */
    System.out.println("－－－－－－近处城市的人默认回家方式－－－－－－－－－－－－--------------");
    Person nearPerson = new NearCityPerson();
    nearPerson.goHome();
    System.out.println("－－－－－－近处城市的人需要先坐汽车到火车站乘下火车后坐汽车到家－－－－－－－－－－－－");
    nearPerson.setGoHomeBehavior(new ByCar());
    nearPerson.goHome();
    nearPerson.setGoHomeBehavior(new ByTrain());
    nearPerson.goHome();
    nearPerson.setGoHomeBehavior(new ByCar());
    nearPerson.goHome();
    /**
     * 远处处人回家
     */
    System.out.println("－－－－－－－－远处城市的人默认回家方式－－－－－－－－－－－－--------------");
    Person farPerson = new FarCityPerson();
    farPerson.goHome();
    System.out.println("－－－－－－－－远处城市的人需要先坐汽车到飞机场乘下飞机后坐汽车到家－－－－－－－－－－－－");
    farPerson.setGoHomeBehavior(new ByCar());
    farPerson.goHome();
    farPerson.setGoHomeBehavior(new ByAir());
    farPerson.goHome();
    farPerson.setGoHomeBehavior(new ByCar());
    farPerson.goHome();
  }
}
