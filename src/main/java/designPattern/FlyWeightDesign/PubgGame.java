package designPattern.FlyWeightDesign;

import com.sun.xml.internal.ws.encoding.xml.XMLMessage;

public class PubgGame {

    public class Bullet {
        Double[] sourceAxis;
        Double[] targetAxis;
        BulletType bulletType;
    }

    //singleTone class
    public class BulletType {
        String size;
        String type;
        int amount;
        double damage;
        XMLMessage.XMLMultiPart image;
    }

}
