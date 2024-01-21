package ticketPrice;

public class Application {
    public static void main(String [] args){
        calculateDistance dist = new calculateDistance();
        calculatePrice priceLine = new calculatePrice(3,50, 20);

        int distance = dist.getDistance("delhi" , "indore");
        System.out.println(distance);
        double price = priceLine.getPrice( distance ,false);
        System.out.println(price);
    }
}


