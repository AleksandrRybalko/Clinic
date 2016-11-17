package Pets;

/**
 * Created by san95 on 17.11.2016.
 */
public class Mouse extends AbstractPet{

    public Mouse(String name) {
        super(name, "Mouse");
    }

    @Override
    public void makeSound() {
        System.out.println("Pi-Pi");
    }
}
