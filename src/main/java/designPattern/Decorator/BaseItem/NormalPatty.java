package designPattern.Decorator.BaseItem;

public class NormalPatty implements Items {

    private Items nextItem;

    private double price;

    private String name;

    public NormalPatty(Items nextItem) {
        this.nextItem = nextItem;
        price = 20;
        name = "Normal patty";
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
