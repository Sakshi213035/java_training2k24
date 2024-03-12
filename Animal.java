public class Animal {
    void makeSound(){
        System.out.println("the animal makes a sound..");
    }

    public static void main(String[] args) {
        //creating objects for classes
        Animal a=new Animal();
        a.makeSound();
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
