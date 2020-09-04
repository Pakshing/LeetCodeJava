package Week2;

class Felidae {
    public void talk() {
        System.out.print("Rrr, ");
    }
}

class Cat extends Felidae {
    public void talk() {
        System.out.print("Purr, ");
    }
}

class Tiger extends Felidae {
    public void eat() {
        System.out.println("Eating deer");
    }
}

public class Test {
    public static void main(String[] args) {
        Cat kot = new Cat();
        kot.talk();

        Tiger joe = new Tiger();
        joe.talk();
        joe.eat();
    }
}
