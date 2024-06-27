/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.claces;

/**
 *
 * @author User
 */
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Dog_Pig extends Animal {
  public void animalSound() {
    System.out.println("The dog and pig play");
  }
}



class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    Animal myDog_Pig = new Dog_Pig();
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    myDog_Pig.animalSound();
  }
}
