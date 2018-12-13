package am.ucom.client;

import am.ucom.common.SalesSupport;
import am.ucom.common.TechnicalSupport;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        SalesSupport salesSupport = (SalesSupport) Naming.lookup("rmi://127.0.0.1/0");
        TechnicalSupport technicalSupport = (TechnicalSupport) Naming.lookup("rmi://127.0.0.1");

        System.out.println("Internet price is: " + salesSupport.askInternetPrice());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Internet problem");
        String internetProblem = scanner.nextLine();
        System.out.println("Fixed: " + technicalSupport.fixInternet(internetProblem));


        System.out.println("TV problem");
        String tvProblem = scanner.nextLine();
        System.out.println("Fixed: " + technicalSupport.fixTV(tvProblem));



    }
}
