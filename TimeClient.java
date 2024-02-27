package remrotemi;

import java.rmi.Naming;

import java.rmi.Naming;

public class TimeClient {
    public static void main(String[] args) {
        try {
            TimeService service = (TimeService) Naming.lookup("rmi://localhost/TimeService");
            String time = service.getTime();
            System.out.println("Received time from server: " + time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
