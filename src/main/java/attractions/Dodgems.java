package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    Visitor visitor;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return visitor.getMoney() - 4.5;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return visitor.getMoney() - 2.25;
        } else {
            return defaultPrice();
        }
    }

}