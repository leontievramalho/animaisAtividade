package br.edu.fesfafic.reforco.Main;

import br.edu.fesfafic.reforco.Model.Animal;
import br.edu.fesfafic.reforco.Model.Cat;
import br.edu.fesfafic.reforco.Model.Dog;
import br.edu.fesfafic.reforco.Model.Lion;

public class Main {


    public static void main(String[] args){
        Cat meowth = new Cat("Jorge", 3, "Meowth");
        Dog houndour = new Dog("Douglas", 5, "Houndour");
        Lion pyroar = new Lion("Simba", 7, "Pyroar");
        meowth.makeSound();
        houndour.makeSound();
        pyroar.makeSound();
        System.out.println(meowth);

    }
}
