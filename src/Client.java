import Pets.InterfacePet;

/**
 * Created by san95 on 16.11.2016.
 */
public class Client {
    private String name;
    private InterfacePet pet;

    public Client(String name, InterfacePet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setPet(String name) {
        this.pet.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfacePet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
