import Pets.*;
import java.util.Scanner;

/**
 * Created by san95 on 16.11.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Clinic clinic = new Clinic(100);
        String exit = "no";
        while (exit.equals("no")){
            System.out.println("\nWhat do you want? (enter the number)\n1. Add new Client\n" +
                    "2. Find info by clients name\n3. Find info by pets name\n" +
                    "4. Change clients name\n5. Change pets name\n" +
                    "6. Delete client by clients name\n7. Delete client by pets name\n" +
                    "8. Exit\n");
            int x = scan.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("Enter type of pet (cat, dog, mouse): ");
                    String typeOfPet = scan.next();
                    System.out.println("Enter clients name: ");
                    String clientName = scan.next();
                    System.out.println("Enter pets name: ");
                    String petName = scan.next();
                    switch (typeOfPet){
                        case "cat":{
                            if (clinic.addClient(new Client(clientName, new Cat(petName)))){
                                System.out.println("Client successfully added");
                            }
                            else{
                                System.out.println("Client is not added. Try later");
                            }
                            break;
                        }
                        case "dog":{
                            if (clinic.addClient(new Client(clientName, new Dog(petName)))){
                                System.out.println("Client successfully added");
                            }
                            else{
                                System.out.println("Client is not added. Try later");
                            }
                            break;
                        }
                        case "mouse":{
                            if (clinic.addClient(new Client(clientName, new Mouse(petName)))){
                                System.out.println("Client successfully added");
                            }
                            else{
                                System.out.println("Client is not added. Try later");
                            }
                            break;
                        }
                        default: {
                            System.out.println("Sorry, not found info about that pet. Try Later");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter clients name: ");
                    String clientName = scan.next();
                    System.out.println(clinic.findByClientsName(clientName));
                    break;
                }
                case 3:{
                    System.out.println("Enter pets name: ");
                    String petName = scan.next();
                    System.out.println(clinic.findByPetsName(petName));
                    break;
                }
                case 4:{
                    System.out.println("Enter old clients name: ");
                    String oldName = scan.next();
                    System.out.println("Enter new clients name: ");
                    String newName = scan.next();
                    if (clinic.changeClientsName(oldName, newName)){
                        System.out.println("Name successfully changed");
                    }
                    else{
                        System.out.println("Sorry, not found this name");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Enter old pets name: ");
                    String oldName = scan.next();
                    System.out.println("Enter new pets name: ");
                    String newName = scan.next();
                    if (clinic.changePetsName(oldName, newName)){
                        System.out.println("Name successfully changed");
                    }
                    else{
                        System.out.println("Sorry, not found this name");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Enter name for a remove: ");
                    String name = scan.next();
                    if (clinic.deleteClient(name)){
                        System.out.println("Client successfully deleted");
                    }
                    else{
                        System.out.println("Sorry, not found this name");
                    }
                    break;
                }
                case 7:{
                    System.out.println("Enter name for a remove: ");
                    String name = scan.next();
                    if (clinic.deletePet(name)){
                        System.out.println("Client successfully deleted");
                    }
                    else{
                        System.out.println("Sorry, not found this name");
                    }
                    break;
                }
                case 8:{
                    System.out.println("GoodBye");
                    exit = "yes";
                    break;
                }
                default:{
                    System.out.println("Request is not found. Try again");
                }
            }
        }
    }
}
