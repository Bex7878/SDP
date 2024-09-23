public class Button {
    private Switchable device;

    public Button(Switchable device) {
        this.device = device;
    }

    public void press() {
        device.turnOn();
    }
    public void release() {
        device.turnOff();
    }
}
