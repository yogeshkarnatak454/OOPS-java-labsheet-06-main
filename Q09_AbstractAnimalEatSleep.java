abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion rests in its territory");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in a sheltered place");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass and leaves");
    }

    @Override
    void sleep() {
        System.out.println("Deer rests in a safe area");
    }
}

public class Q09_AbstractAnimalEatSleep {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Tiger(), new Deer()};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}
