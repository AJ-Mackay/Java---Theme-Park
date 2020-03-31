package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {


    Visitor visitor;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145;
    }

    @Override
    public double defaultPrice() {
        return visitor.getMoney() - 8.4;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 200){
        return visitor.getMoney() - 16.8;
    } else {
            return defaultPrice();
        }
    }

}
