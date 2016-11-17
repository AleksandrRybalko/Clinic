package Pets;

/**
 * Created by san95 on 16.11.2016.
 */
public abstract class AbstractPet implements InterfacePet {

    private String name;
    private String pet;

    public AbstractPet(String name, String pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    public String getPet() {
        return pet;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pet='" + pet + '\'' +
                '}';
    }
}
