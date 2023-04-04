package br.edu.fesfafic.reforco.Model;

public abstract class Animal {
    public String name;
    public int age;
    public String species;

    public Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpecies(){
        return this.species;
    }

    public abstract void makeSound();

   @Override
    public String toString(){
        return "Animal{" +
                "nome='" + this.name + '\'' +
                ", idade='" + this.age + '\'' +
                ", espécie='" + this.species + "'}";

    }
}
