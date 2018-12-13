package am.ucom.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import am.ucom.common.*;

public class SalesSupportOperator extends UnicastRemoteObject implements SalesSupport {

    public SalesSupportOperator() throws RemoteException {}

    @Override
    public double askInternetPrice() throws RemoteException {
        return 7999.0;
    }
}
