package designPattern.Decorator.BaseItem;

import java.util.Optional;

public class MultiGrainBun implements Items {

    private Items nextItem;

    private double price;

    private String name;

    private MultiGrainBun() {
        price = 10;
        name = "MultiGrainBun";
    }

    public MultiGrainBun(Items nextItem) {
        this.nextItem = nextItem;
        price = 10;
        name = "MultiGrainBun";
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
            return name + ", " + nextItem.getDescription();
        }
        return name;
    }
}
