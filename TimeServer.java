package remrotemi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TimeServer {
    public static void main(String[] args) {
        try {
            TimeService service = new TimeServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.bind("TimeService", service);
            System.out.println("Time server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
