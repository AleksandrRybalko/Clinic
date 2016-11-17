package Pets;

/**
 * Created by san95 on 16.11.2016.
 */
public class Dog extends AbstractPet{

    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("gav gav");
    }
}
