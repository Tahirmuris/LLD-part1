package designPattern.factory.mac;

import designPattern.factory.Button;
import designPattern.factory.ButtonFactory;

public class MacButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
