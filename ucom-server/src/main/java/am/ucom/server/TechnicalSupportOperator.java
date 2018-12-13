package am.ucom.server;

import am.ucom.common.TechnicalSupport;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TechnicalSupportOperator extends UnicastRemoteObject implements TechnicalSupport {


    protected TechnicalSupportOperator() throws RemoteException {
    }

    @Override
    public boolean fixInternet(String problem) throws RemoteException {
        System.out.println("Client called with internet problem: " + problem);
        return fixProblem(problem);
    }

    @Override
    public boolean fixTV(String problem) throws RemoteException {
        System.out.println("Clinet called wiht TV problem: " + problem);
        return fixProblem(problem);
    }

    private boolean fixProblem(String problem) {
        return problem.length() <= 30;
    }
}
