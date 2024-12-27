package designPattern.Decorator.BaseItem;

public class Ketchup implements Items {
    private Items nextItem;

    private double price;

    private String name;

    public Ketchup(Items nextItem) {
        this.nextItem = nextItem;
        price = 10;
        name = "Ketchup";
    }

    @Override
    public Double getPrice() {
        return price + nextItem.getPrice();
    }

    @Override
    public String getDescription() {
        return name + " ," + nextItem.getDescription();
    }
}
