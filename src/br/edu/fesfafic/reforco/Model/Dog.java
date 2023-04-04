package br.edu.fesfafic.reforco.Model;

public class Dog extends Animal{
    public Dog(String name, int age, String species){
        super(name, age, species);
    }
    public void makeSound(){
        System.out.println("Au au!");
    }
}
