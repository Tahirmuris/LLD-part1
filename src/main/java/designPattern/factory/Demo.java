package designPattern.factory;

public class Demo {

    public static void main(String[] args) {

        FlutterApp flutterApp = new FlutterApp(PlatForm.IOS);
        ButtonFactory buttonFactory = flutterApp.getButtonFactory();

        Button button = buttonFactory.createButton();

    }
}
