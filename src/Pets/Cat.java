package Pets;

/**
 * Created by san95 on 16.11.2016.
 */
public class Cat extends AbstractPet {

    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Mav Mav");
    }
}
