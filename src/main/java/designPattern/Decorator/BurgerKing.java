package designPattern.Decorator;

import designPattern.Decorator.BaseItem.ChickenPatty;
import designPattern.Decorator.BaseItem.Items;
import designPattern.Decorator.BaseItem.Ketchup;
import designPattern.Decorator.BaseItem.WheatBun;

public class BurgerKing {


    public static void main(String[] args) {

        Items burger = new WheatBun(
                new Ketchup(
                        new ChickenPatty(
                                new Ketchup(
                                        new WheatBun()
                                ))));

        System.out.println("burger.getDescription() = " + burger.getDescription());
        System.out.println("burger = " + burger.getPrice());
    }
}
