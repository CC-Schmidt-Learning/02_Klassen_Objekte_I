package com.cc.java;

public class Cat {

private String name;
private String furColor;
private int age;


public void setName(String name) {
  this.name = name;
}


public void setFurColor(String furColor) {
  this.furColor = furColor;
}


public void setAge(int age) {
  this.age = age;
}


// Ein Constructor ist immer ohne return-Wert 
public Cat(String name, String furColor, int age) {
  this.name =name;
  this.furColor=furColor;
  this.age=age;
}


public String getName() {
  return name;
}


public String getFurColor() {
  return furColor;
}

public int getAge() {
  return age;
}

}


