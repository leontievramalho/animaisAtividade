package br.edu.fesfafic.reforco.Model;

public class Lion extends Animal{
    public Lion(String name, int age, String species){
        super(name, age, species);
    }
    public void makeSound(){
        System.out.println("Raaaawrr!");
    }
}
