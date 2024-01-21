package ticketPrice;

public class calculatePrice {

    private  int PricePerKm ;
    private  int BasePrice ;
    boolean returnJourney =  false;
    private double discount;

    calculatePrice(int PricePerkm , int BasePrice  , double discount){
        this.PricePerKm = PricePerkm;
        this.discount = discount;
        this.BasePrice = BasePrice;
    }

    public  double getPrice(int distance , boolean returnJourney){
        if (distance < 100)
            return BasePrice;
        double price = 0;
        price = BasePrice + (( distance - 100 ) * PricePerKm);
        if (returnJourney){
            //20 percent discount
            price = 2 * price;
            double discountPrice = (price * discount)/100;
            price = price -  discountPrice;
        }

        return price;
    }
}
