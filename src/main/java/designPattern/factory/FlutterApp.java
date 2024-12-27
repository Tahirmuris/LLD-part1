package designPattern.factory;

import designPattern.factory.ios.IosButtonFactory;
import designPattern.factory.mac.MacButtonFactory;

public class FlutterApp {

    private String appName;

    private String TextBox;

    private ButtonFactory buttonfactory;

    private PlatForm platForm;

    FlutterApp(PlatForm platForm) {
        this.platForm = platForm;
    }


    public ButtonFactory getButtonFactory() {
        if (PlatForm.MAC.equals(this.platForm)) {
            return new MacButtonFactory();
        } else {
            return new IosButtonFactory();
        }
    }
}
