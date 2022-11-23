package com.cc.java;

public class Cat {

public static final String furcolor = null;
public String name = "nobody";
public String furColor;
public int age;

public String tellYourName() {
return this.name;
}
public String tellYourfurColor() {
  return this.furColor;
  }
public int tellYourAge() {
    return this.age;
    }


 public void tellYourAdress ()
 {
  System.out.println("Blick von innen: " + this);
}

}
