package remrotemi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeServiceImpl extends UnicastRemoteObject implements TimeService {
    protected TimeServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String getTime() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        return "Current time is: " + sdf.format(now);
    }
}
