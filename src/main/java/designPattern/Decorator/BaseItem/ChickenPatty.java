package designPattern.Decorator.BaseItem;

public class ChickenPatty implements Items {

    private Items nextItem;

    private double price;

    private String name;

    public ChickenPatty(Items nextItem) {
        this.nextItem = nextItem;
        price = 10;
        name = "Chicken patty";
    }

    @Override
    public Double getPrice() {
        return price + nextItem.getPrice();
    }

    @Override
    public String getDescription() {
       return name + ", " + nextItem.getDescription();
    }
}
