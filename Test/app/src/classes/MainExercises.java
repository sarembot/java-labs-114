package classes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class MainExercises {
    public static void main(String[] args) {
      
        Client [] clients = new Client[2];

        clients[0] = new Client(100, "Bob", "2504456232");
        clients[0].addAccount(new Account(111, 14567.65, 4.5));
        clients[0].addAccount(new Account(112, 65567.65, 3.5));


        clients[1] = new Client(200, "Jimbo", "2506789876");
      

        clients[1].addAccount(new Account(113, 14567854.3, 2));
        clients[1].addAccount(new Account(114, 854.3, 9));
        clients[1].addAccount(new Account(115, 4.3, 2.5));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());

        

    }
      }
  