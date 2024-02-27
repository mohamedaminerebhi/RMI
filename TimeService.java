package remrotemi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeService extends Remote {
    String getTime() throws RemoteException;
}




