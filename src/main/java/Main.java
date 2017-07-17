import java.util.List;

import dao.ClientDao;
import model.Client;

public class Main
{

    public static void main(String[] args)
    {
        // Tests Application DATA
        
        // TU#1 Bean Client
        System.out.println("------TU#1---------");
        
        Client client = new Client();
        client.setId(1);
        client.setPrenom("James");
        client.setNom("Patagueule");
        client.setEmail("adresse@mail.com");
        client.setNumeroTel("0606060606");
        
        System.out.println(client);

        // TU#2.1 DAO - 1 client de la bdd
        System.out.println("------TU#2.1---------");
        ClientDao clientDao = new ClientDao();
        Client clientSeul = clientDao.findById(1);
        System.out.println(clientSeul);
        
        // TU#2.2 DAO - Tous les clients de la bdd
        System.out.println("------TU#2.2---------");
        List<Client> listeClient = clientDao.findAll();
        System.out.println(listeClient);
        
    }

}
