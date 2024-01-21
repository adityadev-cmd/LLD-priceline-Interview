package ticketPrice;

import java.util.HashMap;
import java.util.Map;

public class calculateDistance {

    static Map <String ,Integer> stations = new HashMap<>();
        static {
            stations.put("delhi", 100);
            stations.put("mathura", 200);
            stations.put("agra", 300);
            stations.put("gwalior", 400);
            stations.put("shivpuri", 500);
            stations.put("guna", 600);
            stations.put("dewas", 700);
            stations.put("indore", 800);
        }

    public int getDistance(String SourceStation , String DestinationStation){

        int startpt = stations.get(SourceStation);
        int endpt = stations.get(DestinationStation);

        int totalDistance = endpt - startpt;
        return (totalDistance);
    }
}
