package am.ucom.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SalesSupport extends Remote {
    double askInternetPrice() throws RemoteException;
}
