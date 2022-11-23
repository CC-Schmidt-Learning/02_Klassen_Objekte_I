package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Cat cat=new Cat("Grizabella","white",29 );

// output(cat.name);
// output(cat.furColor);
// output(String.valueOf(cat.age));

output(cat.getName());
output(cat.getFurColor());
output(String.valueOf(cat.getAge()));


 output("______________________");

Cat cat1 = new Cat("Alonzo", "grey", 35);
cat1.setFurColor("schwarz");
output(cat1.getName());
output(cat1.getFurColor());
output(String.valueOf(cat1.getAge()));
    }



    public static void output(String name) {
        System.out.println(name);
    }
}

