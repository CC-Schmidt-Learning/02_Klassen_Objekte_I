package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Cat cat=new Cat();
cat.name="Grisabella";
cat.furColor="white";
cat.age=29;

// output(cat.name);
// output(cat.furColor);
// output(String.valueOf(cat.age));

output(cat.tellYourName());
output(cat.tellYourfurColor());
output(String.valueOf(cat.tellYourAge()));

App.output(String.valueOf(2));

 output("______________________");


        Cat cat1=new Cat();
        output("Ich bin eine " + cat1);
        cat1.tellYourAdress();
    }



    public static void output(String name) {
        System.out.println(name);
    }


    public static void tellyouradress() {
       System.out.println("Hello"); 
    }

}

