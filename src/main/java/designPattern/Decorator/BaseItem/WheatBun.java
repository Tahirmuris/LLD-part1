package designPattern.Decorator.BaseItem;

import java.util.Optional;

public class WheatBun implements Items {

    private Items nextItem;

    private double price;

    private String name;

    public WheatBun(Items nextItem) {
        this.nextItem = nextItem;
        price = 10;
        name = "WheatBun";
    }

    public WheatBun() {
        price = 10;
        name = "WheatBun";
    }

    @Override
    public Double getPrice() {
        if (Optional.ofNullable(nextItem).isPresent()) {
            return price + nextItem.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        if (Optional.ofNullable(nextItem).isPresent()) {
            return name + ", "  + nextItem.getDescription();
        }
        return name;
    }
}
