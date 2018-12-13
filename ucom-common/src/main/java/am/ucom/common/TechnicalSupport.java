package am.ucom.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TechnicalSupport extends Remote {
    boolean fixInternet(String problem) throws RemoteException;
    boolean fixTV(String problem) throws RemoteException;
}
