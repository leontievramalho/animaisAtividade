package br.edu.fesfafic.reforco.Model;

public class Cat extends Animal{
    public Cat(String name, int age, String species){
        super(name, age, species);
    }
    public void makeSound(){
        System.out.println("Miau!");
    }
}
