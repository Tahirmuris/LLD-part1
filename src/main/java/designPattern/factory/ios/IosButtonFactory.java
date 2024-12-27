package designPattern.factory.ios;

import designPattern.factory.Button;
import designPattern.factory.ButtonFactory;

public class IosButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
