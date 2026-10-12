class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!"); // Cat's sound
    }
}

public class Q01_AnimalCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
