package am.ucom.server;

import am.ucom.common.SalesSupport;
import am.ucom.common.TechnicalSupport;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry supportRegistry = LocateRegistry.createRegistry(1099);

        SalesSupport valodik0 = new SalesSupportOperator();
        TechnicalSupport valodik1 = new TechnicalSupportOperator();

        supportRegistry.bind("0", valodik0);
        supportRegistry.bind("1", valodik1);

        System.out.println("Support has started it's work!!!");
    }
}
