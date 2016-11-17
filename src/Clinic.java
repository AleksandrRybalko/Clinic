/**
 * Created by san95 on 16.11.2016.
 */
public class Clinic {
    private final int size;
    private final Client[] clients;

    public Clinic(int size) {
        this.size = size;
        this.clients = new Client[size];
    }

    public boolean addClient(Client client) {
        boolean isAdded = false;
        for (int i = 0; i < size; i++) {
            if (clients[i] == null) {
                clients[i] = client;
                isAdded = true;
                break;
            }
        }
        return isAdded;
    }

    public String findByClientsName(String clientName) {
        Client client = null;
        for (int i = 0; i < size; i++) {
            if (clients[i] != null && clients[i].getName().equals(clientName)) {
                client = clients[i];
                break;
            }
        }
        if (client != null) {
            return client.getPet().toString();
        }
        return "The client is not found";
    }

    public String findByPetsName(String petName) {
        Client client = null;
        for (int i = 0; i < size; i++) {
            if (clients[i] != null && clients[i].getPet().getName().equals(petName)) {
                client = clients[i];
                break;
            }
        }
        String result = "The pet is not found";
        if (client != null) {
            result = client.toString();
        }
        return result;
    }

    public boolean changeClientsName(String oldName, String newName) {
        boolean isChange = false;
        for (int i = 0; i < size; i++) {
            if (clients[i] != null && clients[i].getName().equals(oldName)) {
                clients[i].setName(newName);
                isChange = true;
                break;
            }
        }

        return isChange;
    }

    public boolean changePetsName(String oldName, String newName) {
        boolean isChange = false;
        for (int i = 0; i < size; i++) {
            if (clients[i] != null && clients[i].getPet().getName().equals(oldName)) {
                clients[i].setPet(newName);
                isChange = true;
                break;
            }
        }
        return isChange;
    }

    public boolean deleteClient(String clientName) {
        boolean isDelete = false;
        for (int i = 0; i < size; i++)
        {
            if (clients[i] != null && clients[i].getName().equals(clientName)){
                clients[i] = null;
                isDelete = true;
                break;
            }
        }
        return isDelete;
    }

    public boolean deletePet(String petName) {
        boolean isDelete = false;
        for (int i = 0; i < size; i++)
        {
            if (clients[i] != null && clients[i].getPet().getName().equals(petName)){
                clients[i] = null;
                isDelete = true;
                break;
            }
        }
        return isDelete;
    }
}
