package demo02;

/**
 * Created with Intellij IDEA.
 * Description:
 * User:ruxia
 * Date:2024-04-16
 * Time:{TIME}
 */
public class Computer {
    public void useDevice(IUSB iusb){
        iusb.openDevice();
        iusb.closeDevice();
    }
}

